public class Bag<T> {
    private T[] object3;

    public void setObject(T Object, int i){
        object3[i] = Object;
    }
    public Bag(){
        this.object3 = (T[])(new Object[3]);
    }

    @Override
    public String toString() {
        return "" + object3[0] + " " + object3[1] + " " + object3[2];
    }
}
