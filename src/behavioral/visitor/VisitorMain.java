package behavioral.visitor;

public class VisitorMain {

    public static void main(String[] args) {
        Visitor v1 = new ConcreteVisitorA();

        Element e = new Element();

        e.accept(v1);
    }
}
