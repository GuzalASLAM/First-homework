package numercalSystems;

public class HexExamples {
    public static void main(String[] args) {
        int q = 664;
        System.out.println(664 / 16);  //41
        System.out.println(664 % 16);     //8

        System.out.println(41 / 16);   //2
        System.out.println(41 % 16);     //9


        System.out.println(2 / 16);    //0
        System.out.println(2 % 16);       //2

          // 298
          // 298

        System.out.println(Integer.toHexString(q));


        double result_16_10 = 2 * Math.pow(16,2) + 9 * Math.pow(16,1) + 8 * Math.pow(16,0);
        System.out.println(result_16_10);


        int q16 =0x298;
        System.out.println(q16);
    }
}
