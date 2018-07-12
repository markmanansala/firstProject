package firstProject;

public class Dog {
    int age;
    public Dog(int dogsAge) {
        age = dogsAge;
    }
    public void bark() {
        System.out.println("Woof!");
    }
    public void run(int feet) {
        System.out.println("Your dog has ran " + feet + " yards!");
    }
    public int getAge() {
        return age;
    } 
    public void breed(String breedName) {
        System.out.println("Your dog is a " + breedName + "!");
    }
    public static void main(String[] args) {
        Dog spike = new Dog(2);
        spike.bark();
        spike.run(30);
        spike.breed("shitzu");
        int spikeAge = spike.getAge();
        System.out.println("Your dog is " + spikeAge + " years old!");
        
        Dog dinner = new Dog(5);
        dinner.bark();
        dinner.run(-50);
        dinner.breed("Labrador");
        System.out.println("Your dog is " + dinner.getAge() + " years old!");
    }
}
