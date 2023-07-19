package Work3;

public class Greeter {
    public interface Greeting {
        String greet();
    }

    public static class FormalGreeting implements Greeting {
        @Override
        public String greet() {
            return "Good evening, sir.";
        }
    }

    public static class CasualGreeting implements Greeting {
        @Override
        public String greet() {
            return "Sup bro?";
        }
    }

    public static class IntimateGreeting implements Greeting {
        @Override
        public String greet() {
            return "Hello Darling!";
        }
    }

    public static class DefaultGreeting implements Greeting {
        @Override
        public String greet() {
            return "Hello.";
        }
    }

    private Greeting greeting;

    public Greeter() {
        this.greeting = new DefaultGreeting();
    }

    public String greet() {
        return greeting.greet();
    }

    public void setFormality(String formality) {
        switch (formality) {
            case "formal":
                greeting = new FormalGreeting();
                break;
            case "casual":
                greeting = new CasualGreeting();
                break;
            case "intimate":
                greeting = new IntimateGreeting();
                break;
            default:
                greeting = new DefaultGreeting();
                break;
        }
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        String greetingMessage = greeter.greet();
        System.out.println(greetingMessage);
    }
}