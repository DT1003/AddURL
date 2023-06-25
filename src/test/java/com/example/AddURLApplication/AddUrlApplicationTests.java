package com.example.AddURLApplication;

import com.example.Controller.AddController;
import com.example.Utility.AddUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddUrlApplicationTests{

	@Test
	 void testAddition1(){
		int a =5;
		int b =6;
		int expected = 11;

		AddUtility addUtility = new AddUtility();
		int result = addUtility.addition(a, b);
		Assertions.assertEquals(expected,result);

	}

	@Test
	void testAddition2(){
		int a =5;
		int b =1;
		int expected = 10;

		AddUtility addUtility = new AddUtility();
		int result = addUtility.addition(a, b);
		Assertions.assertEquals(expected,result);

	}

}