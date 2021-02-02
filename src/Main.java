import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<BeachTrip> beachList = new ArrayList<>();
        ArrayList<SkiTrip> skiList = new ArrayList<>();
        menu(scan,beachList, skiList);
    }

    public static void menu (Scanner scan, ArrayList<BeachTrip> beachList, ArrayList<SkiTrip> skiList) {
        System.out.println("Where would you like to go? Type 'A' for ski trip or 'B' for beach trip");
        String ans = scan.next();
        if (ans.equalsIgnoreCase("a")) {
            createSki(scan, skiList);
        } else if (ans.equalsIgnoreCase("b")) {
            createBeach(scan, beachList);
        }
    }

    public static void createBeach(Scanner scan, ArrayList<BeachTrip> beachList) {
        System.out.println("Choose country");
        String country = scan.next();
        System.out.println("How many people?");
        int people = scan.nextInt();
        System.out.println("How many days?");
        int days = scan.nextInt();
        System.out.println("Price?");
        int price = scan.nextInt();
        System.out.println("How many towels?");
        int towel = scan.nextInt();
        System.out.println("How many drinks?");
        int drinks = scan.nextInt();
        BeachTrip beachTrip1 = new BeachTrip(country, people, days, price, towel, drinks);
        beachList.add(beachTrip1);
        System.out.println(beachTrip1);

        }
        public static void createSki(Scanner scan, ArrayList<SkiTrip> skiList){
            System.out.println("Choose country");
            String country = scan.next();
            System.out.println("How many people?");
            int people = scan.nextInt();
            System.out.println("How many days?");
            int days = scan.nextInt();
            System.out.println("Price?");
            int price = scan.nextInt();
            System.out.println("How many lifts?");
            int lifts = scan.nextInt();
            System.out.println("How many skis?");
            int skis = scan.nextInt();
            SkiTrip skiTrip1 = new SkiTrip (country, people, days, price, lifts, skis);
            skiList.add(skiTrip1);
            System.out.println(skiTrip1);

    }
}
