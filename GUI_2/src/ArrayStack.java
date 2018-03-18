public class ArrayStack implements Stack {
    int lenght=0;
    int[] content = new int[20];

    @Override
    public int pop() {
        lenght-=1;
       return content[lenght+1];
    }

    @Override
    public void push(int elt) {
        lenght++;
        content[lenght] = elt;
    }

    @Override
    public boolean empty() {
        if(lenght==0) return true;
        else return false;
    }

    @Override
    public boolean full() {
        if(content.length > lenght) return false;
        else return true;
    }
}
