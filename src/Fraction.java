public class Fraction {
     int numerator;
     int denominator;



    public String ReduceFraction(Fraction fraction){
        int gcd = FindGCD(fraction.numerator,fraction.denominator);

        return Integer.toString(fraction.numerator/gcd) + "\n" + "--" + "\n" + Integer.toString(fraction.denominator/gcd);
    }
    public static String AddFractions(Fraction first,Fraction second){
        int num = (first.numerator * second.denominator) + (second.numerator * first.denominator);
        int den = first.denominator * second.denominator;

        return Integer.toString(num) + "\n" + "--" + "\n" + Integer.toString(den);
    }

    public static String DivideFractions(Fraction first,Fraction second){
        int num = first.numerator * second.denominator;
        int den = first.denominator * second.numerator;

        return Integer.toString(num) + "\n" + "--" + "\n" + Integer.toString(den);
    }

    private int FindGCD(int num,int den){
        int gcd = 1;
        for(var i=1;i<=num &&i <=den;i++){
            if(num % i == 0 && den % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }




}
