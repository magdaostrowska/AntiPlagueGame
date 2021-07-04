import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ulepszenia extends JFrame{

    PoziomTrudności poziomTrudności;
    StronaGlowna stronaGlowna;


    public Ulepszenia() throws ZaMałoPunktówException {


        String[] ulepszenia = {"Maseczki (koszt: 50 punktów)", "Testy (koszt: 100 punktów)", "Kombinezony ochronne (koszt: 150 punktów)",
                "Leki przeciwko grypie (koszt: 75 punktów)", "Zarządź dwutygodniową kwarantannę (koszt: 500 punktów)",
                "Rozpocznij pracę nad szczepionką (koszt: 700 punktów)", "Powiększenie szpitala (koszt: 600 punktów)",
                "Pomoc lekarzy z zagranicy (koszt: 1000 punktów)"};

        JList<String> listaUlepszeń = new JList<String>(ulepszenia);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.BLACK);
        jPanel.setLayout(new FlowLayout());

        for (int i = 0; i < ulepszenia.length; i++) {
            JButton jButton = new JButton();
            jButton.setText(ulepszenia[i]);
            jPanel.add(jButton);

            if (jButton.getText() == "Maseczki (koszt: 50 punktów)") {
                stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 50;
                if (stronaGlowna.liczbaPunktów < 50) {
                    throw new ZaMałoPunktówException();
                }
            }

            if (jButton.getText() == "Testy (koszt: 100 punktów)") {
                stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 100;
                if (stronaGlowna.liczbaPunktów < 100) {
                    throw new ZaMałoPunktówException();
                }
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (poziomTrudności.jestŁatwy) {
                            SwingUtilities.invokeLater(() -> new TestyPoziomŁatwy());
                        } else if (poziomTrudności.jestŚredni) {
                            SwingUtilities.invokeLater(() -> new TestyPoziomŚredni());
                        } else {
                            SwingUtilities.invokeLater(() -> new TestyPoziomTrudny());
                        }
                    }
                });
            }

            if (jButton.getText() == "Kombinezony ochronne (koszt: 150 punktów)") {
                if (stronaGlowna.liczbaPunktów < 150) {
                    throw new ZaMałoPunktówException();
                } else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 150;
                }
            }

            if (jButton.getText() == "Leki przeciwko grypie (koszt: 75 punktów)") {
                if (stronaGlowna.liczbaPunktów < 75) {
                    throw new ZaMałoPunktówException();
                } else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 75;
                }
            }

            if (jButton.getText() == "Zarządź dwutygodniową kwarantannę (koszt: 500 punktów)") {
                if (stronaGlowna.liczbaPunktów < 500) {
                    throw new ZaMałoPunktówException();
                }else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 500;
                }
            }

            if (jButton.getText() == "Rozpocznij pracę nad szczepionką (koszt: 700 punktów)") {
                if (stronaGlowna.liczbaPunktów < 700) {
                    throw new ZaMałoPunktówException();
                } else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 700;
                }
            }

            if (jButton.getText() == "Powiększenie szpitala (koszt: 600 punktów)") {
                if (stronaGlowna.liczbaPunktów < 600) {
                    throw new ZaMałoPunktówException();
                }else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 600;
                }
            }

            if (jButton.getText() == "Pomoc lekarzy z zagranicy (koszt: 1000 punktów)") {
                if (stronaGlowna.liczbaPunktów < 50) {
                    throw new ZaMałoPunktówException();
                }else {
                    stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 50;
                }
            }


            ImageIcon ulepszeniaGrafika = new ImageIcon("img\\ulepszenia.jpg");
            int wysokośćGrafiki = ulepszeniaGrafika.getIconHeight();
            int szerokośćGrafiki = ulepszeniaGrafika.getIconWidth();
            JLabel label = new JLabel(ulepszeniaGrafika);
            label.setVisible(true);
            label.setPreferredSize(new Dimension(szerokośćGrafiki, wysokośćGrafiki));
            add(label);
            jPanel.add(label);

            JTextField jTextField = new JTextField("Wybierz ulepszenie");
            jTextField.setFont(new Font(Font.DIALOG, Font.PLAIN, 23));
            jTextField.setBackground(Color.BLACK);
            jTextField.setForeground(Color.WHITE);
            jPanel.add(jTextField);

            pack();

            setSize(1000, 600);
            setLocationRelativeTo(null);
            setTitle("Koronawirus Antiplague");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

            add(jPanel);

        }
    }
}
