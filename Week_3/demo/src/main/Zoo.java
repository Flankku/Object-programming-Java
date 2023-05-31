package main;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<>();


    public Zoo(String name) {
        this.name = name;
    }
    
    /* Animals of the Zoo */
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /* List all animals */
    public void listAnimals() {
        for(Animal animal : animals) {
            System.out.println(animal.specie+": "+animal.name+", "+animal.age+" vuotta");
        }
    }

    /* Run animals */
    public void runAnimals(int rounds) {
        for(Animal animal : animals) {
            for (int i = 1; i <= rounds;i++) {
                System.out.println(animal.name+" juoksee kovaa vauhtia!");
            }
        }
    }

}
