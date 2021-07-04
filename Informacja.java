import javax.swing.*;
import java.awt.*;

public class Informacja extends JFrame {

    public Informacja(){

        JOptionPane.showMessageDialog(this, "W prowincji Hubei, w Chinach rozpoczyna się epidemia. Badania wciąż trwają, " +
                "ale jak dotąd zostało potwierdzonych 331 przypadków zachorowań. Zmarło 59 osób", "Alert", JOptionPane.WARNING_MESSAGE );

    }
}
