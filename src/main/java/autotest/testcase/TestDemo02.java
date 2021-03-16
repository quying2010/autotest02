package autotest.testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo02 {
    @Test
    public void test001(){
        System.out.println("test001 run");
//        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test001"})
    public void test002(){
        System.out.println("test002 run");
    }
    @Test(dataProvider = "dbData")
    public void paramTest001(String name,int age){
        System.out.println("name = " + name + ";  age = " + age);
    }
    @DataProvider(name="dbData")
    public Object[][] dataProvider1(){
        return new Object[][]{
                {"zhangsan",18},
                {"lisi",16}
        };
    }
}
