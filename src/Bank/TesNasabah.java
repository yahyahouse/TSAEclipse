package Bank;

public class TesNasabah {
    public static void main(String[] args) {
        Nasabah nas1 = new Nasabah("Yahya","Wijaya");
        nas1.bukaRekening(new Rekening(1000));
        nas1.bukaRekening(new Rekening(2000));
        nas1.cetakInfoNasabah();
    }
}
