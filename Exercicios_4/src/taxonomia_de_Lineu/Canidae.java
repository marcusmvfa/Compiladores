package taxonomia_de_Lineu;

public class Canidae extends Carnivora{
	private String familia = "Caniadae";
	
	public String obterDescricao() {
		return String.format("%s\nFam�lia: %s",super.obterDescricao(), familia);
	}
}
