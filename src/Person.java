public class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

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

    // Polymorphism (method overriding)
    public String getDetail() {
        return "Nama: " + nama + ", Umur: " + umur;
    }
}
