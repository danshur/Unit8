import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BigButtonWithEvents implements Runnable, ActionListener {
	
	private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        BigButtonWithEvents app = new BigButtonWithEvents();
        Thread t = new Thread(app);
        t.start();
    }

    public void run() {
        Container pane = frame.getContentPane();
        JButton button = new JButton( "Push Me" );
        button.addActionListener(this);
        pane.add( button );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }

    public void actionPerformed( ActionEvent evt ) {
        JOptionPane.showMessageDialog( null, "I've been pushed!" );
    }
}
