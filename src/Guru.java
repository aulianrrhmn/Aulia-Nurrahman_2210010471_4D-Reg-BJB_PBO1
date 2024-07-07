public class Guru extends Person {
    private String NUPTK;
    private String JamMengajar;

    public Guru(String nama, int umur, String NUPTK, String JamMengajar) {
        super(nama, umur);
        this.NUPTK = NUPTK;
        this.JamMengajar = JamMengajar;
    }

    public String getNUPTK() {
        return NUPTK;
    }

    public String getJamMengajar() {
        return JamMengajar;
    }

    public void setNUPTK(String NUPTK) {
        this.NUPTK = NUPTK;
    }

    public void setDepartemen(String JamMengajar) {
        this.JamMengajar = JamMengajar;
    }

    @Override
    public String getDetail() {
        return super.getDetail() + ", NUPTK: " + NUPTK + ", Jam Mengajar: " + JamMengajar;
    }
}
