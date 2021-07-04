package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Zapis extends JFrame {

    public String nazwaUżytkownika;

    public Zapis(){

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.setBackground(Color.BLACK);
        jPanel.setForeground(Color.WHITE);

        String nazwaUżytkownika = JOptionPane.showInputDialog(this,"Podaj nazwę użytkownika", "Koronawirus Antiplague", JOptionPane.INFORMATION_MESSAGE);

        String [][] tabela = {
                {nazwaUżytkownika}
        };

        String [] kolumna = {"Nazwa użytkownika"};

        JTable tabelaWyników = new JTable(tabela, kolumna);

        jPanel.add(tabelaWyników, BorderLayout.CENTER);

        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Koronawirus Antiplague");
        setVisible(true);

        add(jPanel);
    }
}
