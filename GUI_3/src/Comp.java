public class Comp {
    public static <T extends Comparable<T>> T max(T[] tab) {
        T max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max.compareTo(tab[i]) > 0) {
                max = tab[i];
            }
        }
        return max;
    }

}


    //java tutorials generics


