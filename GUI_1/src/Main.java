
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Square c = new Square(3);
        c.draw();
        Reactangle r = new Reactangle(3,5);
        System.out.println();
        r.draw();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(2);
        shapes[1] = new Reactangle(2,5);

        Square anon = new Square(10){
            void draw(){
                System.out.println("  .  ");
                System.out.println(" .. ");
                System.out.println("....");
            }
        };
        shapes[2] = anon;


        for(int i = 0; i<3; i++){
            System.out.println("Drukowanie ");
            shapes[i].draw();
        }

        Wrapper w = new Wrapper(new int[] {1, 2, 3});

    }

}
