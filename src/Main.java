public class Main {
    public static void main(String[] args) {

        //System.out.println(CalculateDiscriminant(1.0,2.0,3.0));
        //System.out.println(FindShortestString(new String[]{"hello", "ello", "llo"}));

        Fraction fraction = new Fraction();
        fraction.denominator = 8;
        fraction.numerator = 4;

        Fraction fraction1 = new Fraction();
        fraction1.numerator = 5;
        fraction1.denominator = 7;


        System.out.println(fraction.ReduceFraction(fraction));
        System.out.println(Fraction.AddFractions(fraction,fraction1));
    }
    public static double CalculateDiscriminant(double a,double b,double c){
        return (b*b)-(4*a*c);
    }
    public static String FindShortestString(String[] items){
        String shortest = items[0];
        for(int i=1;i<items.length;i++){
           if(shortest.length()>items[i].length()){
               shortest = items[i];
           }
        }
        return shortest;
    }
}