package mobprogramming3;

public class PetShopService {
    public static String getAnimalType(String userInput, Animal animal) {
        switch (userInput) {
            case "Dog":
                System.out.println("Dog stock: " + animal.getDogList().size());break;
            case "Cat":
                System.out.println("Cat stock: " + animal.getCatList().size());break;
            default:
                System.out.println("We don't have the requested animal.");break;
        }
        return null;
    }
}
