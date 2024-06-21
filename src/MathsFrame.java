import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Converter{
	public double mmTOcm(int v) {
		return v*0.1;
	}
	public double mmTOm(int v) {
		return v*0.001;
	}
	public double mmTOdm(int v) {
		return v*0.01;
	}
	public double mmTOkm(int v) {
		return v*0.000001;
	}
	//Conversion of centimeters to other unit lengths
	public double cmTOmm(int v) {
		return v*10;
	}
	public double cmTOm(int v) {
		return v*0.01;
	}
	public double cmTOdm(int v) {
		return v*0.1;
	}
	public double cmTOkm(int v) {
		return v*0.00001;
	}
	//Conversion of meters to other unit lengths
	public double mTOmm(int v) {
		return v*1000;
	}
	public double mTOcm(int v) {
		return v*100;
	}
	public double mTOdm(int v) {
		return v*10;
	}
	public double mTOkm(int v) {
		return v*0.001;
	}
	//Conversion of decimeters to other unit lengths
	public double dmTOmm(int v) {
		return v*100;
	}
	public double dmTOcm(int v) {
		return v*10;
	}
	public double dmTOm(int v) {
		return v*0.1;
	}
	public double dmTOkm(int v) {
		return v*0.0001;
	}
	//Conversion of kilometers to other unit lengths
	public double kmTOmm(int v) {
		return v*1000000;
	}
	public double kmTOcm(int v) {
		return v*100000;
	}
	public double kmTOdm(int v) {
		return v*10000;
	}
	public double kmTOm(int v) {
		return v*1000;
	}
	
}


public class MathsFrame extends JFrame implements ActionListener  {
	JComboBox cb,cb1;
	JTextField typetext;
	JLabel results;
	JButton btn = new JButton("OK");
	MathsFrame(){
		super("Unit Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
		setLocation(300,300);
		setLayout(new FlowLayout());
		typetext = new JTextField(15);
		add(typetext);
		add(new Label("to"));
				
		String Length[]= {"centimeters(cm)","meters(m)","milimeters(mm)","decimeters(dm)","kilometers(km)"};
		cb = new JComboBox(Length);
		cb.setBounds(50,50,90,20);
		add(cb);
		
		String Length1[]= {"centimeters(cm)","meters(m)","milimeters(mm)","decimeters(dm)","kilometers(km)"};
		cb1 = new JComboBox(Length1);
		cb1.setBounds(50,50,90,20);
		add(cb1);
		
		add(new JLabel("=") );
		results = new JLabel("   ");
		add(results);
		add(btn);
		//btn.addActionListener((ActionListener)this);
		//setVisible(true);
		typetext = new JTextField();
		typetext.setBounds(131,78,24,19);
		add(typetext);
		typetext.setColumns(10);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
