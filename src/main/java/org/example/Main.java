package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("HomeTask 5, Variant 2. Студент: Скорик Константин Алексеевич, Группа: РИБО-05-22");
        Table table = new Table();
        Thread[] threads = new Thread[7];

        for (int i=0; i<7; i++){
            final int studentId = i+1;
            threads[i] = new Thread(()->table.eat(studentId));
            threads[i].start();
        }

        for (Thread t:threads){
            try {
                t.join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}