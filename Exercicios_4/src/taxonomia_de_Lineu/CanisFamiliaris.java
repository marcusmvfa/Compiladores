package taxonomia_de_Lineu;

public class CanisFamiliaris extends Canis{
	private String especie = "Canis Familiris";
	
	public String obterDescricao() {
		return String.format("%s\nEsp�cie: %s",super.obterDescricao(), especie);
	}
}
