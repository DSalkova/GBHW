package HW5;

public class Worker {
    private String FIO;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Worker(String FIO, String job, String email, String phone, int salary, int age) {
        this.FIO = FIO;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(String.format("%s\tjob: %s\temail: %s\tphone: %s\tsalary: %srub\tage: %s",
                FIO, job, email, phone, salary, age));
    }
}
