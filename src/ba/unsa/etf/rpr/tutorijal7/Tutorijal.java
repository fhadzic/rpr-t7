package ba.unsa.etf.rpr.tutorijal7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tutorijal implements Serializable {

    public static ArrayList<Grad> ucitajGradove() throws FileNotFoundException {

        ArrayList<Grad> gradovi = new ArrayList<>();

        Scanner ulaz;
        try {
            ulaz = new Scanner( new FileReader("mjerenja.txt"));
        } catch(FileNotFoundException e) {
            System.out.println("Datoteka mjerenja.txt ne postoji ili se ne može otvoriti.");
            System.out.println("Greška: " + e);
            throw e;
        }


        try {
            while (ulaz.hasNext()) {
                //Ucitavamo informacije
                String red = ulaz.nextLine();
                String[] info = red.split(","); //podjela stringova zarezom

                Grad grad = new Grad();
                grad.setNaziv(info[0]);

                double[] temperature = new double[info.length - 1];

                int i=0;
                while (i < temperature.length && i < 1000 ){
                    temperature[i] = Double.parseDouble(info[i+1]);
                    i++;
                }

                grad.setTempereture(temperature);
                gradovi.add(grad);
            }

        } catch(Exception e) {
            System.out.println("Problem pri čitanju podataka.");
            System.out.println("Greška: " + e);
        } finally {
            // Bez obzira došlo do izuzetka ili ne, datoteku treba zatvoriti
            ulaz.close();
        }

        return gradovi;
    }

    public static void main(String[] args) {

        try {
            var gradovi = ucitajGradove();
            for(Grad grad : gradovi) {
                System.out.println(grad.getNaziv());
            }
        }catch (FileNotFoundException e){
            return;
        }
    }
}
