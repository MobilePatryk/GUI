public class SumMaker implements Runnable {
    private int[] tab;
    private int suma=0;
    private int start;
    private int end;


    public SumMaker(int [] tab , int start , int end) {
        this.tab = tab;
        this.start = start ;
        this.end = end;
    }



    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            suma += tab[i];
        }
    }
}
