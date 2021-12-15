package clocks;

import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) throws Exception {
        ArrayList<IClock> clock = new ArrayList<>();
        for (int i = 1; i < 10; i++) {

            clock.add(new ClockHM());
            i++;
            clock.add(new ClockHMS());
        }

       // BuilderClock a = new BuilderClock(TypeClock.HM);

        Store shop = new Store(clock);

       //изначальный список
        shop.ShowStore();
        System.out.println("--------------------------");


        System.out.println("Сортировка брендов");
        shop.SortBrand();
        for(String c:shop.SortBrand())
        {
            System.out.println(c);
        }
        System.out.println("--------------------------");


        System.out.println("Самые дорогие часы");
        System.out.println(shop.ExpensiveClock());
        System.out.println("--------------------------");


        System.out.println("Установить время на всех часах");
        shop.TimeAll(22,22,22);
        shop.ShowStore();
        System.out.println("--------------------------");

        System.out.println("Самая распрастраненная марка");
        System.out.println(shop.CommonBrand());
        System.out.println("--------------------------");

        System.out.println("Добавить часы в магазин");
        shop.AddClock(TypeClock.HM);
        shop.ShowStore();
        System.out.println("--------------------------");
    }
}
