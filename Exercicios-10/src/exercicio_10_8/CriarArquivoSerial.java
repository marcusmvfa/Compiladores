/*
ObejctInputStream in;

	in = new ObejctInputStream(new FileInputStream("Nome"));
	
	Politicos p;
	p = new Politico(...);
	
	out.writeObject(p);
	
	p = (Politico) in.readObject();
*/
package exercicio_10_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import edu.udc.psw.Politico;
import exercicio_10_4.Ponto2D;

public class CriarArquivoSerial {
	Ponto2D ponto = new Ponto2D();
	private ObjectOutputStream out;
	
	public void open() {
		try {
			out = new ObjectOutputStream(new FileOutputStream("c:\\Users\\Marcus\\ArquivosPSW\\SerialPonto2D.txt"));
		}
		catch(IOException e) {
			
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void adicionaRegistro() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" + 
						"ou <ctrl> Z no Windows.\n\n");
		
		System.out.println("Informe coordenadas do ponto:");
		
		while(sc.hasNext()) {							//La�o � encerrado ao ler EOF (fim do arquivo)
			ponto.setX(sc.nextDouble());
			ponto.setY(sc.nextDouble());
			
			System.out.println("Pressione ctrl + z \n");
			if(ponto.getX() > -1 || ponto.getY() > -1) {
				try {
					out.writeObject(ponto);			//Adiciona ao arquivo
				} catch (IOException e) {
					e.printStackTrace();			//sequencia de chamadas at� onde encontrou o erro (primeiro passo para debugar)
					System.exit(0);
				}
			} else {
				System.out.println("O numero deve ser igual ou maior que 0.");
			}
		}
		//out.writeObject(politico);
	}
	
	public void closeFile() {
		if(out != null) {
			try {
				out.close();
				out = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}