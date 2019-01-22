package behavioral.visitor;

public class ConcreteVisitorA extends Visitor {

    @Override
    void visit(Element e) {
        System.out.println("visiting A");
    }
}
