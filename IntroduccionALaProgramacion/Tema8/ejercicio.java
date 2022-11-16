public class Main {

    public static void main(String[] args){
      Persona alumno = new Persona();
      alumno.setEdad(21);
      alumno.setNombre('Miguel');
      alumno.setTelefono(54266123123);
      Number edad = alumno.getEdad();
      String nombre = alumno.getNombre();
      Number telefono = alumno.getTelefono();
      System.out.println(edad);
      System.out.println(nombre);
      System.out.println(telefono);
    }
  }

class Persona {
  private Number edad;
  private String nombre;
  private Number telefono;

  // Seters
  public void setEdad(Number edad) {
    this.edad = edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setTelefono(Number telefono) {
    this.telefono = telefono;
  } 

  // Geters
  public Number getEdad() {
    return this.edad;
  }

  public String getNombre() {
    return this.nombre;
  }

  public Numer getTelefono() {
    return this.telefono;
  }

}