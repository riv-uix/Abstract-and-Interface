package bangunruang;

class Kubus implements Geometri {
	private double sisi;

	public Kubus(double sisi) {
		this.sisi = sisi;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public double getVolume() {
		return sisi * sisi * sisi;
	}

	public double getLuasPermukaan() {
		return 6 * (sisi * sisi);
	}

	public void calcVolume() {
		System.out.println("Volume Kubus: " + getVolume());
	}

	public void calcLuasPermukaan() {
		System.out.println("Luas Permukaan Kubus: " + getLuasPermukaan());
	}
}
