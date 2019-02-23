import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OperacionesConvertir{
	
	public double convertirCentigradosAFaherenheit(double grados) {
		return (grados*1.8)+32;
	}
	
	public double convertirCentigradosAKelvin(double grados) {
		return grados+273.15;
	}
	
	public double convertirCentigradosARankie(double grados) {
		return (grados *(9/5))+491.67;
	}
	
	public double convertirFaherenheitACentigrados(double grados) {
		return (grados *(9/5))+32;
	}
	
	public double convertirFaherenheitAKelin(double grados) {
		return ((32*grados)-32)*((5/9)+273.15);
	}
	
	public double convertirFaherenheitARankie(double grados) {
		return grados+459.67;
	}
	
	public double convertirKelvinACentigrados(double grados) {
		return grados-273.15;
	}
	
	public double convertirKelvinAFaherenheit(double grados) {
		return (grados-273.15)* ((9/5)+32) ;
	}
	
	public double convertirKelvinARankie(double grados) {
		return grados*1.8;
	}
	
	public double convertirRankieACentigrados(double grados) {
		return ((grados-491.67)*(5/9));
	}
	
	public double convertirRankieAFaherenheit(double grados) {
		return grados-459.67;
	}
	
	public double convertirRankieAKelvin(double grados) {
		return grados*(5/9);
	}
}

class Conversor extends JFrame implements ActionListener{
	
	JComboBox<String> comboConvertir , comboR;
	
	JTextField cajaConvertir, cajaResultado;
	
	public Conversor() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(new JLabel("Convertir: "));
		
		cajaConvertir = new JTextField(5);
		add(cajaConvertir);
		
		String vectorGrados[] = {"Centigrados", "Fahrenheit", "Kelvin", "Rankie"};
		
		comboConvertir= new JComboBox<String>(vectorGrados);
		comboConvertir.addActionListener(this);
		add(comboConvertir);
		
		add(new JLabel("A: "));
		String vectorResultado[] = {"Centigrados", "Fahrenheit", "Kelvin", "Rankie"};
		
		comboR= new JComboBox<String>(vectorResultado);
		comboR.addActionListener(this);
		add(comboR);
		
		cajaResultado = new JTextField(5);
		add(cajaResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		double dato =  Double.parseDouble(cajaConvertir.getText());
		OperacionesConvertir oc = new OperacionesConvertir();
		String vectorGrados[] = {"Centigrados", "Fahrenheit", "Kelvin", "Rankie"};
		String vC[] = {"Fahrenheit", "Kelvin", "Rankie"};
		String vF[] = {"Centigrados", "Kelvin", "Rankie"};
		String vK[] = {"Centigrados", "Fahrenheit", "Rankie"};
		String vR[] = {"Centigrados", "Fahrenheit", "Kelvin"};
		if(e.getSource() == comboConvertir ) {
			comboR.removeAllItems(); /*limpiar */
			
			if(comboConvertir.getSelectedItem().equals("Centigrados")) {
				
				for(String x :vC) 
				comboR.addItem(x);
				
				if (comboR.getSelectedItem().equals("Fahrenheit")) {
					oc.convertirCentigradosAFaherenheit(dato);
					cajaResultado.setText(String.valueOf(oc.convertirCentigradosAFaherenheit(dato)));	
				}else if (comboR.getSelectedItem().equals("Kelvin")) {
					oc.convertirCentigradosAKelvin(dato);
					cajaResultado.setText(String.valueOf(oc.convertirCentigradosAKelvin(dato)));	
				}else if (comboR.getSelectedItem().equals("Rankie")) {
					oc.convertirCentigradosARankie(dato);
					cajaResultado.setText(String.valueOf(oc.convertirCentigradosARankie(dato)));	
				}
				
			
		}else
			
			if(comboConvertir.getSelectedItem().equals("Fahrenheit")) {
				comboR.removeAllItems(); /*limpiar */
				for(String x :vF) 
				comboR.addItem(x);
				if (comboR.getSelectedItem().equals("Centigrados")) {
					oc.convertirFaherenheitACentigrados(dato);
					cajaResultado.setText(String.valueOf(oc.convertirFaherenheitACentigrados(dato)));	
				}else if (comboR.getSelectedItem().equals("Kelvin")) {
					oc.convertirFaherenheitAKelin(dato);
					cajaResultado.setText(String.valueOf(oc.convertirFaherenheitAKelin(dato)));	
				}else if (comboR.getSelectedItem().equals("Rankie")) {
					oc.convertirFaherenheitARankie(dato);
					cajaResultado.setText(String.valueOf(oc.convertirFaherenheitARankie(dato)));	
				}
		}else
			
			if(comboConvertir.getSelectedItem().equals("Kelvin")) {
				comboR.removeAllItems(); /*limpiar */
				for(String x :vK) 
				comboR.addItem(x);
				
				if (comboR.getSelectedItem().equals("Centigrados")) {
					oc.convertirKelvinACentigrados(dato);
					cajaResultado.setText(String.valueOf(oc.convertirKelvinACentigrados(dato)));	
				}else if (comboR.getSelectedItem().equals("Fahrenheit")) {
					oc.convertirKelvinAFaherenheit(dato);
					cajaResultado.setText(String.valueOf(oc.convertirKelvinAFaherenheit(dato)));	
				}else if (comboR.getSelectedItem().equals("Rankie")) {
					oc.convertirKelvinARankie(dato);
					cajaResultado.setText(String.valueOf(oc.convertirKelvinARankie(dato)));	
				}
			
		}else if(comboConvertir.getSelectedItem().equals("Rankie")) {
				comboR.removeAllItems(); /*limpiar */
				
				for(String x :vR) 
				comboR.addItem(x);
				if (comboR.getSelectedItem().equals("Centigrados")) {
					oc.convertirRankieACentigrados(dato);
					cajaResultado.setText(String.valueOf(oc.convertirRankieACentigrados(dato)));	
				}else if (comboR.getSelectedItem().equals("Kelvin")) {
					oc.convertirRankieAKelvin(dato);
					cajaResultado.setText(String.valueOf(oc.convertirRankieAKelvin(dato)));	
				}else if (comboR.getSelectedItem().equals("Fahrenheit")) {
					oc.convertirRankieAFaherenheit(dato);
					cajaResultado.setText(String.valueOf(oc.convertirRankieAFaherenheit(dato)));	
			}
		}
		
	}
}
	
}
public class Prueba {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Conversor ();
				
			}
		});

	}

}
