public class supervisor extends pegawai {
    private int tarif;
    private  int hasil;

    public supervisor(){
        this.tarifGaji(30);
        System.out.println("Gaji Supervisor Adalah : ");
    }
    public void tarifGaji(int tarif){
        hasil = tarif*30;
        System.out.println(hasil);
    }
}
