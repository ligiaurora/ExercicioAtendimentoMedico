package AtendimentoMedico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaAtendimento {
    private List<Atendimento> atendimento;

    public ListaAtendimento() {
        this.atendimento = new ArrayList<Atendimento>();
    }

    public void addLista(Atendimento atendimento) {
        this.atendimento.add(atendimento);
    }

    public List<Atendimento> mostraLista() {
        Collections.sort(this.atendimento);
        return this.atendimento;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaAtendimento [atendimento=");
		builder.append(atendimento);
		builder.append("]");
		return builder.toString();
	}
    
}