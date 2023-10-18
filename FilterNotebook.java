
//     Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//     Создать множество ноутбуков.
//     Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. минимум 5 

import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;


public class FilterNotebook {
    public static void PrintNotebooks(ArrayList<Notebook> notebooks){
        for (int i=0; i<notebooks.size();i++) {
            System.out.println(notebooks.get(i).toString());
            System.out.println();
        }
    }
    
}
