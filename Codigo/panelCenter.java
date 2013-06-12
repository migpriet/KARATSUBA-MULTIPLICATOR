
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;





public class panelCenter extends JPanel{

	private JLabel jlabNumero1;
    private JLabel jlabNumero2;
    private JLabel jlabResultado;
    
    
    private static JTextField jtxtNumero1;
    private static JTextField jtxtNumero2;
    private static JTextField jtxtResultado;

	
	public panelCenter(){
		setLayout( new GridBagLayout( ) ); 
		
        GridBagConstraints gbc = new GridBagConstraints();
        setBorder( new CompoundBorder( new EmptyBorder( 0, 0, 0, 0 ), new TitledBorder( "Datos" ) ) );
        
        

        jlabNumero1 = new JLabel("Primer Numero :" );
        gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jlabNumero1, gbc );
        
        jtxtNumero1 = new JTextField(30);
        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        jtxtNumero1.setEnabled( true);
        add( jtxtNumero1, gbc );
       
        
        
        
        jlabNumero2 = new JLabel("Segundo Numero :" );
        gbc = new GridBagConstraints( 0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jlabNumero2, gbc );
        	
        jtxtNumero2 = new JTextField(30);
        gbc = new GridBagConstraints( 1, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 5, 5, 5, 5 ), 0, 0 );
        jtxtNumero2.setEnabled( true );
        add( jtxtNumero2, gbc );
        
               
        jlabResultado = new JLabel("Resultado :" );
        gbc = new GridBagConstraints( 0, 3, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jlabResultado, gbc );
              
        jtxtResultado = new JTextField(30);
        gbc = new GridBagConstraints( 1, 3, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        jtxtResultado.setEnabled( true );
        add( jtxtResultado, gbc );
           
       
	}

		public static BigInteger getNumero1(){
			
			return	new BigInteger(jtxtNumero1.getText()); 
			
		}
		
		public static BigInteger getNumero2(){
			
			return	new BigInteger(jtxtNumero2.getText()); 
			
		}
		
		public static void setNumero1(BigInteger a){
			jtxtNumero1.setText(a.toString());
		}
		
		public static void setNumero2(BigInteger a){
			jtxtNumero2.setText(a.toString());
		}
				
		public static void total(BigInteger a){
			jtxtResultado.setText(a.toString());		
		}
		
		public static void borrar(){
			jtxtNumero1.setText("");
			jtxtNumero2.setText("");
			jtxtResultado.setText("");		
		}
}
