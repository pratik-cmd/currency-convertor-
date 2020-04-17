import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cur extends JFrame implements ItemListener,ActionListener
{
	
	JFrame f;
	JComboBox cb,cb1;
	JTextField t1,t3;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	Font f1;
	double ans;
	cur()
	{
		setBounds(100,100,20,500);
		setSize(1000,500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setTitle("CURRENCY CONVERTER");//title of the swing
		l1=new JLabel("Enter currency :");
		l2=new JLabel("to");
		l1.setBounds(50,50,100,30);
		add(l1);
		t1=new JTextField();
		t1.setBounds(150,50,100,30);
		String[] a={"None","USD","EUR","JPY","CHF","INR"};
		cb=new JComboBox(a);
		cb.setBounds(50,150,100,30);
		cb1=new JComboBox(a);
		l2.setBounds(170,150,50,30);
		add(l2);
		cb1.setBounds(200,150,100,30);
		l3=new JLabel("Converted currency is:");
		l3.setBounds(50,200,150,30);
		t3=new JTextField();
		t3.setBounds(200,200,250,30);
		b1=new JButton("Clear");
		b2=new JButton("Exit");
		b3=new JButton("Compute");
		b3.setBounds(70,270,150,30);
		b1.setBounds(230,270,100,30);
		b2.setBounds(360,270,100,30);
		add(l3);
		add(t3);
		add(cb1);
		add(cb);
		add(t1);
		f1=new Font("Arial",Font.BOLD,15);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		add(b1);
		add(b2);
		add(b3);
		cb.addItemListener(this);
		cb1.addItemListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1.setFont(f1);
		t3.setFont(f1);
			
	}
	public void itemStateChanged(ItemEvent e)
	{
		double n1=Double.parseDouble(t1.getText());
		if(cb.getSelectedItem()=="None" && cb1.getSelectedItem()=="None")
			ans=0;	
		if(cb.getSelectedItem()=="INR" && cb1.getSelectedItem()=="USD")
			ans=n1*0.013;	
		if(cb.getSelectedItem()=="INR" && cb1.getSelectedItem()=="EUR")
			
			ans=n1/0.012;
		
		if(cb.getSelectedItem()=="INR" && cb1.getSelectedItem()=="JPY")
			
			ans=n1*1.4;
		
		if(cb.getSelectedItem()=="INR" && cb1.getSelectedItem()=="CHF")
			
			ans=n1*0.013;
		
		if(cb.getSelectedItem()=="USD" && cb1.getSelectedItem()=="EUR")
			
			ans=n1*0.92;	
		
		if(cb.getSelectedItem()=="USD" && cb1.getSelectedItem()=="JPY")
			
			ans=n1*107.44;	
		
		if(cb.getSelectedItem()=="USD" && cb1.getSelectedItem()=="CHF")
			
			ans=n1*0.97;	
		
		if(cb.getSelectedItem()=="USD" && cb1.getSelectedItem()=="INR")
			
			ans=n1*76.51;	
		
		


		if(cb.getSelectedItem()=="EUR" && cb1.getSelectedItem()=="USD")
			
			ans=n1*1.09;	
		
		if(cb.getSelectedItem()=="EUR" && cb1.getSelectedItem()=="JPY")
			
			ans=n1*116.73;	
		
		if(cb.getSelectedItem()=="EUR" && cb1.getSelectedItem()=="CHF")
			
			ans=n1*1.05;	
		
		if(cb.getSelectedItem()=="EUR" && cb1.getSelectedItem()=="INR")
			
			ans=n1*83.12;
		
		if(cb.getSelectedItem()=="JPY" && cb1.getSelectedItem()=="USD")
			
			ans=n1*0.0093;	
		
		if(cb.getSelectedItem()=="JPY" && cb1.getSelectedItem()=="EUR")
			
			ans=n1*0.0086;	
		
		if(cb.getSelectedItem()=="JPY" && cb1.getSelectedItem()=="CHF")
			
			ans=n1*0.0090;	
		
		if(cb.getSelectedItem()=="JPY" && cb1.getSelectedItem()=="INR")
			
			ans=n1*0.71;	
		
		if(cb.getSelectedItem()=="CHF" && cb1.getSelectedItem()=="INR")
			
			ans=n1*79.06;	
		
		if(cb.getSelectedItem()=="CHF" && cb1.getSelectedItem()=="USD")
			
			ans=n1*1.03;
		
		if(cb.getSelectedItem()=="CHF" && cb1.getSelectedItem()=="EUR")
			
			ans=n1*0.95;	
		
		if(cb.getSelectedItem()=="CHF" && cb1.getSelectedItem()=="JPY")
			
			ans=n1*111.04;	
		
		if(cb.getSelectedItem()=="USD" && cb1.getSelectedItem()=="USD")
			
			ans=n1;	
		
		if(cb.getSelectedItem()=="INR" && cb1.getSelectedItem()=="INR")
			
			ans=n1;	
		
		if(cb.getSelectedItem()=="EUR" && cb1.getSelectedItem()=="EUR")
			
			ans=n1;	
		
		if(cb.getSelectedItem()=="JPY" && cb1.getSelectedItem()=="JPY")
			
			ans=n1;	
		
		if(cb.getSelectedItem()=="CHF" && cb1.getSelectedItem()=="CHF")
			
			ans=n1;	
		if(cb.getSelectedItem()=="None" || cb1.getSelectedItem()=="None"){
			String s="Invalid";
			t3.setText(s);
		}
			
	}
	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==b1)
		{
			cb.setSelectedIndex(0);
			cb1.setSelectedIndex(0);
			t1.setText("");
			t3.setText("");

		}
		if(e1.getSource()==b2)
		{
			System.exit(0);
		}
		if(e1.getSource()==b3)
		{
			t3.setText(""+ans);
			
		}
	}
	public static void main(String args[])
	{
		new cur();
	}
}



