import java.util.ArrayList;

public class Dealership {
    private int till;
    private ArrayList<Car> stockCollection;

    public Dealership(int till) {
        this.till = till;
        this.stockCollection = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Car> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(ArrayList<Car> stockCollection) {
        this.stockCollection = stockCollection;
    }

    public void buyCar(Car car) {
        this.stockCollection.add(car);
        this.till -= car.getPrice();
    }
}
