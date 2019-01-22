package behavioral.visitor;

public class ConcreteElementB extends Element {

    @Override
    void accept(Visitor v) {
        v.visit(this);
    }
}
