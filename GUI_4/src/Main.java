import java.util.Random;

public class Main {

    public static void printValidInts(int[] tab, IntTester tester) {
        for (int x : tab) {
            if (tester.isIntValid(x)) {
                System.out.println( x ) ;
            } }
    }

    public static void printGoodInts(int[] tab, IntPairTester tester) {
        for (int i=0;i<tab.length-1; i++) {
            if (tester.isIntGood(tab[i],tab[i+1])) {
                System.out.println( tab[i]+ " " +tab[i+1] ) ;
            } }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        int[] tab = new int[25];

        Random generator = new Random();
        for(int i = 0; i<tab.length; i++)
        {
            tab[i] = generator.nextInt(100) + 1;
        }
        System.out.println("Drukujemy nasze inty!");
        for(int x : tab){
            System.out.println(x);
        }
        System.out.println("Koniec naszych intow z tablicy!");
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

        printGoodInts(tab, (x,y) -> x+y > 100);
        printGoodInts(tab, (x,y) -> x*y > 250);





        int[] tab1 = new int[1000];

        Random generator1 = new Random();
        for(int i = 0; i<tab1.length; i++)
        {
            tab1[i] = generator1.nextInt(100) + 1;
        }

        Thread[] w = new Thread[10];
        for (int i = 0; i < 10; i++) {
            w[i] = new Thread(new SumMaker(tab,100*i,100*(i+1)));
            w[i].start();

        }
        int suma1;
        for(Thread x : w){
            x.join();
            suma1 += x.
        }


    }
}
