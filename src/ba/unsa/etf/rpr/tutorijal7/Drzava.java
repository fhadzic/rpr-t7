package ba.unsa.etf.rpr.tutorijal7;


import java.io.Serializable;

public class Drzava implements Serializable {
    private String naziv;
    private int brojStanovnika;
    private double povrsina;
    private String jedinicaZaPovrsinu;
    private Grad glavni;

    public Drzava(){
        this.naziv = null;
        this.brojStanovnika = 0;
        this.povrsina = 0;
        this.jedinicaZaPovrsinu = null;
        this.glavni = null;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public String getJedinicaZaPovrsinu() {
        return jedinicaZaPovrsinu;
    }

    public Grad getGlavni() {
        return glavni;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public void setJedinicaZaPovrsinu(String jedinicaZaPovrsinu) {
        this.jedinicaZaPovrsinu = jedinicaZaPovrsinu;
    }

    public void setGlavni(Grad glavni) {
        this.glavni = glavni;
    }
}
