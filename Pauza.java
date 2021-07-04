import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pauza extends JFrame {

    public Pauza(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        add(jPanel);

        setSize(900, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField wiadomość = new JTextField("Zatrzymałeś grę. Naciśnij 'Graj', aby kontynuować");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_START);

        ImageIcon pauzaGrafika = new ImageIcon("img\\pauza.jpg"); // DODAĆ OBRAZ !!!
        int wysokośćGrafiki = pauzaGrafika.getIconHeight();
        int szerokośćGrafiki = pauzaGrafika.getIconWidth();
        JLabel label = new JLabel(pauzaGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-100, wysokośćGrafiki-50));
        add(label);

        JPanel panelPomocniczy = new JPanel();

        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());

        JButton gra = new JButton("Graj");
        gra.setBackground(Color.LIGHT_GRAY);
        gra.setForeground(Color.BLACK);
        panelPomocniczy.add(gra);
        gra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new StronaGlowna();

                    }
                });
            }
        });

        jPanel.add(panelPomocniczy, BorderLayout.PAGE_END);
        jPanel.add(label);

    }
}
