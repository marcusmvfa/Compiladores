package edu.udc.psw.desenho.formas;

import edu.udc.psw.desenho.formas.manipulador.ManipuladorFormaGeometrica;
import edu.udc.psw.desenho.formas.manipulador.ManipuladorLinha;

import java.awt.Graphics;

import edu.udc.psw.desenho.formas.Ponto;

public class Linha implements FormaGeometrica {
	private Ponto a = null;
	private Ponto b = null;
	
	public Linha(){
		a = new Ponto();
		b = new Ponto();
	}

	public Linha(Ponto a, Ponto b) {
		this.a = a;
		this.b = b;
	}
	
	public Linha(int ax, int ay, int bx, int by){
		a = new Ponto(ax, ay);
		b = new Ponto(bx, by);
	}
	
	
	@Override
	public Linha clone() {
		return new Linha();
	}

	public double comprimento(){
		return a.distancia(b);
	}
	
	public Ponto centro(){
		Ponto m = new Ponto((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2);
		return m;
	}
	
	public double base(){
		if(a.getX() < b.getX())
			return b.getX() - a.getX();
		return a.getX() - b.getX();
	}
	
	public double altura(){
		if(a.getY() < b.getY())
			return b.getY() - a.getY();
		return a.getY() - b.getY();
	}
	
	public Ponto getA() {
		return a;
	}

	public Ponto getB() {
		return b;
	}

	public void setA(Ponto a) {
		this.a = a;
	}

	public void setB(Ponto b)  {
		this.b = b;
	}

	@Override
	public String toString(){
		return a.toString() + b.toString();
	}

	@Override
	public void desenhar(Graphics g) {
		g.drawLine(a.x, a.y, b.x, b.y);
		
	}
	
	public static Linha fabricarLinha(String linha) {
		int i = linha.indexOf(' ');
		int x = Integer.parseInt(linha.substring(0, i));
		linha = linha.substring(i + 1);
		i = linha.indexOf(' ');
		int y = Integer.parseInt(linha.substring(0, i));
		
		Ponto a = new Ponto(x, y);
		linha = linha.substring(i+1);
		i = linha.indexOf(' ');
		x = Integer.parseInt(linha.substring(0, i));
		y = Integer.parseInt(linha.substring(0, i));
		Ponto b = new Ponto(x,y);
		
		return new Linha(a, b);
		
	}

}
