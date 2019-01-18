package behavioral.state;

/**
 * Wrapper class to encapsulate state object
 */
class Chain {

    private State current;

    public Chain(){
        current = new Off();
    }

    public void setState(State state) {
        this.current = state;
    }

    public void pull(){
        this.current.pull(this);
    }
}
