public class rekening {
    public String noRekening;
    public String namaDepan;
    public String namaBelakang;
    public String phone;
    public String email;
    
    
    public void rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        phone = d;
        email = e;
    }
    void tampil(){
        System.out.println("No rekening = " + noRekening);
        System.out.println("Nama Depan = " + namaDepan);
        System.out.println("Nama Belakang = " + namaBelakang);
        System.out.println("nomor HP = " + phone);
        System.out.println("email = " + email);
    }
}
