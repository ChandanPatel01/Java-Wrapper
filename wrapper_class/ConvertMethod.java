 
 // Vlaue in convert in anytype value line int, float ,double ,etc  to String Using The toString Method /////
 
 class ConvertMethod {
    public static void main(String[] args) {
        int Value=10;
        
        String string=Integer.toString(Value);
        System.out.println("String:"+ string);
        System.out.println("Tpye:"+string.getClass().getSimpleName());
        

    }
    
}
