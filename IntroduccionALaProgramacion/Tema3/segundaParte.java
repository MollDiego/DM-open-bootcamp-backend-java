// Segunda parte:

// * Crear una clase coche.
// * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
// * Una función que incremente el número de puertas que tiene el coche.
// * Crear un objeto miCoche en el main y añadirle una puerta.
// * Mostrar el número de puertas que tiene el objeto.

public class EjercicioSegundaParte {

  public class coche {
    private int cantPuerta;

    public incrementarPuerta() {
      cantPuerta = cantPuerta + 1;
    }

    public int getCantPuerta() {
      return cantPuerta;
    }
  }

  public static void main() {
    miCoche = new coche();
    miCoche.incrementarPuerta();
    System.out.println(miCoche.getCantPuerta());
  }
}