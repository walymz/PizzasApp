package test;

import principal.entities.Pizza;
import principal.enums.TipoPizza;
import principal.enums.Tamano;

public class Test {
    public static void main(String[] args) {
        /*
         Clase de testeo
        */
        Pizza p1 = new Pizza(TipoPizza.MARGARITA, Tamano.FAMILIAR);
        Pizza p2 = new Pizza(TipoPizza.CUATRO_QUESOS, Tamano.MEDIANA);
        Pizza p3 = new Pizza(TipoPizza.FUNGHI, Tamano.MEDIANA);
        Pizza p4 = new Pizza(TipoPizza.MARGARITA, Tamano.MEDIANA);
        delay(1000);
        p1.servir();
        String hola;
        delay(10000);
        p2.servir();
        delay(1000);
        p3.servir();
        delay(10000);
        p4.servir();
        delay(1000);
        System.out.println("pizza: "+p1);
        System.out.println("Cantidad de pizzas pedidas: "+ Pizza.getCantidadPedida());
        System.out.println("Cantidad de pizzas servidas: "+ Pizza.getCantidadServida());
    }
//Un delay fabricado
    private static void delay(int n) {
        String hola="0";
        for (int i = 0; i < n; i++) {
            hola = hola.toString()+String.valueOf(i);
        }
    }
    
}
