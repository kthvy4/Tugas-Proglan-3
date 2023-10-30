import java.util.Scanner;

/**
 * @author via
 */
public class konversiMataUang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih operasi konversi: ");
        System.out.println("1. Dollar ke Rupiah");
        System.out.println("2. Rupiah ke Dollar");
        /**
         * untuk pemilihan konversi
         */
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukkan jumlah Dollar: ");
                double dollars = scanner.nextDouble();
                double rupiahResult = convertDollarToRupiah(dollars);
                System.out.println("Hasil konversi: " + rupiahResult + " Rupiah");
                break;

            case 2:
                System.out.println("Masukkan jumlah Rupiah: ");
                double rupiah = scanner.nextDouble();
                double dollarResult = convertRupiahToDollar(rupiah);
                System.out.println("Hasil konversi: $" + dollarResult);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    /**
     *Fungsi untuk konversi Dollar ke Rupiah
     * @param dollars
     * @return
     * Gantilah nilai ini dengan nilai tukar aktual
     */
    private static double convertDollarToRupiah(double dollars) {
        double exchangeRate = 15000.0;
        return dollars * exchangeRate;
    }

    /**
     *Fungsi untuk konversi Rupiah ke Dollar
     * @param rupiah
     * @return
     * Gantilah nilai ini dengan nilai tukar aktual
     */
    private static double convertRupiahToDollar(double rupiah) {
        double exchangeRate = 0.000067;
        return rupiah * exchangeRate;
    }
}
