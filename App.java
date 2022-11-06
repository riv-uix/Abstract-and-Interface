package bangunruang;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		double sisi, panjang, lebar, tinggi, jari;

		System.out.println("Pilih Bangun Ruang: ");
		System.out.println("1. Kubus");
		System.out.println("2. Balok");
		System.out.println("3. Tabung");
		System.out.println("4. Bola");
		System.out.print("Pilihan: ");
		pilihan = input.nextInt();

		switch(pilihan) {
		case 1:
			System.out.print("Masukkan sisi: ");
			sisi = input.nextDouble();
			Kubus kubus = new Kubus(sisi);
			System.out.println("Volume: " + kubus.getVolume());
			kubus.calcVolume();
			kubus.calcLuasPermukaan();
			break;
		case 2:
			System.out.print("Masukkan panjang: ");
			panjang = input.nextDouble();
			System.out.print("Masukkan lebar: ");
			lebar = input.nextDouble();
			System.out.print("Masukkan tinggi: ");
			tinggi = input.nextDouble();
			Balok balok = new Balok(panjang, lebar, tinggi);
			System.out.println("Volume Balok: " + balok.getVolume());
			balok.calcVolume();
			balok.calcLuasPermukaan();
			break;
		case 3:
			System.out.print("Masukkan jari-jari: ");
			jari = input.nextDouble();
			System.out.print("Masukkan tinggi: ");
			tinggi = input.nextDouble();
			Tabung tabung = new Tabung(jari, tinggi);
			System.out.println("Volume: " + tabung.getVolume());
			tabung.calcVolume();
			tabung.calcLuasPermukaan();
			break;
			default:
		case 4:
			System.out.print("Masukkan jari-jari: ");
			jari = input.nextDouble();
			Bola bola = new Bola(jari);
			System.out.println("Volume: " + bola.getVolume());
			bola.calcVolume();
			bola.calcLuasPermukaan();
			break;
		}
	}
}
