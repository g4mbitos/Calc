package com.viti.calculator;

public class MathOperations {

    public static double Add(double a, double b){
        return a+b;
    }

    public static double Sub(double a, double b){
        return a-b;
    }

    public static double Mult(double a, double b){
        return a*b;
    }

    public static double Div(double a, double b){
        if(b==0)
            return 0;
        return a/b;
    }

    public static double Mod(double a, double b){
        return a%b;
    }

    public  static  double Eq(double a, double b, Operation operations){
        switch (operations){
            case Add:
                return Add(a,b);
            case Sub:
                return Sub(a,b);
            case Mult:
                return Mult(a,b);
            case Div:
                return Div(a,b);
            case Mod:
                return Mod(a,b);
                default: return 0;

        }
    }
}
