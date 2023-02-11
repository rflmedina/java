package exercises.petshop;

public class PetShop {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Fido";
        dog.age = 2;
        dog.gender = 'm';
        dog.breed = "Labrador";

        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);
        System.out.println("Gender: " + dog.gender);
    }
}
