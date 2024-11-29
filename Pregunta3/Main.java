public class Main {
  public static void main(String[] args) {
    Persona manuel = new Persona("Manuel", "1234");
    Persona copia = new Persona(manuel);
    Persona referencia = manuel;

    ListaB listaB = new ListaB();
    listaB.insertarPersona(manuel);
    listaB.insertarPersona(copia);
    manuel.setNombre("Manuel Antonio");

    listaB.insertarPersona(referencia);

    System.out.println("Lista B:");
    NodoB actualB = listaB.obtenerNodo();
    while (actualB != null) {
      Persona p = actualB.getPersona();
      System.out.println(p.getNombre() + " - " + p.getDni() + " - Hash: " + p.hashCode());
      actualB = actualB.getSiguiente();
    }

    manuel.setNombre("Manuel");
    ListaA listaA = new ListaA();
    listaA.insertarPersona(manuel);
    listaA.insertarPersona(copia);
    manuel.setNombre("Manuel Antonio");
    listaA.insertarPersona(referencia);

    System.out.println("Lista A:");
    NodoA actualA = listaA.obtenerNodo();
    while (actualA != null) {
      Persona p = actualA.getPersona();
      System.out.println(p.getNombre() + " - " + p.getDni() + " - Hash: " + p.hashCode());
      actualA = actualA.getSiguiente();
    }

  }

}
