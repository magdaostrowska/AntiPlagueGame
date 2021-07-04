import javax.swing.*;

public class TestyPoziomŁatwy extends JDialog {

    public TestyPoziomŁatwy(){

        StronaGlowna stronaGlowna = new StronaGlowna();

        int liczbaZarażonych = (int)(Math.random()*201);
        double punktyZaWykrycie = liczbaZarażonych*1.5;

        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów + punktyZaWykrycie;

        JOptionPane.showMessageDialog(this, "Dzięki przeprowadzonym testom wykryto " + liczbaZarażonych
                                       + " zachorowań. Uzyskujesz " + punktyZaWykrycie + " punktów." );

    }

}
