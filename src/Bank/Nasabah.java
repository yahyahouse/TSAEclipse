package Bank;

public class Nasabah {
    public String namaDepan;
    public String namaBelakang;
    private Rekening [] daftarRekening;
    private int jumlahRekening = 0;
    public Nasabah(String namaDepan, String namaBelakang){
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        daftarRekening = new Rekening[5];
    }

    public void bukaRekening(Rekening rek){
        System.out.println(namaBelakang+" Membuka rekenign baru");
        daftarRekening[jumlahRekening] = rek;
        jumlahRekening++;
    }

    public void cetakInfoNasabah(){
        System.out.println("Nama Nasabah "+namaDepan+" "+namaBelakang);
        System.out.println("Rekening yang dimiliki ");
        for (int i =0;i<daftarRekening.length;i++){
            System.out.println("Rekening ke -"+(i+1)+" Saldo Akhir "+daftarRekening[i]);
        }
    }
}
