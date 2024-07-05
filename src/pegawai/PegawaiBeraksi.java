package pegawai;

// Import IO
import java.util.Scanner;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        
        // Error Handling
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in);

            // Array
            PegawaiDetail[] pegawaiPns = new PegawaiDetail[2];

            // Perulangan 
            for (int i = 0; i < pegawaiPns.length; i++) {
                System.out.print("Masukkan Nama Pegawai " + (i+1) + "\t: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIP Pegawai " + (i+1) + "\t: ");
                String nip = scanner.nextLine();    
                System.out.println("");

                // Object
                pegawaiPns[i] = new PegawaiDetail(nama, nip);
            }

            // Perulangan
            for (int i = 0; i < pegawaiPns.length; i++) {
                System.out.println("======================================");
                System.out.println("Data Pegawai " + (i + 1)               );
                System.out.println("======================================");
                System.out.println(pegawaiPns[i].pegawaiInfo());
                System.out.println("");
            }

        } catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format NIP: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}
