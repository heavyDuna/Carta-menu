
public class Main {

	public static void main(String[] args) {

		Receta r1 = new Receta();
		r1.addIngrediente("harina");
		r1.addIngrediente("sal");

		Tiempo t1 = new Tiempo(1, 20);
		Paso p1 = new Paso("batir", t1);

		r1.addPaso(p1);

		System.out.println(r1);

	}

}
