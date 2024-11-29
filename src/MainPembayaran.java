public class MainPembayaran {
    public static void main(String[] args) {
        Pembayaran kartuKredit = new KartuKredit(5000000);
        Pembayaran transferBank = new TransferBank(3000000);   
        
        kartuKredit.prosesPembayaran(2000000);
        System.out.println("Saldo Kartu Kredit: " + kartuKredit.cekSaldo());

        transferBank.prosesPembayaran(1000000);
        System.out.println("Saldo Rekening Bank: " + transferBank.cekSaldo());
    }
}
