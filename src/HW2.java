public class HW2 {

    public static void main(String[] args) {

        // Task 1
//        System.out.println("123");
//
//        // Task 2
//        String myCity = "Almaty";
//        final String MY_CITY_ALMATY = "Almaty";
//
//        int x = 15;
//        int y = 10;
//        int c = (x + y);
//
//        System.out.println(x + " + " + y + " = " + c);
//
//
//        // widening
//        byte a = 2;
//        int b = a;
//
//
//        // narrowing
//        short s = (short) b;
//        float f = 2.5f;
//        b = (int) f;
//        System.out.println(b);

        String q = "";
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                q = q + i;
            } else {
                q = i + q + i;
            }
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println(q);
        }


    }


}
