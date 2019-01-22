package behavioral.visitor;

public class ConcreteElementA extends Element {

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }
}
