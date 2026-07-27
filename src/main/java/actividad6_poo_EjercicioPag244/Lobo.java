package actividad6_poo_EjercicioPag244;


public class Lobo extends Canido {

    public Lobo() {
        sonido = "Aullido";
        alimentos = "Carnívoro";
        habitat = "Bosque";
        nombreCientifico = "Canis lupus";
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

}
