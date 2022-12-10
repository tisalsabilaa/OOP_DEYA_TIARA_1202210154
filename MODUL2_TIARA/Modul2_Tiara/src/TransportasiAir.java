
public class TransportasiAir {
    protected int jumlahkursi;
    protected int biaya;

    public TransportasiAir (int jumlahkursi, int biaya){
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.printf("Transportasi air jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp.%d %n",jumlahkursi,biaya);
    }

    public void berlayar(){
        System.out.print("Transportasi air dengan jenis tidak diketahui sedang berlayar %n");
    }

    public void berlabuh(){
        System.out.print("Transportasi air dengan jenis tidak diketahui sedang berlabuh di pantai %n");
    }
    
}
