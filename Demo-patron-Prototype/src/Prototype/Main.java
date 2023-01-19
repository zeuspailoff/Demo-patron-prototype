package Prototype;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.marca = "Mercedez";
        coche.modelo= "clk";
        coche.puertas = 6;

        System.out.println(coche.modelo + " " + coche.marca + " " + coche.puertas + " ");
        try {
            Coche clonado = coche.clonar();
            System.out.println(coche.modelo + " " + clonado.marca + " " + coche.puertas + " ");
        }catch (Exception e) {
            System.out.println("no se puede clonar "+ e.getMessage());
        }
    }
}