package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UN implements Serializable {
    List<Drzava> drzave = new ArrayList<>();

    public UN() {
        this.drzave = null;
    }

    public List<Drzava> getDrzave() {
        return drzave;
    }

    public void setDrzave(List<Drzava> drzave) {
        this.drzave = drzave;
    }
}
