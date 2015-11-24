package registerListen;


import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Hello world!
 */
public class App  {

    public void run() throws Exception{
        ActorSystem.create("CA").actorOf(Props.create(Facade.class));
    }

    public static void main(String[] args) throws Exception {
        App t1 = new App();
        t1.run();
    }
}
