// Crea una clase Persona con las siguientes variables:
// * La edad
// * El nombre
// * El teléfono
// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {

    public static void main(String[] args){
      Cliente cliente1 = new Cliente();
      cliente1.setCredito(2000);
      Number credito = getCredito();
      System.out.println(cliente1.edad);
      System.out.println(cliente1.nombre);
      System.out.println(cliente1.telefono);
      System.out.println(credito);

      Trabajador trabajador1 = new Trabajador();
      trabajador1.setSalario(2000);
      Number salario = getSalario();
      System.out.println(trabajador1.edad);
      System.out.println(trabajador1.nombre);
      System.out.println(trabajador1.telefono);
      System.out.println(credito);
    }
  }

class Persona {
  Number edad;
  String nombre;
  Number telefono;

}

class Cliente extends Persona {
    private Number credito;

    // Seters
    public void setCredito(Number credito) {
      this.credito = credito;
    }

    // Geters
    public Number getCredito() {
      return this.credito;
    }
}

class Trabajador extends Persona {
    private Number salario;

    // Seters
    public void setSalario(Number salario) {
      this.salario = salario;
    }

    // Geters
    public Number getSalario() {
      return this.salario;
    }
}