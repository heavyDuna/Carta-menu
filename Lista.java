
public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;
	}

	public Nodo getCom() {
		return this.com;
	}

	public void setCom(Nodo com) {
		this.com = com;
	}

	public void addPrincipio(Paso p) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(p);
		this.com = nuevo;
	}

	public void add(Paso p) {

		Nodo nuevo = new Nodo();
		Nodo n = this.com;

		if (n == null) {

			this.addPrincipio(p);

		} else {

			while (n.getSig() != null) {

				n = n.getSig();
			}

			nuevo.setInfo(p);
			n.setSig(nuevo);

		}
	}

	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = p.toString();
			p = p.getSig();
		}

		return l;

	}

	/*
	 * public void addNodo(Nodo nuevo) { // con lista sin nodos
	 * 
	 * if (this.com == null) {
	 * 
	 * this.com = nuevo;
	 * 
	 * } else {
	 * 
	 * while (this.com != null) {
	 * 
	 * this.com = this.com.getSig(); }
	 * 
	 * this.com.setSig(nuevo);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public void addPrincipio(Nodo nuevo) { // habiendo nodos en la lista
	 * 
	 * nuevo.setSig(this.com); this.com = nuevo; }
	 * 
	 * public void recorrer() {
	 * 
	 * Nodo p; p = com;
	 * 
	 * while (p != null) { p.getInfo(); p = p.getSig(); } }
	 * 
	 * public Nodo busquedaOrdenada(int dato) {
	 * 
	 * Nodo p; Nodo pos; p = com;
	 * 
	 * while (p != null && p.getInfo() < dato) { p = p.getSig();
	 * 
	 * }
	 * 
	 * if (p == null || p.getInfo() > dato) {
	 * 
	 * pos = null;
	 * 
	 * } else {
	 * 
	 * pos = p; }
	 * 
	 * return pos;
	 * 
	 * }
	 * 
	 * public Nodo busquedaDesordenada(int dato) {
	 * 
	 * Nodo p; Nodo pos; p = com; boolean esta = false;
	 * 
	 * while (p != null || esta == false) {
	 * 
	 * if (p.getInfo() == dato) { pos = p; esta = true; }
	 * 
	 * p = p.getSig(); }
	 * 
	 * if (esta == false) {
	 * 
	 * pos = null; }
	 * 
	 * return pos;
	 * 
	 * }
	 */

}