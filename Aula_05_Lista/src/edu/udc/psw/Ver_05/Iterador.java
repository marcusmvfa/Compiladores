package edu.udc.psw.Ver_05;				

public interface Iterador {				//� com ele que posso andar na lista sem fazer com que ande em todos os elementos da lista
	Object getObject();					//Todos os metodosda interface s�o abstratos
	Object proximo();
	Object anterior();
}
//////////////////////////////PADRAO ITERADOR
//COM O ITERADOR TEMOS ACESSO APENAS AOS DADOS DO N� E N�O AO N�, DESSA FORMA N�O COLOCA EM RISCO A ESTRUTURA EM QUEST�O