import java.util.Scanner;
public class rekeningMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilih; 
        rekening[] nasabah = new rekening[8]
        nasabah[1]= new rekening ("161006170572", "ariffin", "bin abdul salam", "13578430548", "necElectusjusto.org" );
        nasabah[2] = new rekening ("162404012243", "ismail", "bin mail", "5717062", "convallis@vestibulumanteipsum.org");
        nasabah[3] = new rekening ("162705250112", "jarjit", "singh", "6230234", "portitor.tellus.non@curabitur.ca");
        nasabah[4] = new rekening ("164603294259", "Isnin", "bin Khamis","8977608", "pede.Suspendisse.dui@a.ca" );
        nasabah[5] = new rekening ("163204213437", "Mei Mei", "Xiao","7924447", "non@mus.com" );
        nasabah[6] = new rekening ("161807297229", "Jeanne Roselia", "Fadhullah", "8638209","Pellentesque.ut.ipsum@neque.ca");
        nasabah[7] = new rekening ("169503136823","Shinnosuke", "Nohara", "5926919", "tellus.justo.sit@commodoauctor.net");
        nasabah[8] = new rekening ("168507083528", "Hiroshi", "Nohara", "11153397678","dictum@nec.edu");

        do{
            System.out.println("SISTEM BANK");
            System.out.println("1. TAMPIL DATA");
            System.out.println("2. TAMPIL TRANSAKSI");
            System.out.println("3. MENCARI SALDO > 500000");
            System.out.println("4. SORTING BY NAME");
            System.out.println("5. KELUAR");
            pilih = sc.nextInt();

            switch(pilih){
                case 1 : 
                System.out.println("tampil data")
                rn[i].tampildata;
            }
        }



    }
}
