package behavioral.state;

class Off extends State {
    @Override
    public void pull(Chain wrapper) {
        wrapper.setState(new Low());
        System.out.println( "   low speed" );
    }
}
