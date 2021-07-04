package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame {

    public Menu(){

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);

        JButton start = new JButton("Rozpocznij grę");
        start.setBackground(Color.LIGHT_GRAY);
        start.setForeground(Color.DARK_GRAY);

        JPanel panelPomocniczy = new JPanel();
        panelPomocniczy.setBackground(Color.BLACK);
        panelPomocniczy.setLayout(new FlowLayout());
        panelPomocniczy.add(start);
        add(panelPomocniczy, BorderLayout.PAGE_END);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new PoziomTrudności();
                    }
                });
            }
        });


        add(jPanel);

        setSize(1000, 600);
        setTitle("Koronawirus Antiplague");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ImageIcon menuObrazek = new ImageIcon("img\\koronawirus -menu.jpg");
        int wysokośćGrafiki = menuObrazek.getIconHeight();
        int szerokośćGrafiki = menuObrazek.getIconWidth();
        JLabel label = new JLabel(menuObrazek);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki, wysokośćGrafiki));
        add(label);
        jPanel.add(label);
    }
}
