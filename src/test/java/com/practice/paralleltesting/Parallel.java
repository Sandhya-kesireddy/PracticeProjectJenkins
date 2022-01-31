package com.practice.paralleltesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Date;

public class Parallel {

    @Parameters({"Browser"})
    @Test
    public void doLoginParallel(String Browser) throws InterruptedException {
        Date d=new Date();
        System.out.println(Browser+"..Date is now @.." +d);
        Thread.sleep(2000);
    }
}
