public class staff {
    protected int tarif;
    protected int hasil;

    public staff(){
        this.tarifGaji(30);
        System.out.println("Gaji staf adalah : ");
    }
    public void tarifGaji(int tarif) {
        hasil = tarif * 30;
    }
}
