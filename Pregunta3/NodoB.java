public class NodoB {
  private Persona persona;
  private NodoB siguiente;

  public NodoB(Persona persona, NodoB siguiente) {
    this.persona = persona;
    this.siguiente = siguiente;
  }

  public Persona getPersona() {
    return persona;
  }

  public NodoB getSiguiente() {
    return siguiente;
  }

  public void setSiguiente(NodoB siguiente) {
    this.siguiente = siguiente;
  }
}
