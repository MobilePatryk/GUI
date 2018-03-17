public class Reactangle extends Shape {
    int height;
    int length;

    public Reactangle(int length,int height){
        this.length = length;
        this.height = height;
    }
    @Override
    void draw() {

        for(int i = 0; i<height; i++)
        {
            for( int j=0; j<length;j++)
            {
                System.out.print(". ");
            }
            System.out.println();
        }

    }
}
