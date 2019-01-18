package behavioral.strategy;

public class PythonScriptParser extends AbstractParser {

    @Override
    void initParse() {
        System.out.println("init parser for python");
    }

    @Override
    public void parse() {
        super.parse();
    }

    @Override
    void endParse() {
        System.out.println("end parser for python");

    }
}
