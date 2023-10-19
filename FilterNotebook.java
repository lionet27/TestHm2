
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

    public static ArrayList<Notebook> FilterNotebooks (ArrayList<Notebook> notebooks){
        ArrayList<Notebook>filterNotebooks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Выберете по какому параметру Вы хотите отфильтровать ноутбуки:1-ОЗУ; 2 -Объем ЖД; 3- Операционная система;4-цвет");
            String choice=sc.nextLine();
            boolean flag=false;
            if (choice.equals("1")){
                
                while(flag==false){
                    System.out.println("Введите размер ОЗУ(Гб):8; 16; 32");
                    int ozy=sc.nextInt();                     
                    for (int i=0;i<notebooks.size();i++){
                        if (ozy==(notebooks.get(i).OZY)){
                            filterNotebooks.add(notebooks.get(i));
                            flag=true;
                        }   
                    }
                }
            }else if(choice.equals("2")){
                    while(flag==false){
                        System.out.println("Введите обьем ЖД(512Мб,1Tб,2Tб): 512; 1; 2 ");
                        int hdcapacity=sc.nextInt();
                        for (int i=0;i<notebooks.size();i++){
                            if (hdcapacity==(notebooks.get(i).HDcapacity)){
                                filterNotebooks.add(notebooks.get(i));
                                flag=true;
                            }   
                        }
                    }
                
            }else if(choice.equals("3")){
                    while(flag==false){
                        System.out.println("Выберете вариант операционной системы:1-Windows; 2-Linux;3- MacOS");
                        String op=sc.nextLine();
                        if (op.equals("1")){
                            for (int i=0;i<notebooks.size();i++){
                                if (notebooks.get(i).op.equals("Windows")){
                                    filterNotebooks.add(notebooks.get(i));
                                    flag=true;
                                }   
                            }
                        }else if(op.equals("2")){
                            for (int i=0;i<notebooks.size();i++){
                                if (notebooks.get(i).op.equals("Linux")){
                                    filterNotebooks.add(notebooks.get(i));
                                    flag=true;
                                }                   
                            }
                        }else if(op.equals("3")){
                            for (int i=0;i<notebooks.size();i++){
                                if (notebooks.get(i).op.equals("MacOS")){
                                    filterNotebooks.add(notebooks.get(i));
                                    flag=true;
                                }
                            }
                        }else{
                            System.out.println("неправильно ввели число");
                        }       
                    }
                
            }else if(choice.equals("4")){
                while(flag==false){
                    System.out.println("Выберете вариант операционной системы:1-white; 2-grey;3- black");
                    String colour=sc.nextLine();
                    if (colour.equals("1")){
                        for (int i=0;i<notebooks.size();i++){
                            if (notebooks.get(i).colour.equals("white")){
                                filterNotebooks.add(notebooks.get(i));
                                flag=true;
                            }   
                        }
                    }else if(colour.equals("2")){
                        for (int i=0;i<notebooks.size();i++){
                            if (notebooks.get(i).colour.equals("grey")){
                                filterNotebooks.add(notebooks.get(i));
                                flag=true;
                            }                       
                        }
                    }else if(colour.equals("3")){
                        for (int i=0;i<notebooks.size();i++){
                            if (notebooks.get(i).colour.equals("black")){
                                filterNotebooks.add(notebooks.get(i));
                                flag=true;
                            }  
                        }
                    }else{
                        System.out.println("неправильно ввели число");
                    }       
                }
            }else{
                System.out.println("неправильно ввели число");
            }
        sc.close();
        return filterNotebooks;
    }
    
}
