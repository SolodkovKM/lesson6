import Work3.Greeter.DefaultGreeting;
import Work3.Greeter.CasualGreeting;

public class Main {
    public static void main(String[] args) {
        DefaultGreeting dGreeting = new DefaultGreeting();
        CasualGreeting cGreeting = new CasualGreeting();
        String dString = dGreeting.greet();
        String cString = cGreeting.greet();
        System.out.println(cString + ":" + dString);

    }
}