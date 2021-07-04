import javax.swing.*;
import java.awt.*;

public class Autobus extends JFrame {

    public Autobus(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        setSize(900, 600);
        add(jPanel);

        setLocationRelativeTo(null);
        setTitle("Koronawirus Plague inc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField wiadomość = new JTextField("Jesteś w trakcie podróży autobusem. Niedługo dotrzesz do celu");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_END);

        ImageIcon autobusGrafika = new ImageIcon("img\\autobus.jpg");
        int wysokośćGrafiki = autobusGrafika.getIconHeight();
        int szerokośćGrafiki = autobusGrafika.getIconWidth();
        JLabel label = new JLabel(autobusGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-100, wysokośćGrafiki-50));
        add(label);
        jPanel.add(label);

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new KrajePodróż();
                }
            });
        });thread.start();
    }

}
