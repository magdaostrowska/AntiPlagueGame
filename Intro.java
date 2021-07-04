import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Intro extends JFrame{

    public Intro(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());

        JTextField wiadomość = new JTextField("Rozpoczęła się pandemia Koronawirusa. Liczba zarażonych wciąż rośnie. Uratuj świat zanim będzie za późno");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_END);

        add(jPanel);

        setSize(900, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ImageIcon menuGrafika = new ImageIcon("img\\koronawirus-intro.gif");
        int wysokośćGrafiki = menuGrafika.getIconHeight();
        int szerokośćGrafiki = menuGrafika.getIconWidth();
        JLabel label = new JLabel(menuGrafika);
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
                    new StronaGlowna();
                }
            });
        });thread.start();

    }
}

