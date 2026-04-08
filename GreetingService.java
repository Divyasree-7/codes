public class GreetingService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello Guest";
        }
        return "Hello " + name;
    }
}
