class printInt{
    public static void main(String[] args) {
        Integer x =Integer.valueOf(10);// boxing
        int y=x.intValue();
        System.out.println("Second Way: "+x.intValue() );
        System.out.println("this is unboxing :"+y);
       

    }
}
