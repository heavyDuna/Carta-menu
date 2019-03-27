public class Tiempo {

	private int hora;
	private int minuto;

	public Tiempo(int hora, int minuto) {

		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public Tiempo suma(Tiempo t) {

		this.hora = this.hora + t.hora;
		this.minuto = this.minuto + t.minuto;

		while (this.minuto >= 60) {

			this.hora++;
			this.minuto = this.minuto - 60;
		}
		return t;
	}

	public int compareTo(Object o) {
		Tiempo t = (Tiempo) o;

		if (this.hora > t.hora) {
			return 1;
		} else {

			if (this.hora < t.hora) {
				return -1;
			} else {

				if (this.minuto > t.minuto) {
					return 1;

				} else {

					if (this.minuto < t.minuto) {
						return -1;

					} else {

						return 0;
					}

				}
			}
		}
	}

	@Override
	public String toString() {
		return "Tiempo [hora=" + hora + ", minuto=" + minuto + "]";
	}

}
