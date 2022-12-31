public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahkursi, int biaya, String mesin){
        super(jumlahkursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.printf("Transportasi Air jenis Kapal dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp.%d %n", jumlahkursi,biaya);
    }

    public void berlayar(){
        System.out.printf("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan tidak stabil %n",mesin);
    }

    public void berlayar(int kecepatan){
        System.out.printf("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di kisaran %d knot %n",mesin,kecepatan);
    }
    
    public void berlabuh(){
        System.out.printf("Transportasi Air jenis Kapal berlabuh di pantai");
    }
}
