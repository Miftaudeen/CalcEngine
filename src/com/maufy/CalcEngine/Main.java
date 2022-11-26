package com.maufy.CalcEngine;
public class Main {
    public static void main(String[] args) {
        double leftVals[] = {100.0d, 25.0d, 225.0d, 11.0d};
        double rightVals[] = {50.0d, 92.0d, 17.0d, 3.0d};
        char opCodes[] = {'d', 'a', 's', 'm'};
        double results[] = new double[opCodes.length];
        for (int i = 0; i < opCodes.length; i++){
            switch (opCodes[i]){
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = leftVals[i] / rightVals[i];
                    break;
                default:
                    System.out.println("Invalid Operation Code");

            }
            System.out.println(results[i]);
        }
    }
}