package numercalSystems;

public class BinaryExamples {
    public static void main(String[] args) {
        int q = 664;

        System.out.println(664 / 2);    //332
        System.out.println(664 % 2);        //0

        System.out.println(332 / 2);    //166
        System.out.println(332 % 2);        //0

        System.out.println(166 / 2);    //83
        System.out.println(166 % 2);      //0

        System.out.println(83 / 2);     //41
        System.out.println(83 % 2);       //1

        System.out.println(41 / 2);     //20
        System.out.println(41 % 2);        //1

        System.out.println(20 / 2);    //10
        System.out.println(20 % 2);       //0

        System.out.println(10 / 2);    //5
        System.out.println(10 % 2);        //0

        System.out.println(5 / 2);     //2
        System.out.println(5 % 2);        //1

        System.out.println(2 / 2);    //1
        System.out.println(2 % 2);        //0

        System.out.println(1 / 2);    //0
        System.out.println(1 % 2);        //1


        //10 1001 1000

        System.out.println(Integer.toBinaryString(q));

        double result_2_10 = 1 * Math.pow(2, 9) + 1 * Math.pow(2, 7) + 1 * Math.pow(2, 4) + 1 * Math.pow(2, 3);
        System.out.println(result_2_10);


        int q2 = 0b1010011000;
        System.out.println(q2);

    }

    }