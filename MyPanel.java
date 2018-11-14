import javax.swing.JPanel;
import java.awt.Graphics;

public class MyPanel extends JPanel
{
	//Inheritance uses protected
	protected int x;
	protected int y;
	
	public MyPanel()
	{
		//Calls the constructor of JPanel
		super();
		x = 10;
		y = 100;
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
	}
}
