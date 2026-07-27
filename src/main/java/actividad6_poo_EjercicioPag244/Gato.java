
package actividad6_poo_EjercicioPag244;


public class Gato extends Felino {

    public Gato() {
        sonido = "Maullido";
        alimentos = "Ratones";
        habitat = "Doméstico";
        nombreCientifico = "Felis silvestris catus";
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
