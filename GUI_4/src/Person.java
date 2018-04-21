public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Person(String i, String n, int w){
        this.imie = i;
        this.nazwisko = n;
        this.wiek = w;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String toString(){
        return imie + " " + nazwisko + " " + wiek;
    }
}
