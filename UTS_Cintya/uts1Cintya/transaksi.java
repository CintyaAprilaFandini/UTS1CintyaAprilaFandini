public class transaksi {
    public double saldo, saldoAwal, saldoAkhir;
    public String tanggalTransaksi,type;

    void transaksi (double a, double b, double c, String d, String e){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
        type = e;

    }
    void tampil(){
        System.out.println("saldo = " + saldo);
        System.out.println("saldo awal = " + saldoAwal);
        System.out.println("saldo akhir = " + saldoAkhir);
        System.out.println("tanggal transaksi = " + tanggalTransaksi);
        System.out.println("type = " + type);
    }
}
