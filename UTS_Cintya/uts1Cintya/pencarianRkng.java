public class pencarianRkng {
    rekening listNasabah[];
    int idx;

    void tambah(rekening m){
        if (idx < listNasabah.length){
            listNasabah[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah penuh");
        }
    }
    void tampil(){
        for(rekening m : listNasabah){
            m.tampil();
            System.out.println("--------------------");
        }
    }
    public int findseqSearch(String cari){
        int posisi = -1;
        for(int j = 0; j <listNasabah.length; j++){
            if(listNasabah[j].noRekening == cari){
                posisi = j;
                break;
            }
            return posisi;
        }
    }
    public void tampilData ( String x, int pos){
        if (pos!= -1) {
            System.out.println("no rekening\t : " + x);
            System.out.println("Nama\t : " + listNasabah[pos].namaDepan);
            System.out.println("nama belakang\t : " + listNasabah[pos].namaBelakang);
            System.out.println("no Hp\t : " + listNasabah[pos].phone);
            System.out.println("email\t : " + listNasabah[pos].email);
            
        }else{
            System.out.println("Data " + x + "Tidak ditemukan");
        }
    }
    public void bubbleSort(){
        for(int i=0; i<listNasabah.length-1; i++) {
            for(int j=1; j<listNasabah.length-i; j++) {
                if(listNasabah[j].namaDepan > listNasabah[j-1].namaDepan) {
                    rekening tmp = listNasabah[j];
                    listNasabah[j] = listNasabah[j-1];
                    listNasabah[j-1] = tmp;
                }
            }
        }  
    }
}