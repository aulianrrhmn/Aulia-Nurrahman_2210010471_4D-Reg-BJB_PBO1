public class Murid extends Person {
    private String noAbsen;
    private String kelas;

    public Murid(String nama, int umur, String noAbsen, String kelas) {
        super(nama, umur);
        this.noAbsen = noAbsen;
        this.kelas = kelas;
    }

    public String getNoAbsen() {
        return noAbsen;
    }

    public String getKelas() {
        return kelas;
    }

    public void setNoAbsen(String noAbsen) {
        this.noAbsen = noAbsen;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", No Absen: " + noAbsen + ", Kelas: " + kelas;
    }
}
