package taxonomia_de_Lineu;

public class Hominidae extends Primata{
	private String familia = "Hominidae";
	
	public String obterDescricao() {
		return String.format("%s\nFam�lia: %s",super.obterDescricao(), familia);
	}
}
