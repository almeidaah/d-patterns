package behavioral.state;

class Low extends State {

    @Override
    public void pull(Chain wrapper) {
        wrapper.setState(new Medium());
        System.out.println("   medium speed");
    }
}
