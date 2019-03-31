
public class Pizza extends Receta implements FastFoodeable {

	private Tamaño tamaño;

	public Pizza() {
		super();
	}

	public Pizza(String nombre, String[] ingredientes, Lista pasosPreparacion, Tamaño tamaño) {

		super(nombre, ingredientes, pasosPreparacion);
		this.tamaño=tamaño;

	}
	
	public Pizza(String nombre) {
		super(nombre);
		
	}


	public Pizza(Tamaño tamaño) {
		super();
		this.tamaño = tamaño;
	}

	@Override
	public Tiempo tiempoDePreparacion() {

		Tiempo t = tiempoDePreparacion();

		return t;
	}

	@Override
	public boolean isVegetariano() {
	
		return false;
	}

	@Override
	public Preparacion tipoPreparacion() {
		
		return Preparacion.AlHorno;
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
