package bangunruang;

class Bola implements Geometri {
	private double jari;

	public Bola(double jari) {
		this.jari = jari;
	}

	public double getJari() {
		return jari;
	}

	public void setJari(double jari) {
		this.jari = jari;
	}

	public double getVolume() {
		return (4 * phi * (jari * jari * jari)) / 3;
	}

	public double getLuasPermukaan() {
		return 4 * phi * (jari * jari);
	}

	public void calcVolume() {
		System.out.println("Volume Bola: " + getVolume());
	}

	public void calcLuasPermukaan() {
		System.out.println("Luas Permukaan Bola: " + getLuasPermukaan());
	}
}
