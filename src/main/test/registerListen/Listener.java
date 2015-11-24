package registerListen;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2015-05-25.
 */
public class Listener {
    private final List<Listener> listeners = new LinkedList();

    private static  int ident;
    public Listener(){
        String kkk = "";
        for(int i=0;i<ident; i++)
            kkk+="=";
        System.out.println("new Listener : "+kkk);
        ident++;
    }

    public void registerListener(Listener _listener){
        System.out.println("registerListener "+_listener);
        if(null!=_listener && !listeners.contains(_listener))
            listeners.add(_listener);
    }

    public void onEvt(Object _evt){
        for(Listener listener : listeners)
            listener.onEvt(_evt);
    }

    public void onCmd(Object _cmd){
        for(Listener listener : listeners)
            listener.onCmd(_cmd);
    }
    public void onRaw(Object _raw){
        for(Listener listener : listeners)
            listener.onRaw(_raw);
    }
}
