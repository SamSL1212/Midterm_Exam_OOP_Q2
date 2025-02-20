package Midterm_Exam_OOP_Q2;

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog pet1 = new Dog("Bella", "Bulldog");
        Dog pet2 = new Dog("Luna", "Poodle");

        pet1.setName("Belladonna");
        pet1.setBreed("Golden Retriever");
        pet2.setName("Sunshine");
        pet2.setBreed("Husky");

        System.out.println("Pet 1 Details: ");
        System.out.println("Name: " + pet1.getName());
        System.out.println("Breed: " + pet1.getBreed());

        System.out.println("\nPet 2 Details: ");
        System.out.println("Name: " + pet2.getName());
        System.out.println("Breed: " + pet2.getBreed());
    }
}
