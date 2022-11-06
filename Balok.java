package bangunruang;

public class Balok {
	private double panjang;
	private double lebar;
	private double tinggi;

	public Balok(double panjang, double lebar, double tinggi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getVolume() {
		return panjang * lebar * tinggi;
	}

	public double getLuasPermukaan() {
		return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
	}

	public void calcVolume() {
	}

	public void calcLuasPermukaan() {
	}

}
