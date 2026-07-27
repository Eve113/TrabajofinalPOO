package actividad6_poo_EjercicioPag132;


public class ArticuloCientifico {

    // Atributos privados
    private String titulo;
    private String autor;
    private String[] palabrasClave;
    private String publicacion;
    private int ano;
    private String resumen;

    // Constructor 1
    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor 2
    public ArticuloCientifico(String titulo, String autor,
                              String[] palabrasClave,
                              String publicacion,
                              int anio) {

        this(titulo, autor); 

        this.palabrasClave = palabrasClave;
        this.publicacion = publicacion;
        this.ano = anio;
    }

    // Constructor 3
    public ArticuloCientifico(String titulo, String autor,
                              String[] palabrasClave,
                              String publicacion,
                              int anio,
                              String resumen) {

        this(titulo, autor, palabrasClave, publicacion, anio);

        this.resumen = resumen;
    }


    public void imprimir() {

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);

        System.out.print("Palabras clave: ");

        if (palabrasClave != null) {

            for (int i = 0; i < palabrasClave.length; i++) {

                System.out.print(palabrasClave[i]);

                if (i < palabrasClave.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();

        } else {

            System.out.println("No registradas");

        }

        System.out.println("Publicación: " + publicacion);
        System.out.println("Año: " + ano);
        System.out.println("Resumen: " + resumen);

    }

}
