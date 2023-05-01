package mobprogramming5;

import java.util.ArrayList;
import java.util.List;

public class LibraryOP {
    public static void main(String[] args) {

        Client newClient = new Client();
        newClient.setClientNickname("John Doe");
        Book newArrival = new Book();
        newArrival.setBookPrice(100);
        newArrival.setBookTitle("Ciresarii");
        List<Book> wishList = new ArrayList<>();
        wishList.add(newArrival);
        checkWishlist(newClient, wishList);
    }

    private static void checkWishlist(Client newClient, List<Book> wishList) {
        if (!wishList.isEmpty()) {
            System.out.println("Hi " + newClient.getClientNickname() + ",\nWe care about your wishes, and we just noticed that the book " +
                    wishList.get(0).getBookTitle() + " was on your wishlist, we have an amazing offer for you and being a loyal customer,\nyou can get this with a reduced price of 20% off today from " + wishList.get(0).getBookPrice() +
                    " to " + wishList.get(0).getReducePrice() + " dollars");
        }
    }
}
