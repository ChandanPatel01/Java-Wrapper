public class AllMethod {
    public static void main(String[] args) {
        int decimal=55;
        String binary=Integer.toBinaryString(decimal);
        System.out.println("Your Binary Number :"+binary);

       Integer count=Integer.bitCount(decimal);
         System.out.println("Your Total SET OF 1:::"+count);

         System.out.println("type:"+binary.getClass().getSimpleName());
         System.out.println("type:"+count.getClass().getSimpleName());

    }
    
}
