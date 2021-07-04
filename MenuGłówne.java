import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGłówne extends JFrame {

    public MenuGłówne(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        add(jPanel);

        setSize(900, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        ImageIcon pauzaGrafika = new ImageIcon("img\\koronawirus.grafika.jpeg");
        int wysokośćGrafiki = pauzaGrafika.getIconHeight();
        int szerokośćGrafiki = pauzaGrafika.getIconWidth();
        JLabel label = new JLabel(pauzaGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-100, wysokośćGrafiki-50));
        add(label);

        JPanel panelPomocniczy = new JPanel();

        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());

        JButton nowaGra = new JButton("Nowa Gra");
        nowaGra.setBackground(Color.LIGHT_GRAY);
        nowaGra.setForeground(Color.BLACK);
        panelPomocniczy.add(nowaGra);
        nowaGra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new Intro());
            }
        });

        JButton ranking = new JButton("Tablica wyników");
        ranking.setBackground(Color.LIGHT_GRAY);
        ranking.setForeground(Color.BLACK);
        panelPomocniczy.add(ranking);
        ranking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new StronaGlowna());
            }
        });

        JButton wyjście = new JButton("Wyjście");
        wyjście.setBackground(Color.LIGHT_GRAY);
        wyjście.setForeground(Color.BLACK);
        panelPomocniczy.add(wyjście);
        wyjście.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

            });

        jPanel.add(panelPomocniczy, BorderLayout.PAGE_END);
        jPanel.add(label);



    }

}
