package edu.handong.csee.java.lab08.math;

public class MathCalculator {
private String name;
	
    public void setName(String args){
        name = args;
    }
    public String getName(){
        return name;
    }
    public int getMax(int num1, int num2){
        if(num1 > num2) return num1;
        else return num2;
    }
    public int getMin(int num1, int num2){
        if(num1 > num2) return num2;
        else return num1;
    }
    public int getAbs(int num1){
        if(num1 < 0) return num1*(-1);
        else return num1;
    }
    public int getSum(int num1, int num2){
        return num1+num2;
    }
    public int getDiff(int num1, int num2){
        return num1-num2;
    }
    public int getProduct(int num1, int num2){
        return num1*num2;
    }
    public int getQuotient(int num1, int num2){
        return num1/num2;
    }
    public int getRemainder(int num1, int num2){
        return num1%num2;
    }
    public int getPower(int num1, int num2){
        int n = 1;
        for(int i=0; i<num2; i++){
            n*=num1;
        }
        return n;
    }
    public int getFactorial(int num1){
        if(num1 == 0) return 1;
        else return num1*getFactorial(num1-1); 
    }
    public int getGcd(int num1, int num2){
        int n;
        if(num2 > num1){
            while(true){
                n = num2%num1;
                if(n == 0) break;
                else{
                    num2 = num1;
                    num1 = n;
                }
            }
            return num1;
        }
        else{
            while(true){
                n = num1%num2;
                if(n == 0) break;
                else{
                    num1 = num2;
                    num2 = n;
                }
            }
            return num2;
        }
    }
    public int getLcm(int num1, int num2){
        int n = 1;
        while(true){
            if(num1*n%num2 == 0) break;
            else n++;
        }
        return num1*n;
    }
    public int getSquare(int num1){
        return num1*num1;
    }

}
