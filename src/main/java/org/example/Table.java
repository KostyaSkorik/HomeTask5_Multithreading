package org.example;

import java.util.concurrent.Semaphore;

public class Table{

    private Semaphore semaphore = new Semaphore(2);
    public void eat(int studentId){

        try{
            System.out.println("Student" + studentId + " waiting");
            semaphore.acquire();
            System.out.println("Student" + studentId + " eating");
            Thread.sleep(3000);
            System.out.println("Student" + studentId + " exit");
            semaphore.release();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

}