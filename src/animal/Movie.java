package animal;

public class Movie {
    String name;
    String company;
    String genre;
    double rating;
    static int likeCounter;

    public static void doSomethingStatic() {
        System.out.println(likeCounter);
        System.out.println("Doing something static");
    }

    public boolean isGoodMovie() {
        /*
        if (rating >= 8) {
            return true;
        } else {
            return false;
        }

         */
        return rating >= 8 && rating <= 10;
    }

}
