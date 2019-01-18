package behavioral.state;

public class Medium extends State {

    @Override
    public void pull(Chain wrapper) {
        wrapper.setState(new High());
        System.out.println("   high speed");
    }
}
