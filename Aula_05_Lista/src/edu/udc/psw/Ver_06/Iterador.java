package edu.udc.psw.Ver_06;				

public interface Iterador<T> {				//� com ele que posso andar na lista sem fazer com que ande em todos os elementos da lista
	T getObject();					//Todos os metodosda interface s�o abstratos
	T proximo();
	T anterior();
}
//////////////////////////////PADRAO ITERADOR
//COM O ITERADOR TEMOS ACESSO APENAS AOS DADOS DO N� E N�O AO N�, DESSA FORMA N�O COLOCA EM RISCO A ESTRUTURA EM QUEST�O