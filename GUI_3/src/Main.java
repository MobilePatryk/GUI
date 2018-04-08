public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person s = new Person("d","s");

        Person[] c = {s};


        Comp bag = new Comp();
        Comp.<>max(c);
    }
}
