package behavioral.strategy;

public class SHScriptParser extends AbstractParser {

    @Override
    void initParse() {
        System.out.println("init parser for SH");

    }

    @Override
    public void parse() {
        System.out.println("if SH require some specific log, it can be done here");
    }

    @Override
    void endParse() {
        System.out.println("end parser for SH");

    }
}
