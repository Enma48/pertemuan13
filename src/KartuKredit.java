class KartuKredit implements Pembayaran{ // Class KartuKredit mengimplementasi Class Pembayaran
    private double limitSaldo; // Atribut limitSaldo

    public KartuKredit(double limitSaldo){ // Constructor
        this.limitSaldo = limitSaldo; // Inisialisasi
    }

    public void prosesPembayaran(double jumlah){ // Method prosesPembayaran untuk melakukan proses pembayaran
        if (jumlah <= limitSaldo){ // Jika jumlah pembayaran tidak melebihi limitSaldo
            limitSaldo -= jumlah; // Kurangi limitSaldo
            System.out.println("Pembayaran melalui Kartu Kredit sebesar " + jumlah + " berhasil."); // Cetak jumlah pembayaran yang berhasil dilakukan
        } else{ // Jika jumlah pembayaran melebihi limitSaldo
            System.out.println("Saldo tidak cukup di Kartu Kredit"); // Cetak pesan bahwa saldo tidak cukup
        }
    }

    public double cekSaldo(){ // Method cekSaldo untuk mengecek saldo
        return limitSaldo; // Kembalikan nilai limitSaldo
    }
}
