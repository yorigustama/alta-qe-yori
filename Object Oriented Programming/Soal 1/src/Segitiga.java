public class Segitiga {
    int alas;
    int tinggi;
    int sisi1, sisi2, sisi3;


    public Segitiga(int alas, int tinggi, int sisi1, int sisi2, int sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public int hitungLuasSegitiga(){
        return (this.alas * this.tinggi) /2;
    }
    public int hitungKelilingSegitiga(){
        return this.sisi1 + this.sisi2 + this.sisi3;
    }

}
