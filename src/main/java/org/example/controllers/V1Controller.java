package org.example.controllers;

import org.example.data.Calculator;
import org.example.data.CalculatorComplex;
import org.example.data.Complex;
import org.example.model.ModelComplex;

public class V1Controller implements Controller{
    public V1Controller() {}

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate((Calculator) calculator);
    }
}
