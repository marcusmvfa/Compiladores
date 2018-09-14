package exercicio_1_7;

public class Encapsula_Contador {//Escopo determina aonde determinado elemento � v�lido
	private int cont;			 //Interface s�o m�todos que podem ser acessados de fora da classe
	
	public Encapsula_Contador() {
		cont = 0;
	}
	
	public void incrementar() {
		cont++;
	}
	void zerar() {				 //Visibilidade de pacote(visto apenas dentro do pacote
		cont = 0;				 //Classe seria o conceito, a ideia de algo
	}							 //Objeto seria a materializa��o
	public int retornaValor() {
		return cont;
	}
}
