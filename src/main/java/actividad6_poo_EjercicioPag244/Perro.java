
package actividad6_poo_EjercicioPag244;


public class Perro extends Canido {

    public Perro() {
        sonido = "Ladrido";
        alimentos = "Carnívoro";
        habitat = "Doméstico";
        nombreCientifico = "Canis lupus familiaris";
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
