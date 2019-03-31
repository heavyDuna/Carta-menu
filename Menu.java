import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Menu implements FastFoodeable {

	private TreeSet menu;
	private String titulo;

	public Menu(String titulo, Comparator c) {

		this.titulo = titulo;
		this.menu = new TreeSet(c); 										// añadir comparador por orden no natural
	}

	/*
	 public Menu (String titulo,TreeSet m) { 				//otra opción
	 super(); 
	 this.menu = m;
	 this.titulo=titulo; 	
	 																	 
	 }
	 */
	
	/*public Menu(String titulo) {						{		//otra opción
		this.titulo = titulo;
		this.menu = new TreeSet(new ComparadorPorDescripcion());
	}*/
	
	public void add(FastFoodeable f) {
		
		this.menu.add(f);
	}

	public TreeSet getMenu() {
		return menu;
	}

	public void setMenu(TreeSet menu) {
		this.menu = menu;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Tiempo tiempoPreparacionMenu() {
		
		Tiempo t = new Tiempo (0,0);
		FastFoodeable f;
		Iterator it= this.menu.iterator();
		
		while (it.hasNext()){
			f= (FastFoodeable)it.next();
			t.suma(f.tiempoDePreparacion());
		}
		
		return t;

	}

	public Tiempo tiempoMedio() {

		Tiempo t= new Tiempo(0,0);
		FastFoodeable f;
		int cont=0;
		
		Iterator it= this.menu.iterator();
		
		while(it.hasNext()){
			cont++;
			f=(FastFoodeable)it.next();
			t.suma(f.tiempoDePreparacion());
			
		}
		t.division(cont);
		return t;
	}

	public String toString() {

		String s = "";
		String x;

		Iterator it = this.menu.iterator();
		while (it.hasNext()) {

			x = (String) it.next();
			s = s + x.toString();

		}
		return s;
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

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

}
