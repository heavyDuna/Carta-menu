import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Carta {

	private Map carta;

	public Carta(Map carta) {

		this.carta = carta;

	}

	public void add(DiaSemana dia, Menu m) {

		this.carta.put(dia, m);

	}

	public Tiempo tiempoMedioMenu(DiaSemana dia) {

		Tiempo t;
		Menu m;

		m = (Menu) this.carta.get(dia);
		t = m.tiempoTotalMenu(); 								// metodo que hay que crear en menu

		return t;

	}

	public boolean existeClave(DiaSemana dia) {					//si existe o no la clave

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
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
