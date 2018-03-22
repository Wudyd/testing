package com.edu.tju;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEquilateral() {
		double a1=1,a2=1,a3=1;
		Triangle tria=new Triangle(a1, a2, a3);
		assertEquals("equilateral",tria.getShape());
	}
	
	@Test
	public void testIsosceles() {
		double b1=1,b2=1,b3=1.2;
		Triangle trib=new Triangle(b1, b2, b3);
		assertEquals("isosceles",trib.getShape());
	}
	
	@Test
	public void testScalene() {
		double c1=3,c2=4,c3=5;
		Triangle tric=new Triangle(c1, c2, c3);
		assertEquals("scalene",tric.getShape());
	}
	
}
