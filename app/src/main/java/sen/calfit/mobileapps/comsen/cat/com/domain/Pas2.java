package sen.calfit.mobileapps.comsen.cat.com.domain;

public class Pas2 {
    int numero;
    String descripcio;
    String video;
    int foto;
    int counter = 0;
    double duracio;

    public Pas2 (int numero, String descripcio, double duracio) {
        this.numero = numero;
        this.descripcio = descripcio;
        this.duracio = duracio;
    }

    public Pas2 (int numero, String descripcio, double duracio, String video) {
        this.numero = numero;
        this.descripcio = descripcio;
        this.duracio = duracio;
        this.video = video;
    }

    public Pas2 (int numero, String descripcio, double duracio, int counter) {
        this.numero = numero;
        this.descripcio = descripcio;
        this.duracio = duracio;
        this.counter = counter;
    }

    public Pas2 (int numero, String descripcio, double duracio, String video, int counter) {
        this.numero = numero;
        this.descripcio = descripcio;
        this.duracio = duracio;
        this.counter = counter;
        this.video = video;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getDuracio() {
        return duracio;
    }

    public void setDuracio(double duracio) {
        this.duracio = duracio;
    }
}
