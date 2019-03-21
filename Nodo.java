
public class Nodo {

	private Paso info;
	private Nodo sig;

	public Nodo() {

	}

	public Nodo(Paso info, Nodo sig) {

		this.info = info;
		this.sig = sig;
	}

	public Paso getInfo() {
		return info;
	}

	public void setInfo(Paso info) {
		this.info = info;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	public String toString() {

		String S = "Nodo";

		S = this.info + " " + "--> ";

		return S;

	}

}
