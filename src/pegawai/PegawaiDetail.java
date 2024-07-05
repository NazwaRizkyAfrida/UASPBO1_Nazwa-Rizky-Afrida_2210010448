package pegawai;

// Inheritance
public class PegawaiDetail extends Pegawai {

    // Constructor
    public PegawaiDetail(String nama, String nip) {
        super(nama, nip);
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

    public int getNoUrut() {
        return Integer.parseInt(getNip().substring(15, 18));
    }

    // Polymorphism overriding
    @Override
    public String pegawaiInfo() {
        return super.pegawaiInfo() +
                "\nTanggal Lahir\t: " + getTanggalLahir()+
                "\nPengangkatan\t: " + getPengangkatan() +
                "\nJenis Kelamin\t: " + getJenisKelamin() +
                "\nNomor Urut\t: " + getNoUrut();
    }
}
