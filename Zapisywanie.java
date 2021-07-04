import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Zapisywanie extends JFrame {

    public Zapisywanie(){

        String nazwaUżytkownika = JOptionPane.showInputDialog(this,"Podaj nazwę użytkownika", "Koronawirus Antiplague", JOptionPane.INFORMATION_MESSAGE);

        List<String> tabelaWyników = new ArrayList<>();
        tabelaWyników.add(nazwaUżytkownika);

        JList<String> jList = new JList<>();

        Wyniki wyniki = new Wyniki(tabelaWyników);
        jList.setModel(wyniki);
        jList.setVisible(true);

        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jPanel.add(jList);
        jFrame.add(jPanel);



        /*
        String [][] tabela = {
                {nazwaUżytkownika}
        };

        String [] kolumna = {"Nazwa użytkownika"};

        JTable tabelaWyników = new JTable(tabela, kolumna);

        JFrame f = new JFrame();
        f.add(tabelaWyników);

         */

    }
}
