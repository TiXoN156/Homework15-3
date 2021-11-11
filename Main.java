package com.company;

public class Main {

    public static void main(String[] args) {
        MFU mfu = new MFU();
        new Thread(() -> mfu.print(6)).start();
        new Thread(() -> mfu.print(3)).start();
        new Thread(() -> mfu.scan(5)).start();
        new Thread(() -> mfu.scan(3)).start();
    }
}
