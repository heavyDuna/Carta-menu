
public class Sandwich extends Receta implements FastFoodeable {
	
	public Sandwich() {
		super();
	}

	public Sandwich(String nombre, String[] ingredientes, Lista pasosPreparacion) {

		super(nombre, ingredientes, pasosPreparacion);

	}

	@Override
	public Tiempo tiempoDePreparacion() {
		// TODO Auto-generated method stub
		return null;
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

}
