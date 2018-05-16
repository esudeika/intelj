package com.kcs.days.third;

public class Calculator {

    public double suma(double numb, double numb2){
        return numb + numb2;
    }

    public double atemimas(double numb, double numb2){
        return numb - numb2;
    }

    public double daugyba(double numb, double numb2){
        return numb * numb2;
    }

    public double dalyba(double numb, double numb2){
        return numb / numb2;
    }

    public double laipsnis(double numb, int degree){
        return Math.pow(numb,degree);
    }
}
