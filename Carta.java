import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Carta {

	private Map carta;

	public Carta() {

		this.carta = new HashMap();

	}

	public void add(DiaSemana dia, Menu m) {

		this.carta.put(dia, m);

	}

	public Tiempo tiempoMedioCarta() {

		Tiempo total= new Tiempo(0,0);
		Menu m;
		
		Iterator it = this.carta.values().iterator();
		
		while(it.hasNext()) {
			
			m=(Menu) it.next();
			total.suma(m.tiempoTotalMenu());
		}
		

		
		return total;

	}

	public boolean existeClave(DiaSemana dia) { // si existe o no la clave

		boolean existe = false;
		Set s = this.carta.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			if (dia.equals((DiaSemana) it.next())) {

				existe = true;
			}
		}

		return existe;

	}

	public boolean existeConjuntoParejas() {

		boolean existe = false;
		Set s = this.carta.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		return existe;

	}

	public String mostrarPraresValores() {

		String s = "";

		String[] claveValor = new String[2];
		String par;

		Set pares = this.carta.entrySet();
		Iterator it = pares.iterator();

		while (it.hasNext()) {

			par = (String) it.next().toString();
			claveValor = par.split("=");

			s = s + "Clave: " + claveValor[0] + "Menu: " + claveValor[1];

		}
		
		return s;
	}

}
