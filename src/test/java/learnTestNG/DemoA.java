package learnTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {
  @Test(priority=1)
  public void m1() {
	  
	  System.out.println("Method1");
  }
  @Test(priority=2)
  public void m2(){
	  System.out.println("Method2");
  }
  @Test(priority=3)
  public void m3(){
	  Assert.fail();
  }
  @Test(priority=4)
  public void m4(){
	  Reporter.log("passed");
  }
  @Test(priority=5)
  public void m5(){
	  Reporter.log("method5");
  }
  @DataProvider
  public Object[][] getdata(){
	  Object[][] data=new Object[2][2];
	  data[0][0]="user1";
	  data[0][1]=123;
	  data[1][0]="User2";
	  data[1][1]=456;
	  return data;
  }
  @Test(dataProvider="getdata")
  public void createUser(String un,int pw){
	  Reporter.log("Crete User:"+un+"pw:"+pw);
  }

}
