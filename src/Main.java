import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Get the screen size as a Dimension object
        Dimension screenSize = toolkit.getScreenSize();

        // Extract width and height
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

		//Creating the window with all its awesome snaky features
		Window f1= new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(Math.min(Constants.GRID_SIZE_X*15, screenWidth),Math.min(Constants.GRID_SIZE_Y*15, screenHeight));
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}
