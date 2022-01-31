package com.practice.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    public void onTestFailure(ITestResult result){
        System.out.println("Capture Screenshot");
    }

}
