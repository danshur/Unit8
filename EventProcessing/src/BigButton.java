import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BigButton implements Runnable {
	
	private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        BigButton app = new BigButton();
        Thread t = new Thread(app);
        t.start();
    }

    public void run() {
        Container pane = frame.getContentPane();
        JButton button = new JButton( "Push Me" );
        pane.add( button );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }

}