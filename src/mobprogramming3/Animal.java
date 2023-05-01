package mobprogramming3;

import java.util.List;

public class Animal {
    private String animalType;
    private String breed;
    private int age;
    private int stock;
    private double price;
    List<String> dogList;
    List<String> catList;

    public List<String> getDogList() {
        return dogList;
    }

    public void setDogList(List<String> dogList) {
        this.dogList = dogList;
    }

    public List<String> getCatList() {
        return catList;
    }

    public void setCatList(List<String> catList) {
        this.catList = catList;
    }
  
    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
