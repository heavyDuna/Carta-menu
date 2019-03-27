import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Menu {
	
	private TreeSet menu;
	
	public Menu(Comparator c) {
		
		this.menu=new TreeSet(c);												//añadir comparador
	}
	
	/*public Menu (TreeSet t) {
		this.menu = t;			//otra opción
	}*/
	
	
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
