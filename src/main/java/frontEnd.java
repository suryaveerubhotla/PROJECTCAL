import javax.swing.*;

public class FrontEnd {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Front End");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JLabel label = new JLabel("Hello, World!");
            frame.add(label);
            
            frame.setVisible(true);
        });
    }
}
