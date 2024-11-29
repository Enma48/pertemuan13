abstract class Bentuk { // Class bentuk abstrak
    public abstract double hitungLuas(); // Method abstrak hitungLuas untuk menghitung luas
    
    public void tampilkanLuas(){ // Method untuk menampilkan luas
        System.out.println("Luas bentuk adalah: " + hitungLuas()); // Mencetak luas dengan Memanggil method hitungLuas()
    }
}
