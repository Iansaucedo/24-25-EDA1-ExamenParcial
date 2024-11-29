public class ListaB {
  private NodoB primero;

  public void insertarPersona(Persona persona) {
    NodoB nuevo = new NodoB(persona, primero);
    primero = nuevo;
  }

  public NodoB obtenerNodo() {
    return primero;
  }

  public boolean contiene(Persona persona) {
    NodoB actual = primero;
    while (actual != null) {
      if (actual.getPersona().getDni().equals(persona.getDni())) {
        return true;
      }
      actual = actual.getSiguiente();
    }
    return false;
  }

  public Persona obtenerPersona(String dni) {
    NodoB actual = primero;
    while (actual != null) {
      if (actual.getPersona().getDni().equals(dni)) {
        return actual.getPersona();
      }
      actual = actual.getSiguiente();
    }
    return null;
  }
}
