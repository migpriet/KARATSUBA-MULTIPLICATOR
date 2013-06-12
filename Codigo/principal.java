

import java.awt.BorderLayout;
import java.math.BigInteger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class principal extends JFrame{

	


	
	public principal(){
		
		setTitle( "Karatsuba Calculator by Miguel Prieto" );

        // construir los paneles
		 JPanel panelArriba = new JPanel( );
        JPanel panelMedio = new JPanel( );
        JPanel panelBajo = new JPanel( );
       
        JPanel panelUp = new panelUp();
        JPanel panelCenter = new panelCenter();
        JPanel panelDown = new panelDown();
        
        getContentPane( ).setLayout( new BorderLayout( ) );
        getContentPane( ).add( panelArriba, BorderLayout.NORTH );
        getContentPane( ).add( panelMedio, BorderLayout.CENTER );
        getContentPane( ).add( panelBajo, BorderLayout.SOUTH );
      
        panelArriba.setLayout( new BorderLayout( ) );
        panelArriba.add( panelUp, BorderLayout.NORTH );

        panelMedio.setLayout( new BorderLayout( ) );
        panelMedio.add( panelCenter, BorderLayout.CENTER );
        
        panelBajo.setLayout( new BorderLayout( ) );
        panelBajo.add( panelDown, BorderLayout.SOUTH);

        setSize( 700,500 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		principal p = new principal ();
	
		
	}

}
