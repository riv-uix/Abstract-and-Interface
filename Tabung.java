package bangunruang;

public class Tabung {
	protected static final double phi = 0;
	protected double jari;
	private double tinggi;

	public Tabung(double jari, double tinggi) {
		this.jari = jari;
		this.tinggi = tinggi;
	}

	public double getJari() {
		return jari;
	}

	public void setJari(double jari) {
		this.jari = jari;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getVolume() {
		return phi * (jari * jari) * tinggi;
	}

	public double getLuasPermukaan() {
		return 2 * phi * jari * (jari + tinggi);
	}

	public void calcVolume() {
	}

	public void calcLuasPermukaan() {
	}


}
