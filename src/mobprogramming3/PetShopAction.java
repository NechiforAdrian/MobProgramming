package mobprogramming3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetShopAction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dogList = new ArrayList<>();
        dogList.add("Bobita");
        dogList.add("Azorel");
        Animal animal = new Animal();
        animal.setPrice(100);
        animal.setAge(2);
        animal.setBreed("Chiuaua");
        animal.setAnimalType("Dog");
        animal.setDogList(dogList);
        List<String> catList = new ArrayList<>();
        animal.setCatList(catList);
        catList.add("Tom");
        catList.add("Felix");
//        Animal cat = new Animal();
//        cat.setPrice(250);
//        cat.setAge(4);
//        cat.setBreed("Sphinx");
//        cat.setAnimalType("Cat");
//        cat.setCatList(catList);

        PetShopService service = new PetShopService();
        System.out.println("Please enter the desired animal:");
        String userInput = scanner.next();
        service.getAnimalType(userInput, animal);

    }
}
