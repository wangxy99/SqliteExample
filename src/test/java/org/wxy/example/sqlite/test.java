package org.wxy.example.sqlite;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class test {

	@Test
	public void test(){
		System.out.println("==========Numeric==============");
		System.out.println(RandomStringUtils.randomNumeric(2));
		System.out.println("==========Random==============");
		System.out.println(RandomStringUtils.random(2));
		System.out.println("==========RandomString==============");
		System.out.println(RandomStringUtils.random(2,"sdfassdfaff"));

	}
}
