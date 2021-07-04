import javax.swing.*;

public class TestyPoziomŚredni extends JDialog {

    public TestyPoziomŚredni() {

        StronaGlowna stronaGlowna = new StronaGlowna();

        int liczbaZarażonych = (int) (Math.random() * 301);
        double punktyZaWykrycie = liczbaZarażonych * 1.5;

        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów + punktyZaWykrycie;

        JOptionPane.showMessageDialog(this, "Dzięki przeprowadzonym testom wykryto " + liczbaZarażonych
                + " zachorowań. Uzyskujesz " + punktyZaWykrycie + " punktów.");

    }

}
