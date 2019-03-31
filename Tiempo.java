public class Tiempo implements Comparable{

	private int hora;
	private int minuto;

	public Tiempo(int hora, int minuto) {

		this.hora = hora;
		this.minuto = minuto;
	}
	
	public Tiempo() {

		this.hora = 0;
		this.minuto = 0;
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

	public void suma(Tiempo t) {

		this.hora = this.hora + t.hora;
		this.minuto = this.minuto + t.minuto;

		while (this.minuto > 59) {

			this.hora++;
			this.minuto = this.minuto - 60;
		}
		
	}
	
	public void division (int n) {
		
		int minutos=this.hora*3600+this.minuto*60+this.minuto;
		minutos=minutos/n;		
		
		this.minuto=minutos%60;
		this.hora=minutos/60;
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
