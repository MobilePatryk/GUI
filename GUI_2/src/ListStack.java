public class ListStack implements Stack {


    private class Value{
        int v;
        Value prev;

        Value(int x, Value Prev)
        {
            v = x;
            prev = Prev;
        }
    }



    // -------------------------- //

    Value first;

    ListStack(){
        first = null; //zaimplementuj obiekt Value nullem
    }



    @Override
    public int pop() {
        return 0;
    }

    @Override
    public void push(int elt) {
        Value s = new Value(elt,first);
        first = s;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public boolean full() {
        return false;
    }
}
