public class NonStaticNonAccess {
    strictfp static void  javaClass(){
        System.out.println("I am non static method ");
    }
    public static void main(String[] args) {
        //NonStaticNonAccess b=new NonStaticNonAccess();
        javaClass();

    }

}// Illegal modifier for the method javaClass; only public, protected, private,
 // abstract, static, final, synchronized, native & strictfp are permitted
