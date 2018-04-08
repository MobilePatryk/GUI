import java.util.Random;

public class Main {

    public static void printValidInts(int[] tab, IntTester tester) {
        for (int x : tab) {
            if (tester.isIntValid(x)) {
                System.out.println( x ) ;
            } }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] tab = new int[25];

        Random generator = new Random();
        for(int i = 0; i<10; i++)
        {
            tab[i] = generator.nextInt(100) + 1;
        }

        printValidInts(tab, x-> x%3==0 && x%4!=0);
        printValidInts(tab, x-> x>50);
        printValidInts(tab, x->
        {
            if (x%2==0) return false;
            //if not, then just check the odds
            for(int i=3;i*i<=x;i+=2) {
                if(x%i==0)
                    return false;
            }
            return true;
        });


    }
}
