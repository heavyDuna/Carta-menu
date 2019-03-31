import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Receta r1 = new Receta();

		r1.setNombre("Bizcocho");
		r1.addIngrediente("harina");
		r1.addIngrediente("sal");

		Tiempo t1 = new Tiempo(1, 20);
		Paso p1 = new Paso("batir", t1);

		Tiempo t2 = new Tiempo(0, 15);
		Paso p2 = new Paso("mezclar", t2);

		r1.addPaso(p1);
		r1.addPaso(p2);

		r1.tiempoTotal();
		
		System.out.println(r1);
		
		System.out.println("------------------------------------------------");

		
		//OTRA RECETA

		Receta r2 = new Receta();

		r2.setNombre("Tortilla");
		r2.addIngrediente("huevos");
		r2.addIngrediente("patatas");
		r2.addIngrediente("cebolla");

		Tiempo t3 = new Tiempo(0, 10);
		Paso p3 = new Paso("cortar", t3);

		Tiempo t4 = new Tiempo(1, 10);
		Paso p4 = new Paso("freir", t4);

		r2.addPaso(p3);
		r2.addPaso(p4);

		r2.tiempoTotal();

		System.out.println(r2);
		
		// Carta c1 = new Carta();
		

		// map.Entry
		/*
		 * Set <Map.Entry<Alumno, Fecha>> pares; 
		 * Iterator <Map.Entry<Alumno, Fecha>> it;
		 * Map.Entry<Alumno,Fecha> x; 
		 * Alumno k; 
		 * Fecha v; 
		 * Alumno a =new  lumno("Pepe",44); 
		 * Alumno a =new Alumno("Pepe",44);
		 * 
		 * Map <Alumno, Fecha>=new HashMap <Alumno, Fecha>();
		 * 
		 * 
		 * pares=m.entrySet(); 
		 * it=pares.iterator();
		 * 
		 * while(it.hasNext()) { 
		 * 	x=it.next(); 
		 * 	
		 * 	k=z.getKey(); 
		 * 	v=x.getValue();
		 * 
		 * System.out.println(x); 
		 * System.out.println(k); 
		 * System.out.println(v); }
		 */

	}

}
