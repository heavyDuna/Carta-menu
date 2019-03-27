import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Carta {

	private Map carta;
	String titulo;

	public Carta(String titulo) {

		this.carta = new HashMap();
		this.titulo = titulo;

	}

	/*public Carta(String titulo, Map carta) {

		this.carta = carta;
		this.titulo = titulo;

	}*/

	public Map getCarta() {
		return carta;
	}

	public void setCarta(Map carta) {
		this.carta = carta;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void add(DiaSemana dia, Menu m) {

		this.carta.put(dia, m);

	}

	public Tiempo tiempoMedioCarta() {

		Tiempo total = new Tiempo(0, 0);
		Menu m;
		int cont = 0;

		Collection c = this.carta.values();

		Iterator it = c.iterator();

		while (it.hasNext()) {

			cont++;
			m = (Menu) it.next();
			total.suma(m.tiempoTotalMenu()); // metodo a añadir en menu
												// a suma le estoy pasando otro tiempo

		}

		total.division(cont);
		return total;

	}

	public Tiempo tiempoMedioMenu(DiaSemana dia) {

		Menu m=(Menu) this.carta.get(dia);	
		
		return m.tiempoMedio();												// de un dia en concreto
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
