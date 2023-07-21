package org.example.controllers;

import org.example.data.CalculatorComplex;
import org.example.data.Complex;

public interface Controller {
    public Complex sendComplex(CalculatorComplex calculator);
}
