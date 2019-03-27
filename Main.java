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
		
		//Carta c1 = new Carta();
		

		System.out.println(r1);
		
		
		//map.Entry
		/*Set <Map.Entry<Alumno, Fecha>> pares;
		Iterator <Map.Entry<Alumno, Fecha>> it;
		Map.Entry<Alumno,Fecha> x;
		Alumno k;
		Fecha v;
		Alumno a =new Alumno("Pepe",44);
		Alumno a =new Alumno("Pepe",44);
		
		Map <Alumno, Fecha>=new HashMap <Alumno, Fecha>();
		
		
		pares=m.entrySet();
		it=pares.iterator();
		
		while(it.hasNext()) {
			x=it.next();
			k=z.getKey();
			v=x.getValue();
			System.out.println(x);
			System.out.println(k);
			System.out.println(v);
		}*/

	}

}
