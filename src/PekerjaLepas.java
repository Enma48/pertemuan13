public class PekerjaLepas extends Pekerja implements Tugas{
    private double tarifPerjam;
    private double jamKerja;

    private PekerjaLepas(String nama, String id, double tarifPerjam, double jamKerjaTerpenuhi) {
        super(nama, id);
        this.tarifPerjam = tarifPerjam;
        this.jamKerjaTerpenuhi = jamKerjaTerpenuhi;
    }

    public double hitungGaji(){
        return 
    }
}
