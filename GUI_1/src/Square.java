public class Square extends Shape {
    private int lenght;

    public  Square(int length){
        this.lenght = length;
    }

    @Override
    void draw() {
        for(int i = 0; i<lenght; i++)
        {
            for( int j=0; j<lenght;j++)
            {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
