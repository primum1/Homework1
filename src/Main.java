public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        double dog = 8;
        double cat = 3.6;
        double paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        double frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var WeightCommon = WeightBoxer1 + WeightBoxer2;
        System.out.println("Общий вес 2х бойцов "+WeightCommon+" кг");
        var WeightDifference = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между весами бойцов "+WeightDifference+" кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var WeightBoxer1 = 78.2;
        var WeightBoxer2 = 82.7;
        var WeightDifference = WeightBoxer2 - WeightBoxer1;
        System.out.println("Разница между весами бойцов "+WeightDifference+" кг");
        var WeightDifference2 = WeightBoxer2 % WeightBoxer1;
        System.out.println("Разница между весами бойцов "+WeightDifference2+" кг");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var time = 640;
        var OneTime = 8;
        var person = time/OneTime;
        System.out.println("Всего работников в компании -- " + person + "человек");
        person = person + 94;
        var TimeAll = person * OneTime;
        System.out.println("Если в компании работает " + person + " человек, то всего " + OneTime + " часов работы может быть поделено между сотрудниками");
    }
}