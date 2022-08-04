public class Main {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-1);
    }

    private static void checkNumber(int numerico) {

        if (numerico > 0) {
            System.out.println("Positive Number");
        } else if (numerico < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Number 0");
        }


    }

}