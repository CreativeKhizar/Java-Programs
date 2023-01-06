import javax.swing.*;
class FrameButton
{
	public static void main(String[] args)
	{
		JFrame jf=new JFrame("Simple Frame");
		JButton jb=new JButton("Frame Button");

		jf.setSize(500,500);
		jb.setBounds(200,200,150,50);

		jf.add(jb);

		//jf.setIcon("Z:\Java Programs\icon.png");
		
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}