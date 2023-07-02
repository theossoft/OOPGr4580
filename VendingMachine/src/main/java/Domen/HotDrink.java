package Domen;

public class HotDrink extends Product{
    private float volume;
    private int temperature;

    public HotDrink(int price, int place, String name, long id, float volume, int temperature) {
        super(price, place, name, id);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "Напиток = " + this.getName() + "\n" +
                "Объем стакана = " + volume + "\n" +
                "Температура = "  + temperature + "\n" +
                "Цена за стакан = "  + this.getPrice() + "\n";
    }
}
