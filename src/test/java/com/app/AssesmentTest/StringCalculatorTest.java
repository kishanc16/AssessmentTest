package com.app.AssesmentTest;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest
{
	@Test
	public void stringCalculatorWithEmptyString(){
		int expextedOutput = 0;
		String input = "";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithSingle(){
		int expextedOutput = 1;
		String input = "1";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithTwo(){
		int expextedOutput = 6;
		String input = "1,5";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithTwoOrMore(){
		int expextedOutput = 15;
		String input = "1,2,3,4,5";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorInsteadOfComma(){
		int expextedOutput = 15;
		String input = "1\n2,3\n4,5";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithDifferentDelimeter(){
		int expextedOutput = 6;
		String input = "//[*][%]\n1*2%3";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithDelimeterWithAnyLength(){
		int expextedOutput = 6;
		String input = "//[***]\n1***2***3";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorWithMultiDelimeterWithLongerThanOneChar(){
		int expextedOutput = 6;
		String input = "//[**][%%]\n1**2%%3";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
	@Test
	public void stringCalculatorNumberBigger1000(){
		int expextedOutput = 3;
		String input = "//;\n1;2,1001";
		StringCalculator sc = new StringCalculator();
		int actualOutput = sc.add(input);
		Assert.assertEquals(expextedOutput, actualOutput);
	}
}
