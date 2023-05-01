package mobprogramming6;

public class Main {
    public static void main(String[] args) {

        GenericDataBaseLogic tableDB = new GenericDataBaseLogic();
        //System.out.println(tableDB.getTvById(1).toString());

        //System.out.println("Initial table :" + tableDB.getTvDbList());

        TV tv = new TV(1344, "4k", 57);
        tableDB.saveTv(tv);
        //System.out.println("After add: " + tableDB.getTvDbList());

        TV tv1 = new TV();
        tv1.setName("Altex");
        tv1.setBrand("Nai");
        tv1.setModel("G4");
        tableDB.updateTv(0, tv1);

        System.out.println("After updating: " + tableDB.getTvDbList());

    }
}
