package clocks;

public interface IClock {

    void setHour(int hour) throws Exception;
    void setMin(int minute) throws Exception;
    void setSec(int sec) throws Exception;


    int getHour();
    int getMin();
    String getBrand();
    int getPrice();
    int getSec() throws Exception;
    void changeTime(int hour, int minute, int second) throws Exception;

    void setPrice(int price);
    void setBrand(String brand);
    void TimeEdit();
    String getTimeString();
}
