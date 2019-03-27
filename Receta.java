import java.util.Arrays;

public class Receta {

	private String nombre;
	private String[] ingredientes;
	private Lista pasosPreparacion;

	public Receta(String nombre, String[] ingredientes, Lista pasosPreparacion) {
		this.nombre = nombre;
		this.ingredientes = ingredientes;
		this.pasosPreparacion = pasosPreparacion;

	}

	public Receta() {

		this.ingredientes = new String[0];
		// this.ingredientes = new String[10];
		// this.n=n;
		this.pasosPreparacion = new Lista();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Lista getPasosPreparacion() {
		return pasosPreparacion;
	}

	public void setPasosPreparacion(Lista pasosPreparacion) {
		this.pasosPreparacion = pasosPreparacion;
	}

	public void ampliar() {
		String[] aux = new String[this.ingredientes.length + 1];
		int i = 0;
		while (i < this.ingredientes.length) {
			aux[i] = this.ingredientes[i];
			i++;
		}
		this.ingredientes = aux;
	}

	public void addIngrediente(String ingrediente) {

		ampliar();
		// System.out.println(Arrays.toString(this.ingredientes));

		this.ingredientes[this.ingredientes.length - 1] = ingrediente;
		// this.ingredientes[this.n]=ingrediente;
		// this.n++;

	}

	public void addPaso(Paso p) {

		this.pasosPreparacion.add(p);

	}

	public void tiempoTotal() {

		this.pasosPreparacion.tiempoTotal();

	}

	@Override
	public String toString() {
		return "Nombre receta: " + nombre + "\n" + "Ingredientes: " + Arrays.toString(ingredientes) + "\n" + "Pasos: "
				+ pasosPreparacion;
	}

	/*
	 * public String toString() {
	 * 
	 * String s = "Ingredientes:" + Arrays.toString(ingredientes) + "\n" + "Pasos: "
	 * + "\n" + pasosPreparacion;
	 * 
	 * return s;
	 * 
	 * }
	 */

}
