import javax.swing.*;

public class BrakPunktówException extends Exception{

    public BrakPunktówException(){
        System.out.println("Przegrałeś! Spróbuj ponownie");
        SwingUtilities.invokeLater(() -> new Zapisywanie());
        //SwingUtilities.invokeLater(() -> new Zapis());
    }
}
