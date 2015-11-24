package registerListen;

import akka.actor.UntypedActor;

/**
 * Created by Administrator on 2015-05-25.
 */
public class Connecta extends UntypedActor {
    private final Listener listeners = new Listener();

    public void registerListener(Listener _listener){
        listeners.registerListener(_listener);
    }
    @Override
    public void onReceive(Object msg){
        if(msg instanceof Listener) {
            Listener _listener = (Listener) msg;

            registerListener(_listener);
            _listener.onCmd("www");


            //getSender().tell("ss", null);
        }else{
            unhandled(msg);
        }
    }

    public void onReceive(Listener _listener){
        registerListener(_listener);

    }
    public Connecta(){
        //registerListener(_listener);

    }


}
