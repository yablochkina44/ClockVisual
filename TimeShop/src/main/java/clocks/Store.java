package clocks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;


public class Store {
    ArrayList<IClock> list = new ArrayList<IClock>();

    public Store(ArrayList<IClock> list)
    {
        this.list.addAll(list);
    }

    public void ShowStore()
    {
        for(IClock c: list)
        {
            System.out.println(c.toString());
        }
    }



    //добавить новые часы
    public void AddClock(TypeClock type)
    {
        if (type == TypeClock.HM) {
            list.add(new ClockHM());
           // list.get(list.size()-1) последний элемент
        }
        if (type == TypeClock.HMS) {
            list.add(new ClockHMS());
        }


    }


    // самые дорогие часы
    public IClock ExpensiveClock()
    {
        int max=-1;
        IClock res = new ClockHMS();
        for(IClock c:list)
        {
            if (c.getPrice()>max)
            {
                max=c.getPrice();
                res=c;
            }
        }
        return res;
    }

    // установить время на всех часах
    public void TimeAll(int h, int m, int s) throws Exception
    {
        for(IClock c: list) {
            c.setHour(h);
            c.setMin(m);
            try
            {
                c.setSec(s);
            }
            catch (Exception e)
            {
                continue;
            }
           // finally {return;}
        }
    }

    //самая распрастраненная марка
    public String CommonBrand()
    {
        int max=-1;
        String brand = "";
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(IClock c:list)
        {
         if(h.get(c.getBrand())!=null)
         {
             h.put(c.getBrand(),h.get(c.getBrand())+1);
         }
         else
         {
             h.put(c.getBrand(),1);
         }
        }
        for(Map.Entry<String,Integer> x: h.entrySet())
        {
            if(x.getValue()>max)
            {
                max=x.getValue();
                brand=x.getKey();
            }
        }
       return brand;
    }


    //упорядоченные бренды без повторений
    public ArrayList<String> SortBrand()
    {

        ArrayList<String> brands = new ArrayList<>();
        for(IClock c:list)
        {
            if (!brands.contains(c.getBrand())) //если строка не содержит подстроку
            {
                brands.add(c.getBrand());
            }
            Collections.sort(brands);

        }

        return brands;
    }


}
