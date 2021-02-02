public class Trip {
        String country;
        int people;
        int days;
        int price;

    public Trip(String country, int duration, int days, int price) {
        this.country = country;
        this.people = people;
        this.days = days;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDuration() {
        return people;
    }

    public void setDuration(int duration) {
        this.people = duration;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", people=" + people +
                ", days=" + days +
                ", price=" + price +
                '}';

}
}
