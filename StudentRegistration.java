import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class StudentRegistration implements ActionListener
{
	JFrame jf;
	JLabel name,rollno, dob,gender,languages,address;
	JTextField nametxt,rollnotxt,dobtxt,addresstxt;
	JButton clear,submit;
	JRadioButton m,f,p;
	JCheckBox t,h,e;
	
	public void actionPerformed(ActionEvent e)
	{
		nametxt.setText("");
		rollnotxt.setText("");
		dobtxt.setText("");
		addresstxt.setText("");
	}
	StudentRegistration()
	{
		jf=new JFrame("Student Registration");
		name=new JLabel("Name : ");
		rollno=new JLabel("Rollno : ");
		dob=new JLabel("DOB : ");
		gender=new JLabel("Gender : ");
		languages=new JLabel("Languages Known : ");
		address=new JLabel("Address : ");
		
		nametxt=new JTextField();
		rollnotxt=new JTextField();
		dobtxt=new JTextField();
		addresstxt=new JTextField();

		m=new JRadioButton("Male");
		f=new JRadioButton("Female");
		p=new JRadioButton("prefer not say");

		clear=new JButton("Clear Form");
		submit=new JButton("Submit");

		t=new JCheckBox("Telugu");
		h=new JCheckBox("Hindi");
		e=new JCheckBox("English");
		JPanel jp=new JPanel(new GridLayout(3,1));

		jp.add(name);
		jp.add(nametxt);
		jp.add(rollno);
		jp.add(rollnotxt);
		jp.add(dob);
		jp.add(dobtxt);		
		jp.add(gender);
		jp.add(m);
		jp.add(f);
		jp.add(p);
		jp.add(languages);
		jp.add(t);
		jp.add(h);
		jp.add(e);
		jp.add(address);
		jp.add(addresstxt);
		jp.add(clear);
		jp.add(submit);

		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLayout(new GridLayout(3,1));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(jp,BorderLayout.CENTER);
		
		clear.addActionListener(this);
	}
	public static void main(String[] args)
	{
		StudentRegistration sr=new StudentRegistration();
	}
}