public class Employe {
    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private String position;
    private int salary;
}
public Employe() {
    id_gen = id++;
}
public Employe(String name, String surname){
    this(); //call no arg constructor
    this.name = name;
}
//parametrized constructor
public Employe(String name, String surname, int age, boolean gender, String position, int salary) {
    this(name, surname); //call parametrized constructor
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
    this.position = position;
    this.salary = salary;
}

//getters / accessors
//setters / mutators

public String getName() {
    return name;
}

public String getSurname() {
    return surname;
}

public int getAge() {
    return age;
}

public boolean isGender() {
    return gender;
}
public String getPosition() {
    return position();
}
public int getSalary() {
    return salary;
}

public void setName(String name) {
    this.name = name;
}

public void setSurname(String surname) {
    this.surname = surname;
}

public void setAge(int age) {
    this.age = age;
}

public void setGender(boolean gender) {
    this.gender = gender;
}
public void setPosition(String position) {
    this.position = position;
}
public void setSalary(double salary) {
    this.salary = salary;
}
@Override
public String toString() {
    return "Student id: " + id_gen +
            "\nFull name: " + name + " " + surname +
            "\nAge: " + age +
            "\nGender: " + (gender ? "male" : "female") +
            "\nGPA: " + gpa;
}
}