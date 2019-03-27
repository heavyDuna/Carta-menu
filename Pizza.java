
public class Pizza extends Receta implements FastFoodeable {

	public Pizza() {
		super();
	}

	public Pizza(String nombre, String[] ingredientes, Lista pasosPreparacion) {

		super(nombre, ingredientes, pasosPreparacion);

	}

	@Override
	public Tiempo tiempoDePreparacion() {

		Tiempo t = tiempoDePreparacion();

		return t;
	}

	@Override
	public boolean isVegetariano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Preparacion tipoPreparacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNombre() {
		
		return this.getNombre();

	}

	@Override
	public String toString() {
		return "Pizza [tiempoDePreparacion()=" + tiempoDePreparacion() + ", isVegetariano()=" + isVegetariano()
				+ ", tipoPreparacion()=" + tipoPreparacion() + "]";
	}

}
