package com.company;

public class MFU extends Thread {
    Object monitorPrinting = new Object();
    Object monitorScanning = new Object();

    public void print(int pages) {
        synchronized (monitorPrinting) {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Отпечатано " + i + " страниц.");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Печать завершена.");
    }

    public void scan(int pages) {
        synchronized (monitorScanning) {
            for (int i = 1; i <= pages; i++) {
                System.out.println("Отсканировано " + i + " страниц.");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Сканирование завершено.");
    }
}
