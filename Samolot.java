import javax.swing.*;
import java.awt.*;

public class Samolot extends JFrame {

    public Samolot(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        setSize(900, 600);
        add(jPanel);

        setLocationRelativeTo(null);
        setTitle("Koronawirus Plague inc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField wiadomość = new JTextField("Jesteś w trakcie podróży samolotem. Niedługo dotrzesz do celu");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_END);

        ImageIcon samolotGrafika = new ImageIcon("img\\samolot.jpg");
        int wysokośćGrafiki = samolotGrafika.getIconHeight();
        int szerokośćGrafiki = samolotGrafika.getIconWidth();
        JLabel label = new JLabel(samolotGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-100, wysokośćGrafiki-50));
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
