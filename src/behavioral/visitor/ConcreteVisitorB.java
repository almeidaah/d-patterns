package behavioral.visitor;

public class ConcreteVisitorB extends Visitor {

    @Override
    void visit(Element e) {
        System.out.println("visiting B");
    }
}
