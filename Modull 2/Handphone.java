public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;

    }
    
    @Override
    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. %nSelain itu handphone ini juga memiliki fingerprint", drive, ram, processor);
        } else {
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. %nSelain itu handphone ini juga tidak memiliki fingerprint", drive, ram, processor);
        }
    }
    public void telfon(int no_hp){
        System.out.printf("%nHandphone berhasil menyambungkan telfon ke No %s", no_hp);
    }
    public void sms(int no_hp){
        System.out.printf("%nHandphone berhasil menyambungkan telfon ke No %s", no_hp);
    }
    public void sms (int no_hp1, int no_hp2){
        System.out.printf("%nHandphone berhasil menyambungkan telfon ke No %s", no_hp1, no_hp2);
    }
}
