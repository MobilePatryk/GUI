public class Person {
    String imie,nazwisko;


    void Person(String i, String n){
        imie = i;
        nazwisko = n;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }

    String getImie(){
        return imie;
    }

    String getNazwisko(){
        return nazwisko;
    }
}
