package AtendimentoMedico;

public class Especialidade {
	private String descricaoEspecialidade;

	public Especialidade(String descricaoEspecialidade) {
		setDescricaoEspecialidade(descricaoEspecialidade);
	}
	

	public String getDescricaoEspecialidade() {
		return descricaoEspecialidade;
	}

	public void setDescricaoEspecialidade(String descricaoEspecialidade) {
		this.descricaoEspecialidade = descricaoEspecialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [descricaoEspecialidade=");
		builder.append(descricaoEspecialidade);
		builder.append("]");
		return builder.toString();
	}
}
