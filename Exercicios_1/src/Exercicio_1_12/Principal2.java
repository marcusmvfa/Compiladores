package Exercicio_1_12;

public class Principal2 {

	public static void main(String[] args) {      //Composi��o - quando destr�i um dos objetos, todo o objeto � destru�do
		DataHora dh = new DataHora();			  //Agrega��o - quando se destr�i, os outros objetos ainda existem
		
		System.out.println(dh);

	}

}
