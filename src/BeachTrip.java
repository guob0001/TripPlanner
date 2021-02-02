public class BeachTrip extends Trip {
    private int towel;
    private int drinks;

    public BeachTrip(String country, int duration, int days, int price, int towel, int drinks) {
        super(country, duration, days, price);
        this.towel = towel;
        this.drinks = drinks;
    }

    public int getTowel() {
        return towel;
    }

    public void setTowel(int towel) {
        this.towel = towel;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "towel=" + towel +
                ", drinks=" + drinks +
                ", country='" + country + '\'' +
                ", people=" + people +
                ", days=" + days +
                ", price=" + price +
                '}';

}
}
