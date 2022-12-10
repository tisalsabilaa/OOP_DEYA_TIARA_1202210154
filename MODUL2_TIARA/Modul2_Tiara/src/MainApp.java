public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir T = new TransportasiAir(40, 25000);
        T.informasi();
        T.berlayar();
        T.berlabuh();
        System.out.println();


        Sampan s = new Sampan(30, 20000, 3);
        s.informasi();
        s.berlayar();
        s.berlabuh();
        s.berlabuh(2);
        System.out.println();


        Kapal k = new Kapal(25, 45000, "Diesel");
        k.informasi();
        k.berlayar();
        k.berlayar(25);
        k.berlabuh();
        System.out.println();
        
    }
    
}
