package registerListen;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import scala.concurrent.duration.Duration;
/**
 * Created by Administrator on 2015-05-25.
 */
public class Facade extends UntypedActor {
    ActorRef Connect;
    @Override
    public void onReceive(Object msg) throws Exception{
        if(msg.equals("ss")){
            System.out.println(" you");
        }else{
            unhandled(msg);
        }


    }
    public Facade(){

        Connect = context().actorOf(Props.create(Connecta.class));

    }
    @Override
    public void preStart() throws Exception{
        Connect.tell(new Listener() {
            @Override
            public void onCmd(Object msg) {
                System.out.println(" you");
            }
        },null);

    }



}
