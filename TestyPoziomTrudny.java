import javax.swing.*;

public class TestyPoziomTrudny extends JDialog {

    public TestyPoziomTrudny(){

        StronaGlowna stronaGlowna = new StronaGlowna();

        int liczbaZarażonych = (int)(Math.random()*501);
        double punktyZaWykrycie = liczbaZarażonych*1.5;

        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów + punktyZaWykrycie;


        JOptionPane.showMessageDialog(this, "Dzięki przeprowadzonym testom wykryto " + liczbaZarażonych
                    + " zachorowań. Uzyskujesz " + punktyZaWykrycie + " punktów." );

        }
}
