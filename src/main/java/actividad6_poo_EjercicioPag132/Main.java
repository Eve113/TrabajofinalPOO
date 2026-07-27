
package actividad6_poo_EjercicioPag132;

public class Main {

    public static void main(String[] args) {

        String[] palabras = {
                "Java",
                "POO",
                "Constructores",
                "Sobrecarga"
        };

        ArticuloCientifico articulo = new ArticuloCientifico(
                "Sobrecarga de Constructores en Java",
                "Juanito Alcachofa",
                palabras,
                "Revista de Programación",
                2025,
                "Este artículo explica el uso de constructores sobrecargados en Java."
        );

        articulo.imprimir();

    }

}
