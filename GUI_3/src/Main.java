public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Integer[] c = {1,2,3,4};

        Comp bag = new Comp();
        Comp.<Integer>max(c);
    }
}
