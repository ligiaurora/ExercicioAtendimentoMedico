package AtendimentoMedico;
import java.util.Arrays;
import java.util.Scanner;

public class PerguntasOrdem {
	private String[] perguntas;
	private boolean[] respostas;
	
	public PerguntasOrdem() {
		String[] perguntas = {
			"Está com febre?",
			"Vomitou ou teve diarreia?",
			"Possui pressão alta?",
			"Possui Diabetes?",
			"Faz uso de algum medicamento continuo?"	
		};
		setPerguntas(perguntas);
	}

	public String[] getPerguntas() {
		return perguntas;
	}
	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}
	public boolean[] getRespostas() {
		return respostas;
	}
	public void setRespostas(boolean[] respostas) {
		this.respostas = respostas;
	}
	
	 public void RespondePerguntas(Scanner entrada) {
	        boolean[] respostas = new boolean[perguntas.length];

	        String resposta;
	        System.out.println("Responda as seguintes perguntas com sim ou não?");
	        for (int i = 0; i < perguntas.length; i++) {
	            System.out.println(perguntas[i]);
	            resposta = entrada.nextLine().toLowerCase();
	            if (resposta.equals("sim")) {
	                respostas[i] = true;
	            } else if (resposta.equals("não") || resposta.equals("nao")) { 
	                respostas[i] = false;
	            } else {
	                System.out.println("Resposta inválida. Por favor, responda apenas com 'sim' ou 'não'.");
	                i--;
	            }
	        }
	        this.setRespostas(respostas);
	    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PerguntasOrdem [perguntas=");
		builder.append(Arrays.toString(perguntas));
		builder.append(", respostas=");
		builder.append(Arrays.toString(respostas));
		builder.append("]");
		return builder.toString();
	}
}