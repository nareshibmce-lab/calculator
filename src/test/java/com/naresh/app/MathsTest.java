package com.naresh.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// import com.naresh.Maths;

/**
 * MathsTest
 */
public class MathsTest {

  Maths maths = new Maths();
  int a = 10;
  int b = 20;

  @Test
  public void testAdd() {
    int expected = 30;
    int actual = maths.add(a, b);
    assertEquals(expected, actual);
  }

  @Test
  public void testSub() {
    int expected = -10;
    int actual = maths.sub(a, b);
    assertEquals(expected, actual);
  }

  @Test
  public void testMul() {
    int expected = 200;
    int actual = maths.mul(a, b);
    assertEquals(expected, actual);
  }

  @Test
  public void testDiv() {
    float expected = 0.5f;
    float actual = maths.div(a, b);
    assertEquals(expected, actual);
  }

  @Test
  public void testRem() {
    int expected = 10;
    int actual = maths.remainder(a, b);
    assertEquals(expected, actual);
  }

  @Test
  public void testPow() {
    int expected = 1024;
    int actual = maths.power(2, 10);
    assertEquals(expected, actual);
  }

}
