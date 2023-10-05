public class Bob implements Runnable {
    private int positionX, positionY, round ,multiply;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor, int round ,int multiply) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
        this.multiply = multiply;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.width(5);
        bob.speed(2);

        bob.left(45*multiply);
        for(int i=0;i<this.round;i++)
        {
            bob.forward(i/50.);
        }
        bob.right(45*multiply);
        bob.right(90*multiply);
        for (int i = 0; i < this.round; i++) {
            bob.forward(i/150.);
        }

            bob.left(90*multiply);
        for (int i = 0; i < this.round; i++) {
            double x = (1 - i) * (1 - i);
            bob.forward(x/150.);
        }



    }
}