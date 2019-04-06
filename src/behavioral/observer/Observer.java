package behavioral.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
