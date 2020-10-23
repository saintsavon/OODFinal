// Invoker

public class Consultant {
    Command command;

    public void takeOrder(Command c){
        command = c;
        command.buildReady();
    }
}
