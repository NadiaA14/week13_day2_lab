package Components;

public class Engine {
    private Integer horsepower;
    private Integer volume;

    public Engine(Integer horsepower, Integer volume) {
        this.horsepower = horsepower;
        this.volume = volume;
    }


    public int getHP() {
        return horsepower;
    }

    public int getVolume() {
        return volume;
    }
}
