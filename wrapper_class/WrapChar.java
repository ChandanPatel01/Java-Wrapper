public class WrapChar {
    public static void main(String[] args) {
        Character c= Character.valueOf('A');
        System.out.println("This Character: Second Way "+ c.charValue());
        char Char=c.charValue();// unboxing
        System.out.println("This is Char First Way:"+ Char);
    }
    
}
