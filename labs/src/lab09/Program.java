package lab09;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball b1 = new Ball(1,2,10,10);
		Ball b2 = new Ball(40,30,10,10);
		Ball b3 = new Ball(300,100,10,10);
		Ball[] ball = {b1, b2, b3};
		Game g1 = new Game(ball);
	}

}
