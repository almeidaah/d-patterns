package behavioral.visitor;

/**
 * this can be called any times. Make it easy to create more visitors.
 * (ease to add new implementations)
 */
abstract class Visitor {

    abstract void visit(Element e);

}
