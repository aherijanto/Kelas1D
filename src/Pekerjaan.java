public class Pekerjaan {
    private static void CetakJudul(){
        String Judul = "Program Pengurangan";
        System.out.println(Judul);
    }

    private static void PenguranganDuaAngka(){
        int angka1 = 20;
        int angka2 = 40;
        int total;
        total = angka1 - angka2;
        System.out.println(total);
    }

    private static void CetakJudulParamater(String Judulku){
        System.out.println(Judulku);
    }

    private static void PenguranganDuaAngkaParams(int angkaku1, int angkaku2){
        int hitung;
        hitung = angkaku1 - angkaku2;
        System.out.println(hitung);
    }

    private static int  PenguranganDuaAngkaReturn(int z,int k){
        int totalHitung;
        totalHitung = z - k;
        return totalHitung;
    }

    private static String GoJek(String[] pesenanPelanggan) {
        for (int index = 0; index < pesenanPelanggan.length; index++) {

            System.out.println("Pesanan " + pesenanPelanggan[index] +  " Anda Di GoJek sedang diproses ");
        }
        return "Pesanan Anda Diterima Oleh Driver GoJek dan Mohon Menunggu";
    }

    private static String AddToCartShopee(String[] isiPesanan){
        for (String s : isiPesanan) {
            System.out.println("Pesenan " + s + " Sedang Dikemas");
        }
        return "Pesanan Anda Diterima oleh Penjual Shopee";
    }

    public static void main(String[] args) {
        Pekerjaan.CetakJudul();
        Pekerjaan.PenguranganDuaAngka();

        Pekerjaan.CetakJudulParamater("Program Pengurangan Dengan Parameter");
        Pekerjaan.PenguranganDuaAngkaParams(60,20);

        int totalnya;
        totalnya = Pekerjaan.PenguranganDuaAngkaReturn(40,50);
        System.out.println("Total Operasi Pengurangan Menggunakan Return = "+totalnya);
        System.out.println("\n SELAMAT DATANG DI GOJEK");
        String[] pesenan={"Nasi Goreng", "Ayam Geprek", "Seblak", "Jintul"};
        String Agung = Pekerjaan.GoJek(pesenan);
        System.out.println(Agung);

        System.out.println("\n SELAMAT DATANG DI SHOPEE, NANTIKAN FLASH SALE 210121");
        String[] orderSaya = {"Lampu LED","Baju","Celana","Sepatu"};
        String Yudi = Pekerjaan.AddToCartShopee(orderSaya);
        System.out.println(Yudi);

    }

}
