import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

interface UnitValue{
	
	int distance = 0;
}
class Convert implements UnitValue{
	
	double distance;
	
	public Convert(double distance ) {
		
		this.distance = distance;
	}
	
	public double mmTOcm(double d) {
		return d*0.1;
	}
	public double mmTOm(double d) {
		return d*0.001;
	}
	public double mmTOdm(double d) {
		return d*0.01;
	}
	public double mmTOkm(double d) {
		return d*0.000001;
	}
	//Conversion of centimeters to other unit lengths
	public double cmTOmm(double d) {
		return d*10;
	}
	public double cmTOm(double d) {
		return d*0.01;
	}
	public double cmTOdm(double d) {
		return d*0.1;
	}
	public double cmTOkm(double d) {
		return d*0.00001;
	}
	//Conversion of meters to other unit lengths
	public double mTOmm(double d) {
		return d*1000;
	}
	public double mTOcm(double d) {
		return d*100;
	}
	public double mTOdm(double d) {
		return d*10;
	}
	public double mTOkm(double d) {
		return d*0.001;
	}
	//Conversion of decimeters to other unit lengths
	public double dmTOmm(double d) {
		return d*100;
	}
	public double dmTOcm(double d) {
		return d*10;
	}
	public double dmTOm(double d) {
		return d*0.1;
	}
	public double dmTOkm(double d) {
		return d*0.0001;
	}
	//Conversion of kilometers to other unit lengths
	public double kmTOmm(double d) {
		return d*1000000;
	}
	public double kmTOcm(double d) {
		return d*100000;
	}
	public double kmTOdm(double d) {
		return d*10000;
	}
	public double kmTOm(double d) {
		return d*1000;
	}
}
public class Unit extends JFrame {

	private JPanel contentPane;
	private JTextField typeText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unit frame = new Unit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Unit() {
		super("Unit Converter");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblname = new JLabel("Name Of Car");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblname.setBounds(30, 48, 176, 26);
		contentPane.add(lblname);
		
		JLabel lblCarName = new JLabel("Mercedes-Benz");
		lblCarName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCarName.setBounds(316, 48, 230, 26);
		contentPane.add(lblCarName);
		
		JLabel lblmodel = new JLabel("Model");
		lblmodel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblmodel.setBounds(30, 125, 176, 39);
		contentPane.add(lblmodel);
		
		JLabel lblmodelName = new JLabel("A-Class");
		lblmodelName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblmodelName.setBounds(316, 129, 230, 35);
		contentPane.add(lblmodelName);
		
		JLabel lblMileage = new JLabel("Mileage");
		lblMileage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMileage.setBounds(30, 213, 176, 39);
		contentPane.add(lblMileage);
		
		JComboBox comboBox = new JComboBox();		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"cm", "mm", "m", "dm", "km"}));
		comboBox.setEditable(true);
		comboBox.setBounds(417, 224, 54, 26);
		contentPane.add(comboBox);
		
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Cambria Math", Font.PLAIN, 10));
		btnOK.setBounds(281, 346, 97, 26);
		contentPane.add(btnOK);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"cm", "mm", "m", "dm", "km"}));
		comboBox_1.setBounds(581, 224, 54, 26);
		contentPane.add(comboBox_1);
		
		JLabel lblTO = new JLabel("TO");
		lblTO.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTO.setBounds(481, 222, 38, 24);
		contentPane.add(lblTO);
		
		JLabel lblresults = new JLabel("");
		lblresults.setBounds(514, 223, 63, 29);
		contentPane.add(lblresults);
		Convert k = new Convert(0.00);
		typeText = new JTextField();
		typeText.setBounds(320, 225, 87, 24);
		contentPane.add(typeText);
		typeText.setColumns(10);
		String vol = typeText.getText();
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0) {
					if(comboBox_1.getSelectedIndex()==1) {
				double vol =k.cmTOmm( Double.parseDouble(typeText.getText()));
				lblresults.setText(""+vol);
				}
				   if(comboBox_1.getSelectedIndex()==2) {
						double vol =k.cmTOm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==3) {
						double vol =k.cmTOdm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==4) {
						double vol =k.cmTOkm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				}
				if(comboBox.getSelectedIndex()==1) {
					if(comboBox_1.getSelectedIndex()==0) {
				double vol =k.mmTOcm( Double.parseDouble(typeText.getText()));
				lblresults.setText(""+vol);
				}
				   if(comboBox_1.getSelectedIndex()==2) {
						double vol =k.mmTOm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==3) {
						double vol =k.mmTOdm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==4) {
						double vol =k.mmTOkm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				}
				if(comboBox.getSelectedIndex()==2) {
					if(comboBox_1.getSelectedIndex()==0) {
				double vol =k.mTOcm( Double.parseDouble(typeText.getText()));
				lblresults.setText(""+vol);
				}
				   if(comboBox_1.getSelectedIndex()==1) {
						double vol =k.mTOmm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==3) {
						double vol =k.mTOdm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==4) {
						double vol =k.mTOkm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
			}
				if(comboBox.getSelectedIndex()==3) {
					if(comboBox_1.getSelectedIndex()==0) {
				double vol =k.dmTOcm( Double.parseDouble(typeText.getText()));
				lblresults.setText(""+vol);
				}
				   if(comboBox_1.getSelectedIndex()==1) {
						double vol =k.dmTOmm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==2) {
						double vol =k.dmTOm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==4) {
						double vol =k.dmTOkm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
			}
				if(comboBox.getSelectedIndex()==4) {
					if(comboBox_1.getSelectedIndex()==0) {
				double vol =k.kmTOcm( Double.parseDouble(typeText.getText()));
				lblresults.setText(""+vol);
				}
				   if(comboBox_1.getSelectedIndex()==1) {
						double vol =k.kmTOmm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==2) {
						double vol =k.kmTOm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				   if(comboBox_1.getSelectedIndex()==3) {
						double vol =k.kmTOdm( Double.parseDouble(typeText.getText()));
						lblresults.setText(""+vol);
						}
				}
			}
		});
	}
}
