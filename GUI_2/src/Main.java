public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack ();
        for (int i=0; i<10; i++)
            stack.push(i);

        for (int x : stack)
            System.out.println(x);
    }
}
