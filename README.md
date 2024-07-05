# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan nip dari Pegawai, dan memberikan output berupa informasi detail dari nip tersebut seperti tanggal lahir, pengangkatan, jenis kelamin, dan nomor urut.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiDetail`, dan `PegawaiBeraksi` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiDetail extends Pegawai {
    ...
}

public class PegawaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `toko[i] = new TokoOnlineDetail(idToko, namaToko);` adalah contoh pembuatan object.

```bash
pegawaiPns[i] = new PegawaiDetail(nama, nip);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nip` adalah contoh atribut.

```bash
String nama;
String nip;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan `PegawaiDetail`.

```bash
public Pegawai(String nama, String nip) {
    this.nama = nama;
    this.nip = nip;
}

public PegawaiDetail(String nama, String nip) {
    super(nama, nip);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNip` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNip(String nip) {
    this.nip = nip;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNip`, `getTanggalLahir`, `getPengangkatan`, `getJenisKelamin`, dan `getNoUrut` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNip() {
    return nip;
}

public String getTanggalLahir() {
    String tahun = getNip().substring(0, 4);
    String bulan = getNip().substring(4, 6);
    String tanggal = getNip().substring(6, 8);
    return tanggal + "-" + bulan + "-" + tahun;
}

public String getPengangkatan() {
    String tahun = getNip().substring(8, 12);
    String bulan = getNip().substring(12, 14);
    return bulan + "-" + tahun;
}

public String getJenisKelamin() {
    String jk = getNip().substring(14, 15);
    if (jk.equals("1")) {
        return "Laki-Laki";
    } else if(jk.equals("2")){
        return "Perempuan";
    } 
    return null;
}

public int getNoUrut() {
    return Integer.parseInt(getNip().substring(15, 18));
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nip` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nip;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PegawaiDetail` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class PegawaiDetail extends Pegawai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `pegawaiInfo(String)` di `Pegawai` merupakan overloading method `pegawaiInfo` dan `pegawaiInfo` di `PegawaiDetail` merupakan override dari method `pegawaiInfo` di `Pegawai`.

```bash
public String pegawaiInfo(String kementerian) {
    return pegawaiInfo() + "\nKementerian\t: " + kementerian;
}

@Override
public String pegawaiInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getJenisKelamin`.

```bash
public String getJenisKelamin() {
    String jk = getNip().substring(14, 15);
    // Seleksi switch case
    switch(jk) {
        case "1":
            return "Laki-Laki";
        case "2":
            return "Perempuan";
        default:
            return null;
    }
}

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < pegawaiPns.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pegawai " + (i+1) + "\t: ");
String nama = scanner.nextLine();

System.out.println("======================================");
System.out.println("Data Pegawai " + (i + 1)               );
System.out.println("======================================");
System.out.println(pegawaiPns[i].pegawaiInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PegawaiDetail[] pegawaiPns = new PegawaiDetail[2];` adalah contoh penggunaan array.

```bash
PegawaiDetail[] pegawaiPns = new PegawaiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan Format Nomor: " + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format NIP: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
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

Nama: Nazwa Rizky Afrida
NPM: 2210010448
