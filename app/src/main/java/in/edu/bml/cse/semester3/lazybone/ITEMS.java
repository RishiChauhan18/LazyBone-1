package in.edu.bml.cse.semester3.lazybone;

public class ITEMS {
    private String Name;
    private String id;
    private int Price;


    ITEMS(String foo, String bar, int scat){
        Name = foo;
        id = bar;
        Price = scat;
    }
    public String getName(){
        return Name;
    }
    public int getPrice(){
        return Price;
    }

    public String getId() {
        return id;
    }
}
