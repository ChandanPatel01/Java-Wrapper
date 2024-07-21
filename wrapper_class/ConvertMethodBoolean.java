public class ConvertMethodBoolean {
    public static void main(String[] args) {
        boolean b=true;
        String s=Boolean.toString(b);
        System.out.println(b);
        System.out.println("type:"+ s.getClass().getSimpleName());
    }
    
}
