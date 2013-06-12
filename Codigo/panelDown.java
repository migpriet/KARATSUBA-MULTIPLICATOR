

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class panelDown extends JPanel implements ActionListener{

	 private JButton jbtonCalcular;
	 private JButton jbtonBorrar;
	 private JButton jbtonNumAu;
	 private JButton jbtonAcercaDe;
	 
	 
	 public panelDown(){
		
		setLayout( new GridBagLayout( ) ); 
		 
		GridBagConstraints gbc = new GridBagConstraints();
	    setBorder( new CompoundBorder( new EmptyBorder( 2, 0, 0, 0 ), new TitledBorder( "Calculos" ) ) );
	    
	    
	    jbtonCalcular = new JButton( );
	    jbtonCalcular.setText( "Calcular" );
	    gbc = new GridBagConstraints( 0, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
	    add( jbtonCalcular, gbc );
	    jbtonCalcular.addActionListener(this);
        
	    jbtonBorrar = new JButton( );
	    jbtonBorrar.setText( "Borrar Todo" );
        gbc = new GridBagConstraints( 1, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jbtonBorrar,gbc);
        jbtonBorrar.addActionListener(this);
        
	    
        jbtonNumAu = new JButton( );
        jbtonNumAu.setText( "Numeros Automaticos" );
        gbc = new GridBagConstraints( 2, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jbtonNumAu,gbc );
        jbtonNumAu.addActionListener(this);
		 
        jbtonAcercaDe = new JButton( );
        jbtonAcercaDe.setText( "Acerca de" );
        gbc = new GridBagConstraints( 3, 0, 1, 1, 0, 0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 4, 4, 4, 4 ), 0, 0 );
        add( jbtonAcercaDe,gbc );
        jbtonAcercaDe.addActionListener(this);
        
       
	 }


		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==jbtonCalcular){
				panelCenter.total(Karatsuba.multKaratsuba(panelCenter.getNumero1(),panelCenter.getNumero2()));
				}
						
			if (e.getSource()==jbtonBorrar){
				panelCenter.borrar();
			}
			
			if (e.getSource()==jbtonNumAu){
				
				panelCenter.setNumero1( Karatsuba.numeroAlAzar());
				panelCenter.setNumero2( Karatsuba.numeroAlAzar());
			}
			
			if (e.getSource()==jbtonAcercaDe){
				
				
				JOptionPane.showMessageDialog(null,"Karatsuba Calculator by Miguel Prieto"+"\n"+"" +
													"            Celular: 321 275 0461		"+"\n"+"" +
													"                   Junio 2013				");
				
				
				
			}
			
		}
		
			
}
