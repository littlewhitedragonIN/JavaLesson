package com.evan;

public class TestThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.printf("sub22");
        }
    }

    public static void main(String[] args) {
        TestThread testThread1 = new TestThread();
        testThread1.start();
        // main thread
        for (int i = 0; i < 1000; i++) {
            System.out.printf("main11");
        }
    }
}
