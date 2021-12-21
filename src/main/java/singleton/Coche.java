package singleton;

public class Coche {
	private String marca;
	private static Coche coche;

	private Coche(String marca){
		this.marca = marca;
	}
	public static Coche getCoche(String marca){
		if(coche == null) {
			coche = new Coche(marca);
		}
		return coche;
	}
	public String getmarca() {
		return marca;
	}
	public void setmarca(String marca) {
		this.marca = marca;
	}
	public static void setCoche(Coche Coche) {
		Coche coche = Coche;
	}
}
