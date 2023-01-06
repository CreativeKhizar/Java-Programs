import java.awt.*;
import java.awt.event.*;
class LoginForm extends WindowAdapter
{
	Frame f=new Frame("Login Form");
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void display()
	{
		Label name=new Label("NAME :");
		Label pwd=new Label("PASSWORD");
		TextField nametxt=new TextField();
		TextField pwdtxt=new TextField();
		
		Button forgot=new Button("Forgot Password");
		Button login=new Button("Login");

		f.setSize(500,500);

		Panel p=new Panel(new GridLayout(3,3));
		p.add(name);
		p.add(nametxt);
		p.add(pwd);
		p.add(pwdtxt);
		p.add(forgot);
		p.add(login);

		f.setLayout(new GridLayout(3,1));
		f.setVisible(true);
		f.add(p,BorderLayout.CENTER);
		f.addWindowListener(this);
	}		
	public static void main(String[] args)
	{
		LoginForm lf=new LoginForm();
		lf.display();
	}
}
		