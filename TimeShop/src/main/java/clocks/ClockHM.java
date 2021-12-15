package clocks;
import java.util.ArrayList;

public class ClockHM implements IClock {

    String type = "HM";
    int hour = 0;
    int min = 0;
    int price = 0;
    String brand = "";

    java.util.Random in = new  java.util.Random();


    public ClockHM()
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
        price = in.nextInt(1000000);
        TimeEdit();
    }



    public void setHour(int hour) throws Exception {
        if(hour < 24 && hour >= 0) {
            this.hour = hour;
        } else {
            throw new Exception("Incorrect hour");
        }
    }

    public void setMin(int min) throws Exception {
        if(min < 60 && min >= 0) {
            this.min = min;
        } else {
            throw new Exception("Incorrect minuter");
        }
    }

    public void setSec(int sec) throws Exception {
        throw new Exception("There aren't seconds in this clock");
    }

    @Override
    public int getHour() {
        return hour;
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String getTimeString()
    {
        String time = String.valueOf(hour)+"  "+String.valueOf(min);
        return time;
    }
    
    @Override
    public int getSec() throws Exception {
        throw new Exception("There aren't seconds in this clock");
    }

    @Override
    public void changeTime(int hour, int minute, int second) throws Exception {
        if (hour < 0 || minute < 0) {
            throw new Exception("Incorrect time");
        }
        this.hour+=hour;
        this.min+=min;
        this.TimeEdit();
    }

    @Override
    public void TimeEdit()
    {
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
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return brand + "["+
                hour +
                ":" + min +
                "] Price:"+ price+"р.";
    }

}
