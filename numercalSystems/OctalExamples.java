package numercalSystems;

public class OctalExamples {

    public static void main(String[] args) {
        int q = 664;

        System.out.println(664 / 8);     // 83
        System.out.println(664 % 8);          // 0

        System.out.println(83 / 8);      // 10
        System.out.println(83 % 8);          // 3

        System.out.println(10 / 8);      // 1
        System.out.println(10 % 8);         // 2

        System.out.println(1 / 8);       // 0
        System.out.println(1 % 8);          // 1


        // 1230


        System.out.println(Integer.toOctalString(q));


        double result_8_10 = 1 * Math.pow(8,3) + 2 * Math.pow(8,2) + 3 * Math.pow(8,1) + 0 * Math.pow(8,0);
        System.out.println(result_8_10);

        int q8 = 01230;
        System.out.println(q8);









    }
}
