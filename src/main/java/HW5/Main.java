package HW5;

public class Main {
    public static void main(String[] args) {
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Ivanov Ivan Ivanovich", "Engineer", "ivivan@mailbox.com",
                "89231231211", 60000, 45);
        workArray[1] = new Worker("Lazareva Olga Alekseevna", "Lawyer", "lazarevaoa@yandex.ru",
                "89224258725", 65000, 30);
        workArray[2] = new Worker("Salkova Daria Makarovna", "Accountant", "d_salkova@gmail.com",
                "89175123015", 75000, 35);
        workArray[3] = new Worker("Novikova Anna Antonovna", "Economist", "novikova_aa@mail.ru",
                "89124127457", 70000, 41);
        workArray[4] = new Worker("Petrov Petr Petrovich", "Programmer", "pppetrovich@inbox.ru",
                "89123456789", 50000, 50);

        for(Worker worker : workArray) {
            if(worker.getAge() > 40)  worker.printInfo();
        }
    }
}
