import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StronaGlowna extends JFrame {

    double liczbaPunktów;
    int liczbaChorych;
    PoziomTrudności poziomTrudności;

    public StronaGlowna() {

        Informacja informacja = new Informacja();
        Thread zachorowania = new Thread(new Chorzy());
        zachorowania.start();
        Thread licznikCzasu = new Thread(new Czas());
        licznikCzasu.start();

        //JTextField timer = new JTextField();;
        //timer.setEditable(false);
        //timer.setBackground(Color.black);
        //timer.setForeground(Color.WHITE);

        JTextField chorzy = new JTextField();
        chorzy.setEditable(false);
        chorzy.setBackground(Color.black);
        chorzy.setForeground(Color.WHITE);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());


        JTextField liczniki = new JTextField("Liczba punktów: " + liczbaPunktów + "\tLiczba zachorowań: " + liczbaChorych
                                        + "\t Czas: " + licznikCzasu);
        liczniki.setEditable(false);
        jPanel.add(liczniki, BorderLayout.PAGE_START);

        jPanel.add(chorzy);


        ImageIcon menuObrazek = new ImageIcon("img\\Mapa_świata_grafika.jpg");
        int wysokośćGrafiki = menuObrazek.getIconHeight();
        int szerokośćGrafiki = menuObrazek.getIconWidth();
        JLabel label = new JLabel(menuObrazek);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki, wysokośćGrafiki));
        add(label);
        jPanel.add(label);


        // -=-=-=-=- PRZYCISKI -=-=-=-=-

        JPanel panelPomocniczy = new JPanel();
        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());

        JButton pauza = new JButton("Pauza");
        pauza.setBackground(Color.LIGHT_GRAY);
        pauza.setForeground(Color.BLACK);
        panelPomocniczy.add(pauza);
        pauza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Pauza();
                }
            });
            }
        });


        JButton rozpocznijPodróż = new JButton("Rozpocznij podróż");
        rozpocznijPodróż.setBackground(Color.LIGHT_GRAY);
        rozpocznijPodróż.setForeground(Color.BLACK);
        panelPomocniczy.add(rozpocznijPodróż);
        rozpocznijPodróż.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Podroz();
                    }
                });
            }
        });


        JButton menu = new JButton("Menu");
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setForeground(Color.BLACK);
        panelPomocniczy.add(menu);

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new MenuGłówne();
                    }
                });
            }
        });

        JButton ulepszenia = new JButton("Ulepszenia");
        ulepszenia.setBackground(Color.LIGHT_GRAY);
        ulepszenia.setForeground(Color.BLACK);
        panelPomocniczy.add(ulepszenia);
        ulepszenia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        new Ulepszenia();
                    } catch (ZaMałoPunktówException ex) {
                    }
                });
            };
        });


        JButton blokada = new JButton("Zablokuj granice");
        blokada.setBackground(Color.LIGHT_GRAY);
        blokada.setForeground(Color.BLACK);
        panelPomocniczy.add(blokada);
        blokada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new KrajeBlokada());
            }
        });


        jPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

                char keyChar = e.getKeyChar();

                if(e.isControlDown() && e.isShiftDown() && keyChar == 'w'){
                    SwingUtilities.invokeLater(() -> new Zapisywanie());
                    //SwingUtilities.invokeLater(() -> new Zapis());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.isControlDown() && e.isShiftDown() && e.getKeyChar() == 'w'){
                    SwingUtilities.invokeLater(() -> new Zapisywanie());
                    //SwingUtilities.invokeLater(() -> new Zapis());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });


        add(panelPomocniczy, BorderLayout.PAGE_END);

        setSize(1000, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(jPanel);
    }
}
