public class Twofer {
    public String twofer(String name) {
        return (name == null || name.isEmpty()) ? "One for you, one for me." : "One for " + name + ", one for me.";
    }
}
