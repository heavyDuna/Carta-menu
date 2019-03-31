import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Carta {

	private Map carta;
	private String titulo;

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
	
	public Tiempo tiempoTotal() {
		
		Tiempo total = new Tiempo (0,0);
		Menu m;
		
		Collection c = this.carta.values();
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			m = (Menu) it.next();
			total.suma(m.tiempoPreparacionMenu());
		}
		
		return total;	
	}

	public Tiempo tiempoMedioCarta() {

		Tiempo medio = new Tiempo(0, 0);
		Menu m;
		int cont = 0;

		Collection c = this.carta.values();
		Iterator it = c.iterator();

		while (it.hasNext()) {

			m = (Menu) it.next();
			medio.suma(m.tiempoPreparacionMenu()); 			// metodo a añadir en menu
			cont++;											// a suma le estoy pasando otro tiempo

		}

		medio.division(cont);
		return medio;

	}

	public Tiempo tiempoMedioMenu(DiaSemana dia) {    			// de un dia en concreto

		Menu m=(Menu) this.carta.get(dia);	
		
		return m.tiempoMedio();												
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
