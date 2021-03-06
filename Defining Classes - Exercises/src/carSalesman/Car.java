package carSalesman;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Car {
    private String model;
    private Engine engine;
    private String weight = "n/a";
    private String color = "n/a";

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n%s%n Weight: %s%n Color: %s", this.model, this.engine, this.weight, this.color);
    }
}
