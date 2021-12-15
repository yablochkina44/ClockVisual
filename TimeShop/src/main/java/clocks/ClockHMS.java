package clocks;

import java.util.ArrayList;

public class ClockHMS extends ClockHM{
    String type = "HMS";
    int sec = 0;

    java.util.Random in = new  java.util.Random();

    public ClockHMS()
    {
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Armani");
        brands.add("Boxy");
        brands.add("Casio");
        brands.add("Doodle");
        brands.add("Gucci");
        brands.add("Joop");
        brands.add("M&Q");
        brands.add("PANDORA");
        brands.add("Swarovski");
        brands.add("Zippo");
        int b = in.nextInt(10);
        this.brand = brands.get(b);
        hour = in.nextInt(60);
        min = in.nextInt(60);
        sec=in.nextInt(60);
        price = in.nextInt(1000000);
        TimeEdit();
    }


    @Override
    public int getSec() {
        return sec;
    }


    @Override
    public void setSec(int sec) throws Exception {
        if (sec < 0) {
            throw new Exception("Incorrect second");
        } else {
            this.sec = sec;
        }
        this.TimeEdit();
    }

    @Override
    public String toString() {
        return brand + "["+
                hour + ":"
                + min + ":"
                + sec +
                "] Price:"+ price + "р.";
    }

    @Override
    public void TimeEdit()
    {
        while (sec>59)
        {
            min += 1;
            sec -= 60;
        }
        while (min>59)
        {
            hour += 1;
            min -= 60;
        }
        while (hour>23)
        {
            hour-=24;
        }
    }

     @Override
    public String getTimeString()
    {
        String time = String.valueOf(hour)+"  "+String.valueOf(min)+"  " + String.valueOf(sec);
        return time;
    }
    
    @Override
    public void changeTime(int hour, int min, int sec) throws Exception {
        if (hour < 0 || min < 0 || sec< 0) {
            throw new Exception("Incorrect time");
        }

        this.hour+=hour;
        this.min+=min;
        this.sec+=sec;
        this.TimeEdit();
    }

}
