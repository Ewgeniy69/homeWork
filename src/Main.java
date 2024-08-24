public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalMass = boxer1 + boxer2;
        System.out.println(totalMass);
        System.out.println("Общая масса двух бойцов " + totalMass + " килиграмм");
        var difference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров составила " + difference + " килограмм");
        var resultBoxers = boxer2 % boxer1;
        System.out.println(resultBoxers);
        var resultMass = totalMass % difference;
        System.out.println(resultMass);

        var totalHours = 640;
        var hoursForOne = 8;
        var totalWorkers = totalHours/hoursForOne;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");
        var overTotalWorkers = totalWorkers + 94;
        System.out.println(overTotalWorkers);
        var totalHoursIf = hoursForOne*overTotalWorkers;
        System.out.println("Если в компании работает " + overTotalWorkers + " человека, то всего " + totalHoursIf + " часов работы может быть поделено между сотрудниками");






    }
}