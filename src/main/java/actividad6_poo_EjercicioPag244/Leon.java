
package actividad6_poo_EjercicioPag244;

public class Leon extends Felino {

    public Leon() {
        sonido = "Rugido";
        alimentos = "Carnívoro";
        habitat = "Pradera";
        nombreCientifico = "Panthera leo";
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
