package behavioral.templatemethod;

public abstract class Worker {

    public Worker(){
        getUp();
        eatBreakfeast();
        work();
        relax();
        sleep();
    }

    protected void getUp(){
        System.out.println("I just get up");
    }

    protected void eatBreakfeast(){
        System.out.println("I just ate");
    }

    protected abstract void work();

    protected void relax(){
        System.out.println("WORKER RELAX!!");
    }

    protected void sleep(){
        System.out.println("Now its time to sleep!");
    }
}
