package AtendimentoMedico;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Criação do médico
        LocalDate dataMedico = LocalDate.parse("01/11/1980", formatter);
        Medico medico = new Medico(dataMedico, "Nome Médico");
        medico.setEspecialidade(new Especialidade("Clínico General"));

        // Criação do paciente
        LocalDate dataPaciente = LocalDate.parse("14/02/2000", formatter);
        Paciente paciente = new Paciente(dataPaciente, "Nome Paciente");

        // Criação do objeto para fazer perguntas
        PerguntasOrdem pergunta = new PerguntasOrdem();
        pergunta.RespondePerguntas(entrada);

        // Criação do primeiro atendimento
        LocalDateTime inicio = LocalDateTime.parse("20/08/2022 11:30", formatterTime);
        Atendimento atendimento = new Atendimento(inicio, 1, paciente, pergunta.getRespostas());

        // Criação da lista de atendimentos e adição do primeiro atendimento
        ListaAtendimento listaA = new ListaAtendimento();
        listaA.addLista(atendimento);

        // Criação do segundo paciente
        LocalDate dataPaciente2 = LocalDate.parse("14/02/2001", formatter);
        Paciente paciente2 = new Paciente(dataPaciente2, "Nome Paciente Dois");

        // Responder perguntas para o segundo paciente
        pergunta.RespondePerguntas(entrada);

        // Criação do segundo atendimento
        LocalDateTime inicio2 = LocalDateTime.parse("22/08/2022 11:30", formatterTime);
        Atendimento atendimento2 = new Atendimento(inicio2, 1, paciente2, pergunta.getRespostas());
        listaA.addLista(atendimento2);

        // Mostra a lista de atendimentos
        List<Atendimento> lista = listaA.mostraLista();
        System.out.println("Lista de Atendimentos:");
        System.out.println(lista.toString());

        // Configuração de informações adicionais para o segundo atendimento
        LocalDateTime fim = LocalDateTime.parse("22/08/2022 12:30", formatterTime);
        atendimento2.setFim(fim);
        atendimento2.setMedico(medico);
        atendimento2.setEstado(2);

        // Emissão do atestado médico
        AtestadoMedico atestado = new AtestadoMedico(inicio2, fim, 1);
        System.out.println("Emissão do atestado:");
        System.out.println(atestado.emitirAtestado(atendimento2));

        entrada.close();
    }
}