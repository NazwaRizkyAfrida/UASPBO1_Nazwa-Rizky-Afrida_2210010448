package pegawai;

// class Pegawai
public class Pegawai {
    // Attributes dengan Encapsulation
    private String nama;
    private String nip;
    
    // Constructor
    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
    
    // method pegawaiInfo
    public String pegawaiInfo() {
        return "Nama\t\t: " + getNama() +
               "\nNIP\t\t: " + getNip();
    }
    
    // Polymorphism Overloading
    public String pegawaiInfo(String kementerian) {
        return pegawaiInfo() + "\nKementerian\t: " + kementerian;
    }
}
