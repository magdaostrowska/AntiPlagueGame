import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PoziomTrudności extends JFrame {

    boolean jestŁatwy = false;
    boolean jestŚredni = false;
    boolean jestTrudny = false;

    double liczbaPunktów;
    int liczbaChorych;

    public PoziomTrudności(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());

        add(jPanel);

        setSize(1000, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        JTextField wiadomość = new JTextField("\t \tWybierz poziom trudności gry");
        wiadomość.setEditable(false);
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 30));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_START);


        ImageIcon poziomGrafika = new ImageIcon("img\\poziom_trudności.jpg");
        int wysokośćGrafiki = poziomGrafika.getIconHeight();
        int szerokośćGrafiki = poziomGrafika.getIconWidth();
        JLabel label = new JLabel(poziomGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-300, wysokośćGrafiki-120));
        add(label);
        jPanel.add(label);

        JPanel panelPomocniczy = new JPanel();
        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());

        JButton poziomP = new JButton("Łatwy");
        poziomP.setBackground(Color.LIGHT_GRAY);
        poziomP.setForeground(Color.BLACK);
        panelPomocniczy.add(poziomP);
        poziomP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jestŁatwy = true;
                liczbaPunktów = 500;
                liczbaChorych = 300;
                SwingUtilities.invokeLater(() -> new Intro());
            }
        });


        JButton poziomS = new JButton("Średni");
        poziomS.setBackground(Color.LIGHT_GRAY);
        poziomS.setForeground(Color.BLACK);
        panelPomocniczy.add(poziomS);
        poziomS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jestŚredni = true;
                liczbaPunktów = 1000;
                liczbaChorych = 500;
                SwingUtilities.invokeLater(() -> new Intro());
            }
        });

        JButton poziomT = new JButton("Trudny");
        poziomT.setBackground(Color.LIGHT_GRAY);
        poziomT.setForeground(Color.BLACK);
        panelPomocniczy.add(poziomT);
        poziomT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jestTrudny = true;
                liczbaPunktów = 1500;
                liczbaChorych = 700;
                SwingUtilities.invokeLater(() -> new Intro());
            }
        });

        jPanel.add(panelPomocniczy, BorderLayout.PAGE_END);
    }
}
