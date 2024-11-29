public class MainKendaraan {
    public  static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.tampilkanJenis();
        System.out.println("Kecepatan maksimum mobil: " + mobil.kecepatanMaksimum() + " km/jam");

        sepeda.tampilkanJenis();
        System.out.println("Kecepatan maksimum sepeda: " + mobil.kecepatanMaksimum() + " km/jam");

    }
}
