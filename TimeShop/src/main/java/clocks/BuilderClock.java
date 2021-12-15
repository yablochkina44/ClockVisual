package clocks;

import static clocks.TypeClock.*;

public class BuilderClock {
    public BuilderClock(TypeClock type) {
    }

    public static IClock build(TypeClock type) {
        if(type == HM) {
            return new ClockHM();
        }
        if(type == HMS) {
            return new ClockHMS();
        }
        return null;
    }
}
