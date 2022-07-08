package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet ");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
