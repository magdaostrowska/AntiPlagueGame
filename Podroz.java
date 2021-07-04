package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Podroz extends JFrame {

    public Podroz() {

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new BorderLayout());
        add(jPanel);

        setSize(900, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Plague inc");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField wiadomość = new JTextField("Wybierz rodzaj podróży");
        wiadomość.setFont(new Font(Font.SERIF, Font.ITALIC, 17));
        wiadomość.setBackground(Color.BLACK);
        wiadomość.setForeground(Color.WHITE);
        jPanel.add(wiadomość, BorderLayout.PAGE_START);

        ImageIcon podróżGrafika = new ImageIcon("img\\trip.jpg"); // DODAĆ OBRAZ !!!
        int wysokośćGrafiki = podróżGrafika.getIconHeight();
        int szerokośćGrafiki = podróżGrafika.getIconWidth();
        JLabel label = new JLabel(podróżGrafika);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki-100, wysokośćGrafiki-50));
        add(label);

        JPanel panelPomocniczy = new JPanel();

        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());

        JButton samolot = new JButton("Samolot");
        samolot.setBackground(Color.LIGHT_GRAY);
        samolot.setForeground(Color.BLACK);
        panelPomocniczy.add(samolot);
        samolot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Samolot();
                    }
                });
            }
        });

        JButton pociąg = new JButton("Pociąg");
        pociąg.setBackground(Color.LIGHT_GRAY);
        pociąg.setForeground(Color.BLACK);
        panelPomocniczy.add(pociąg);
        pociąg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Pociąg();
                    }
                });
            }
        });

        JButton samochód = new JButton("Samochód");
        samochód.setBackground(Color.LIGHT_GRAY);
        samochód.setForeground(Color.BLACK);
        panelPomocniczy.add(samochód);
        samochód.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Samochód();
                    }
                });
            }
        });

        JButton autobus = new JButton("Autobus");
        autobus.setBackground(Color.LIGHT_GRAY);
        autobus.setForeground(Color.BLACK);
        panelPomocniczy.add(autobus);
        autobus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Autobus();
                    }
                });
            }
        });

        jPanel.add(panelPomocniczy, BorderLayout.PAGE_END);
        jPanel.add(label);

    }
}
