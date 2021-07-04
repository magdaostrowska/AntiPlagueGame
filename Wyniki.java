import javax.swing.*;
import java.util.List;

public class Wyniki extends AbstractListModel<String> {


    // ta klasa nie ma żadnego znaczenia ani użycia

    List<String> wyniki;

    public Wyniki(List<String> wyniki){
        this.wyniki = wyniki;
    }

    public void dodajUżytkownika(String nazwaUżytkownika, int index){
        wyniki.add(nazwaUżytkownika);
        fireIntervalAdded(this, index, index);
    }

    @Override
    public int getSize() {
        return wyniki.size();
    }

    @Override
    public String getElementAt(int index) {
        return wyniki.get(index);
    }
}
