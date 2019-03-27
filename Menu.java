import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Menu {
	
	private TreeSet menu;
	private String titulo;
	
	public Menu(String titulo,Comparator c) {
		
		this.titulo=titulo;		
		this.menu=new TreeSet(c);												//añadir comparador
	}
	
	/*public Menu (String titulo,TreeSet m) {
	 	super();
		this.menu = m;	
		this.titulo=titulo;														//otra opción
	}*/
	
	public Tiempo tiempoMedio() {
		
	
		return null;
	}
	
	public Tiempo tiempoTotalMenu() {

		return null;
	}
	

	public String toString() {
		
		String s="";
		String x;
		
		Iterator it=this.menu.iterator();
		while(it.hasNext()) {
			
			x=(String) it.next();
			s=s+x.toString();
			
		}
		return s;
	}

	

	

}
