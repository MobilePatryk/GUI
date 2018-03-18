import java.util.Iterator;

public class ArrayStack implements Stack, Iterable<Integer> {
    int length=0;
    int[] content = new int[20];

    @Override
    public int pop() {
        length-=1;
       return content[length+1];
    }

    @Override
    public void push(int elt) {
        length++;
        content[length-1] = elt;
    }

    @Override
    public boolean empty() {
        if(length==0) return true;
        else return false;
    }

    @Override
    public boolean full() {
        if(content.length > length) return false;
        else return true;
    }

    private class MyIt implements Iterator<Integer>{
        int position;

        public MyIt(){
            position = 0;
        }


        @Override
        public boolean hasNext() {
            if (position<length)
            {
                return true;
            }
            else return false;
        }

        @Override
        public Integer next() {
            position++;
            return content[position-1];
        }
    }

    @Override
    public Iterator iterator() {
        return this.new MyIt();
    }
}
