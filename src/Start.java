public class Start {
    public static void main(String[] args) {
    checkScore(100.01);

    }

    public static void checkScore(double score) {

            if (0 < score && score <= 50.00) {
                System.out.println("Average score");
            } else if (50.00 < score && score <= 100.00) {
                System.out.println("Very good score");
            }else{
                throw new ArithmeticException("Score is out of scale!");
        }
    }
}