# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Murid`, `Guru`, `Main` dan `Person` adalah contoh dari class.

```bash
public class Person {
    ...
}

public class Murid extends Person {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = Personl(nama, umur);` adalah contoh pembuatan object.

```bash
Person[] orang = new Person[10];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
String nama;
int umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Person(String nama, int umur) {
  this.nama = nama;
  this.umur = umur;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
   // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if(umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur harus positif.");
        }
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class Murid extends Person {
public class Guru extends Person {
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahOrang; i++) {
 System.out.println(orang[i].getDetail());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
Person[] orang = new Person[10];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array penuh. Tidak dapat menambah orang lagi.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Aulia Nurrahman
NPM: 2110010471
