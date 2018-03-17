public class Wrapper {
    int[] b;

    public Wrapper(int[] a){
        b=a;
    }


    class WrapperIterator{
        int position;

        public WrapperIterator(){
            position = 0;
        }
        public int next(){
            position++;
            return b[position-1];
        }
        public boolean hasNext(){
            if (position<b.length)
            {
                return true;
            }
            else return false;
        }
    }


    class WrapperReverseIterator extends WrapperIterator{
        int position = b.length;

        @Override
        public int next() {
            position--;
            return b[position+1];
        }
        @Override
        public boolean hasNext(){
            if (position==0)
            {
                return false;
            }
            else return true;
        }
    }
}
