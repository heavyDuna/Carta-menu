import java.util.Iterator;
import java.util.TreeSet;

public class Menu {
	
	private TreeSet menu;
	
	public Menu() {
		
		this.menu=new TreeSet();
	}
	

	public Tiempo tiempoTotalMenu() {

		return null;
	}
	

	public String toString() {
		
		String s="";
		String x;
		
		Iterator it=this.menu.iterator();
		while(it.hasNext()) {
			
			x=it.hasNext();
			s=s+x.toString();
			
		}
		return s;
	}

}
