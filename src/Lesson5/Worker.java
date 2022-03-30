package Lesson5;

public class Worker {
    private String name;
    private String profession;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {

        return age;
    }

    public Worker(String name, String profession, String email, String phone, int salary, int age){
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getInfo(){
        return name+ " " + profession+ " " + email + " " + phone + " " + salary + " " + age;
    }



}
