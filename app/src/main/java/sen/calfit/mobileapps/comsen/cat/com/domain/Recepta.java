package sen.calfit.mobileapps.comsen.cat.com.domain;

import java.util.ArrayList;

public class Recepta {
    String title;
    String descripcio;
    double valoracio;
    String thumbnail;
    ArrayList<Pas> passos;
    ArrayList<String> ingredients;
    int duracioTotal;

    public Recepta(String title, String descripcio, double valoracio, String thumbnail, ArrayList<Pas> passos, ArrayList<String> ingredients) {
        this.title = title;
        this.descripcio = descripcio;
        this.valoracio = valoracio;
        this.thumbnail = thumbnail;
        this.passos = passos;
        this.ingredients = ingredients;
    }

    public int getDuracioTotal(){
        duracioTotal = 0;
        for(Pas p: passos){
            duracioTotal += p.getDuracio();
        }
        return duracioTotal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getValoracio() {
        return valoracio;
    }

    public void setValoracio(double valoracio) {
        this.valoracio = valoracio;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ArrayList<Pas> getPassos() {
        return passos;
    }

    public void setPassos(ArrayList<Pas> passos) {
        this.passos = passos;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
