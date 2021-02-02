public class SkiTrip extends Trip {
    private int lifts;
    private int skis;

    public SkiTrip(String country, int duration, int days, int price, int lifts, int skis) {
        super(country, duration, days, price);
        this.lifts = lifts;
        this.skis = skis;
    }

    public int getLiftCare() {
        return lifts;
    }

    public void setLiftCare(int lifts) {
        this.lifts = lifts;
    }

    public int getSkis() {
        return skis;
    }

    public void setSkis(int skis) {
        this.skis = skis;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "lifts=" + lifts +
                ", skis=" + skis +
                ", country='" + country + '\'' +
                ", people=" + people +
                ", days=" + days +
                ", price=" + price +
                '}';

}
}
