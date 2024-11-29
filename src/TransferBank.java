class TransferBank implements Pembayaran{
    private double saldoRekening; 

    public TransferBank(double saldoRekening){
        this.saldoRekening = saldoRekening;
    }

    public void prosesPembayaran(double jumlah){
        if (jumlah <= saldoRekening) {
            saldoRekening -= jumlah;
            System.out.println("Pembayaran melalui Transfer Bank sebesar " + jumlah + " berhasil.");
        } else {
            System.out.println("Saldo tidak cukup di rekening");
        }
    }

    public double cekSaldo(){
        return saldoRekening;
    }
}
