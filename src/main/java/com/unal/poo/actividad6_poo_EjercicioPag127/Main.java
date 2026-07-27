
package com.unal.poo.actividad6_poo_EjercicioPag127;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();


        // Pedido 1

        String primer1 = "Sopa de pollo";
        double precioPrimer1 = 12000;

        String bebida1 = "Jugo natural";
        double precioBebida1 = 5000;

        double total1 = pedido.calcularPedido(precioPrimer1, precioBebida1);

        System.out.println("========== PEDIDO 1 ==========");
        System.out.println("Primer plato: " + primer1 + " $" + precioPrimer1);
        System.out.println("Bebida: " + bebida1 + " $" + precioBebida1);
        System.out.println("TOTAL: $" + total1);




        // Pedido 2


        String primer2 = "Crema de tomate";
        double precioPrimer2 = 10000;

        String segundo2 = "Carne asada";
        double precioSegundo2 = 22000;

        String bebida2 = "Gaseosa";
        double precioBebida2 = 4000;

        double total2 = pedido.calcularPedido(
                precioPrimer2,
                precioSegundo2,
                precioBebida2);

        System.out.println("\n========== PEDIDO 2 ==========");
        System.out.println("Primer plato: " + primer2 + " $" + precioPrimer2);
        System.out.println("Segundo plato: " + segundo2 + " $" + precioSegundo2);
        System.out.println("Bebida: " + bebida2 + " $" + precioBebida2);
        System.out.println("TOTAL: $" + total2);




        // Pedido 3


        String primer3 = "Ensalada";
        double precioPrimer3 = 9000;

        String segundo3 = "Pollo a la plancha";
        double precioSegundo3 = 18000;

        String bebida3 = "Limonada";
        double precioBebida3 = 6000;

        String postre3 = "Helado";
        double precioPostre3 = 7000;

        double total3 = pedido.calcularPedido(
                precioPrimer3,
                precioSegundo3,
                precioBebida3,
                precioPostre3);

        System.out.println("\n========== PEDIDO 3 ==========");
        System.out.println("Primer plato: " + primer3 + " $" + precioPrimer3);
        System.out.println("Segundo plato: " + segundo3 + " $" + precioSegundo3);
        System.out.println("Bebida: " + bebida3 + " $" + precioBebida3);
        System.out.println("Postre: " + postre3 + " $" + precioPostre3);
        System.out.println("TOTAL: $" + total3);

    }
}