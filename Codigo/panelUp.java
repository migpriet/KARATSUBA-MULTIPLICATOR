

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class panelUp extends JPanel {
	
	private JLabel jlabNombre;
	
    
    public panelUp(){
    	
    	
    	
    	setLayout( new FlowLayout( ) );
    	setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( "Descripcion" ) ) );
    
    	jlabNombre = new JLabel( "El algoritmo de Karatsuba es un procedimiento para multiplicar dos números grandes eficientemente");
        add( jlabNombre );
        
    
    }

}
