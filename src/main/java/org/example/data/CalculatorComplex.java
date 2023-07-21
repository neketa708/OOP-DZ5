package org.example.data;

public class CalculatorComplex {
    protected Complex numOne;
    protected Complex numTwo;
    protected char operation;

    public CalculatorComplex(String in) {
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                String[] complex = temp.strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                numOne = new Complex(re, im);
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        numTwo = new Complex(re, im);
    }

    public CalculatorComplex(Complex num, String in) {
        numOne = num;
        char[] chars = in.toCharArray();
        String temp = "";
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                temp = "";
            } else temp += ch;
        }
        String[] complex = temp.strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        numTwo = new Complex(re, im);
    }

    public char getOperation() {
        return operation;
    }

    public Complex getNumOne() {
        return numOne;
    }

    public Complex getNumTwo() {
        return numTwo;
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}
