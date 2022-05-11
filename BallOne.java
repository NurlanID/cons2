public class BallOne {
    public static void main(String[] args) {
        Ball ballOne = new Ball();
        ballOne.color = "red";
        ballOne.price = 10;
        ballOne.radius = 15;
        ballOne.producerCountry = "China";
        System.out.println(ballOne.color + " " + ballOne.price + "  " + ballOne.radius + "  " + ballOne.producerCountry + "");
    }
}