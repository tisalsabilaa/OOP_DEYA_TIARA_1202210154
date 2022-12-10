public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat p = new Perangkat("Adata", 5, 1.5f);
        p.informasi();
        System.out.println();

        Laptop q = new Laptop("Seagate", 9, 2.9f, true);
        q.informasi();
        q.bukaGame("Harvest Moon");
        q.email("zizazizu@gmail.com");
        q.email("zizu@gmail.com", "zuzuzu@gmail.com");
        System.out.println();

        Handphone r = new Handphone("Sandisk", 3, 2.7f, false);
        r.informasi();
        r.telfon(628224567);
        r.sms(628983478);
        r.sms(628766309, 628761222);
        System.out.println();
        
    }
    
}
