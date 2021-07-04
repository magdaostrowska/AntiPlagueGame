package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KrajeBlokada extends JFrame{

    PoziomTrudności poziomTrudności;
    StronaGlowna stronaGlowna;

    public KrajeBlokada() {

        // oczywiście, to tylko przykładowe kraje - nie chciałam rozszerzać do wszystkich

        String[] krajeAmeryka = {"USA", "Kanada", "Meksyk", "Brazylia", "Chile",
                "Brazylia", "Argentyna", "Kolumbia", "Paragwaj",
                "Urugwaj", "Boliwia", "Peru", "Wenezuela"};

        String[] krajeEuropa = {"UK", "Irlandia", "Niemcy", "Hiszpania", "Włochy",
                "Portugalia", "Polska", "Czechy", "Słowacja",
                "Austria", "Norwegia", "Francja", "Rosja"};

        String[] krajeAzja = {"Chiny", "Japonia", "Wietnam", "Arabia Saudyjska",
                "Indie", "Turcja", "Zjenoczone Emiraty Arabskie"};

        String[] krajeAfryka = {"Kenia", "Kongo", "Libia", "RPA", "Sudan"};

        String[] krajeAustralia = {"Australia", "Nowa Zelandia"};

        JList<String> listaAmeryka = new JList<String>(krajeAmeryka);
        JList<String> listaEuropa = new JList<String>(krajeEuropa);
        JList<String> listaAzja = new JList<String>(krajeAzja);
        JList<String> listaAfryka = new JList<String>(krajeAfryka);
        JList<String> listaAustralia = new JList<String>(krajeAustralia);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);

        for(int i = 0; i < krajeAmeryka.length; i++){
            JButton jButton = new JButton();
            jButton.setText(krajeAmeryka[i]);
            jPanel.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Zamknąłeś granicę " + jButton.getText());
                    try{
                        stronaGlowna.liczbaPunktów+=100;
                    } catch (NullPointerException ex){
                    }
                }
            });
        }

        for(int i = 0; i < krajeEuropa.length; i++){
            JButton jButton = new JButton();
            jButton.setText(krajeEuropa[i]);
            jPanel.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Zamknąłeś granicę " + jButton.getText());
                    try{
                        stronaGlowna.liczbaPunktów+=100;
                    } catch (NullPointerException ex){
                    }
                }
            });
        }

        for(int i = 0; i < krajeAzja.length; i++){
            JButton jButton = new JButton();
            jButton.setText(krajeAzja[i]);
            jPanel.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Zamknąłeś granicę " + jButton.getText());
                    try{
                        stronaGlowna.liczbaPunktów+=100;
                    } catch (NullPointerException ex){
                    }
                }
            });
        }

        for(int i = 0; i < krajeAfryka.length; i++){
            JButton jButton = new JButton();
            jButton.setText(krajeAfryka[i]);
            jPanel.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Zamknąłeś granicę " + jButton.getText());
                    try{
                        stronaGlowna.liczbaPunktów+=100;
                    } catch (NullPointerException ex){
                    }
                }
            });
        }

        for(int i = 0; i < krajeAustralia.length; i++){
            JButton jButton = new JButton();
            jButton.setText(krajeAustralia[i]);
            jPanel.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jButton.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Zamknąłeś granicę " + jButton.getText());
                    try{
                        stronaGlowna.liczbaPunktów+=100;
                    } catch (NullPointerException ex){
                    }
                }
            });
        }

        ImageIcon menuObrazek = new ImageIcon("img\\koronawirus_mapa.jpg");
        int wysokośćGrafiki = menuObrazek.getIconHeight();
        int szerokośćGrafiki = menuObrazek.getIconWidth();
        JLabel label = new JLabel(menuObrazek);
        label.setVisible(true);
        label.setPreferredSize(new Dimension(szerokośćGrafiki, wysokośćGrafiki));
        add(label);
        jPanel.add(label);

        JTextField jTextField = new JTextField("Wybierz kraj, którego granice chcesz zamknąć");
        jTextField.setFont(new Font(Font.DIALOG, Font.PLAIN, 23));
        jTextField.setBackground(Color.BLACK);
        jTextField.setForeground(Color.WHITE);
        jPanel.add(jTextField);


        setSize(1000, 600);
        setLocationRelativeTo(null);
        setTitle("Koronawirus Antiplague");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        add(jPanel);

    }
}
