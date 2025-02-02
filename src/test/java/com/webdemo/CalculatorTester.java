package com.webdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.webdemo.beans.Calculator;

public class CalculatorTester {
	
	@Test
public void addTest() {
	Calculator c=new Calculator();
	int actualResult = c.add(20,30); 
	assertEquals(50,actualResult);
}
} 
