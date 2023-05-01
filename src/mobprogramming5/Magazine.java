package mobprogramming5;

public class Magazine implements Reducible {

    private int magazinePrice;

    public int getMagazinePrice() {
        return magazinePrice;
    }

    public void setMagazinePrice(int magazinePrice) {
        this.magazinePrice = magazinePrice;
    }

    @Override
    public double getReducePrice() {
        return magazinePrice - Constants.DISCOUNT_40;
    }
}
