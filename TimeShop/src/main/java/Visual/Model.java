package Visual;
import java.util.ArrayList;

public class Model {
    ArrayList<IClock> AllClock = new ArrayList<>();
    ArrayList<IObserver> AllObs = new ArrayList<>();
    
    void addClock (IClock c)
    {
        AllClock.add(c);
        event(this);
    }
    
    void event(Model m)
    {
        for (IObserver iob: AllObs)
        {
            iob.event(this);
        }
    }
    public void deleteWatch(IClock c)
    {
        AllClock.remove(c); 
        event(this);
    }
    void addObserver (IObserver o)
    {
        AllObs.add(o);
       
    }
    public ArrayList<IClock> getAllClock ()
    { 
        return AllClock;
    }

   
    
}
