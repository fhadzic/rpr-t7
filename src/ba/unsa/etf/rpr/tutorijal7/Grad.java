package ba.unsa.etf.rpr.tutorijal7;

import java.io.Serializable;

public class Grad implements Serializable {
    private String naziv;
    private int brojStanovnika;
    private  double[] temperature = new double[1000];

    public Grad(){
        this.naziv = null;
        this. brojStanovnika = 0;
        temperature = null;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public double[] getTempereture() {
        return temperature;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public void setTempereture(double[] tempereture) {
        this.temperature = tempereture;
    }
}
