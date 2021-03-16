package autotest.testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo01 {
    @Test
    public void test1(){
        System.out.println("test1 run");
//        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

    @Parameters({"name", "age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }
}
