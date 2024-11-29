class Lingkaran extends Bentuk {
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungLuas(){
        return Math.PI * jariJari * jariJari;
    }

}