public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog+=4;
        cat +=4;
        paper+=4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog-=3.5;
        cat -=1.6;
        paper-=7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
}