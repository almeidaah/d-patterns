package behavioral.templatemethod;

public class Manager extends Worker {
    @Override
    public void work() {

    }

    @Override
    protected void relax() {
        System.out.println("RELAX IN PARIS");
        super.relax();
    }
}
