package com.testng;

import org.testng.annotations.Test;

public class TestNGGroup {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("This is red Group");
  }
  
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("This is red Group");
  }
  
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("This is red Group");
  }
  
  @Test(groups = {"green"})
  public void green1() {
	  System.out.println("This is green Group");
  }
  
  @Test(groups = {"green"})
  public void green2() {
	  System.out.println("This is green Group");
  }
  
  @Test(groups = {"green"})
  public void green3() {
	  System.out.println("This is green Group");
  }
  
  @Test(groups = {"green","red"})
  public void greenandred() {
	  System.out.println("This is green and red Group");
  }
}