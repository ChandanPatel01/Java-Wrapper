class WrapDouble{
    public static void main(String[] args) {
        Double d=Double.valueOf(55.12);  // boxing 
        System.out.println("This is First Way:"+ d.doubleValue());
        double D1= d.doubleValue(); //unboxing
        System.out.println("This Second WAAY:"+ D1);
    }
}