import javax.swing.*;
import java.awt.*;

public class Samochód extends JFrame {

    public Samochód(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        setSize(900, 600);
        add(jPanel);

        setLocationRelativeTo(null);
        setTitle("Koronawirus Plague inc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField wiadomość = new JTextField("Jesteś w trakcie podróży samochodem. Niedługo dotrzesz do celu");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_END);

        ImageIcon samochódGrafika = new ImageIcon("img\\samochód.jpg");
        int wysokośćGrafiki = samochódGrafika.getIconHeight();
        int szerokośćGrafiki = samochódGrafika.getIconWidth();
        JLabel label = new JLabel(samochódGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-500, wysokośćGrafiki-200));
        add(label);
        jPanel.add(label);

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(4000);
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
