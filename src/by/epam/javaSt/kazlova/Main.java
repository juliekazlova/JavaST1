package by.epam.javaSt.kazlova;

public class Main {
    public static void main(String[] args){
        Task1 task1=new Task1();
        System.out.println(task1.run(2350));

        Task2 task2=new Task2();
        System.out.println(task2.run(1, 2, 0));

        Task3 task3=new Task3();
        System.out.println(task3.run(3, 4));

        Task5 task5=new Task5();
        System.out.println(task5.run(3, 4, -3));

        Task6 task6=new Task6();
        System.out.println(task6.run(3, 4, -3));

        Task7 task7=new Task7();
        System.out.println(task7.run(3, 4, 1));

        Task8 task8=new Task8();
        System.out.println(task8.run(new int[]{4, 8, 10, 15, 25}, 5));

        Task9 task9=new Task9();
        System.out.println(task9.run(new int[]{1, 1, 1, 1, 1}, new int[]{0, 0, 0}, 2));
    }
}
