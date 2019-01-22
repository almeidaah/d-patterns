package behavioral.visitor;

public class Element {

    void accept(Visitor v){
        v.visit(this);
    }
}
