package sen.calfit.mobileapps.comsen.cat.com.domain;

import java.util.ArrayList;

public class Recepta2 {
    String title2;
    String descripcio2;
    double valoracio2;
    String thumbnail2;
    ArrayList<Pas> passos2;
    ArrayList<String> ingredients2;
    int duracioTotal2;

    public Recepta2 (String title2, String descripcio2, double valoracio2, String thumbnail2, ArrayList<Pas> passos2, ArrayList<String> ingredients2) {
        this.title2 = title2;
        this.descripcio2 = descripcio2;
        this.valoracio2 = valoracio2;
        this.thumbnail2 = thumbnail2;
        this.passos2 = passos2;
        this.ingredients2 = ingredients2;
    }

    public int getDuracioTotal () {
        duracioTotal2 = 0;
        for (Pas p : passos2) {
            duracioTotal2 += p.getDuracio();
        }
        return duracioTotal2;
    }

    public String getTitle2 () {
        return title2;
    }

    public void setTitle2 (String title2) {
        this.title2 = title2;
    }

    public String getDescripcio2 () {
        return descripcio2;
    }

    public void setDescripcio2 (String descripcio2) {
        this.descripcio2 = descripcio2;
    }

    public double getValoracio2 () {
        return valoracio2;
    }

    public void setValoracio2 (double valoracio2) {
        this.valoracio2 = valoracio2;
    }

    public String getThumbnail2 () {
        return thumbnail2;
    }

    public void setThumbnail2 (String thumbnail2) {
        this.thumbnail2 = thumbnail2;
    }

    public ArrayList<Pas> getPassos2 () {
        return passos2;
    }

    public void setPassos2 (ArrayList<Pas> passos2) {
        this.passos2 = passos2;
    }

    public ArrayList<String> getIngredients2 () {
        return ingredients2;
    }

    public void setIngredients2 (ArrayList<String> ingredients2) {
        this.ingredients2 = ingredients2;
    }

    public int getDuracioTotal2 () {
        return duracioTotal2;
    }

    public void setDuracioTotal2 (int duracioTotal2) {
        this.duracioTotal2 = duracioTotal2;
    }
}