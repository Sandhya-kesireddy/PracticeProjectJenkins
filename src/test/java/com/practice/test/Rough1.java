package com.practice.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class Rough1 {
    @Test(dependsOnMethods = "doLogin", groups="smoke")
    public void doReg() {
        System.out.println("In Registration Test");
        Assert.assertEquals("Hi", "Hie", "Test Passed");
    }

    @Test(groups="smoke")
    public void doLogin() {
        SoftAssert sa = new SoftAssert();
        System.out.println("In Login Test");
        sa.assertEquals("Hi", "Hi", "Test Failed");
        System.out.println("Hello...After failed step");
        sa.assertAll();
    }

    @Test(dependsOnMethods = {"doLogin","doReg"}, alwaysRun = true)
    public void doAccountCreatn() {
        System.out.println("In Account Creation test");


    }
}