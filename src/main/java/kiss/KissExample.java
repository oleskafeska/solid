package kiss;

public class KissExample {

    public static void main(String[] args) {

        if (checkIfHorrible(true)) {

            System.out.println("Oh my...");
        }
    }

    private static boolean checkIfHorrible(boolean isItBad) {

        if (isItBad) {
            return true;
        } else {
            return false;
        }
    }
}
