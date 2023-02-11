package oop.encaps;

public class machine {
    private double temperature;

    void changeTemperature(double temperature) {
        this.temperature = temperature;
    }

    int getTemperature() {
        return (int) this.temperature;
    }
}
