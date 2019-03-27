import java.util.Comparator;

public class ComparadorNombre implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		FastFoodeable f1 = (FastFoodeable) o1;
		FastFoodeable f2 = (FastFoodeable) o2;

		return f1.getNombre().compareTo(f2.getNombre());		//añadimos este metodo es fastfoodeable

	}

}
