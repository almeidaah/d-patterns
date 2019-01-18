package behavioral.strategy;

abstract class AbstractParser implements ScriptParser{

    @Override
    public void parse() {
        initParse();

        System.out.println("do some commong logic here");

        endParse();
    }

    abstract void initParse();

    abstract void endParse();


}
