package edu.udc.psw.desenho.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import edu.udc.psw.desenho.Aplicacao;
import edu.udc.psw.desenho.Documento;
import edu.udc.psw.desenho.formas.FormaGeometrica;
import edu.udc.psw.desenho.formas.Ponto;
import edu.udc.psw.util.Iterator;

public class PainelDesenho extends JPanel implements MouseListener, MouseMotionListener, PainelOuvinteFormas   {
	private static final long serialVersionUID = 1L;
	private JLabel status;

	private Documento doc;
	
	private FormaGeometrica novaForma;
	
	public PainelDesenho(JLabel status, Documento doc) {
		this.status = status;
		this.doc = doc;
		
		this.novaForma = null;
		
		addMouseListener( this );                          
	    addMouseMotionListener( this );
	    
		// trata evento de movimento de mouse do frame
		addMouseMotionListener(

				new MouseMotionAdapter()// classe interna an�nima
				{
					// armazena coordenadas de arrastar e repinta
					public void mouseDragged(MouseEvent event) {
						if(novaForma == null)
							return;
						if(novaForma.getClass().equals(Ponto.class))
							doc.inserir(new Ponto(event.getPoint().x, 
											event.getPoint().y) ); // localiza o ponto
							//repaint(); // repinta JFrame
					}
				});
	}
	
	public void formasAlteradas() {
		repaint();
	}

	// desenha oval em um quadro delimitador de 4x4 no local especificada na janela
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // limpa a �rea de desenho

		Iterator<FormaGeometrica> it = doc.getIterator();
		FormaGeometrica formas;
		//Ponto ponto;
		while((formas = it.next()) != null) {
			formas.desenhar(g);
			//g.fillOval(formas.x, formas.y, 4, 4);
		}
		formasAlteradas();
		
//		for(Ponto p : lista)
//			g.fillOval(p.x, p.y, 4, 4);
	}
	
	public void novaForma(FormaGeometrica forma) {
		this.novaForma = forma;
	}
	
	// Handlers de evento de MouseListener
    // trata evento quando o mouse � liberado logo depois de pressionado
    public void mouseClicked( MouseEvent event )
    {
       status.setText( String.format( "Clicked at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
    }

    // trata evento quando mouse � pressionado
    public void mousePressed( MouseEvent event )
    {
       status.setText( String.format( "Pressed at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
    }

    // trata evento quando mouse � liberado depois da opera��o de arrastar
    public void mouseReleased( MouseEvent event )
    {
       status.setText( String.format( "Released at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
    }

    // trata evento quando mouse entra na �rea
    public void mouseEntered( MouseEvent event )
    {
       status.setText( String.format( "Mouse entered at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
       setBackground( Color.GREEN );
    } 

    // trata evento quando mouse sai da �rea
    public void mouseExited( MouseEvent event )
    {
       status.setText( String.format( "Mouse outside JPanel - Total pontos %d", 
    		   doc.getListSize() ) );
       setBackground( Color.WHITE );
    }

    // Handlers de evento de MouseMotionListener
    // trata evento quando usu�rio arrasta o mouse com o bot�o pressionado
    public void mouseDragged( MouseEvent event )
    {
       status.setText( String.format( "Dragged at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
    } 

    // trata evento quando usu�rio move o mouse
    public void mouseMoved( MouseEvent event )
    {
       status.setText( String.format( "Moved at [%d, %d] - Total pontos %d", 
          event.getX(),event.getY(), doc.getListSize() ) );
    }
}
