package behavioral.strategy;

public class JavaScriptParser extends AbstractParser {

    @Override
    void initParse() {
        System.out.println("init parser for java");
    }

    @Override
    public void parse() {
        super.parse();
    }

    @Override
    void endParse() {
        System.out.println("end parser for Java");

    }
}
