package me.seancassidy;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {
    @Test
    public void getName() throws Exception {
        final String name = "MyName";
        final MyClass myClass = new MyClass(name);
        System.out.println("HACKED myClass " + myClass);
        Assert.assertEquals(name, myClass.getName());
    }
}
