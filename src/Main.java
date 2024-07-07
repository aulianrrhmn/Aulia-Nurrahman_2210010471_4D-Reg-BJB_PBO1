import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] orang = new Person[10];
        int jumlahOrang = 0;

        while (true) {
            System.out.println("1. Tambah Murid");
            System.out.println("2. Tambah Guru");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            if (pilihan == 4) {
                break;
            }

            try {
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama: ");
                        String namaMurid = scanner.nextLine();
                        System.out.print("Masukkan umur: ");
                        int umurMurid = scanner.nextInt();
                        scanner.nextLine(); // konsumsi newline
                        System.out.print("Masukkan No Absen: ");
                        String noAbsen = scanner.nextLine();
                        System.out.print("Masukkan Kelas: ");
                        String jurusan = scanner.nextLine();
                        orang[jumlahOrang++] = new Murid(namaMurid, umurMurid, noAbsen, jurusan);
                        break;
                    case 2:
                        System.out.print("Masukkan nama: ");
                        String namaGuru = scanner.nextLine();
                        System.out.print("Masukkan umur: ");
                        int umurGuru = scanner.nextInt();
                        scanner.nextLine(); // konsumsi newline
                        System.out.print("Masukkan NUPTK: ");
                        String NUPTK = scanner.nextLine();
                        System.out.print("Masukkan Jam Mengajar: ");
                        String JamMengajar = scanner.nextLine();
                        orang[jumlahOrang++] = new Guru(namaGuru, umurGuru, NUPTK, JamMengajar);
                        break;
                    case 3:
                        for (int i = 0; i < jumlahOrang; i++) {
                            System.out.println(orang[i].getDetail());
                        }
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array penuh. Tidak dapat menambah orang lagi.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
