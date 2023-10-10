package org.example.hw6;

public class List1 {
    public static double list1(){

        double sumMas1=0;
        int[] Mas1 = new int[6];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*6);
//            System.out.print(Mas1[i] +" ");
            //Посчитаем и сохраним соеднее арифметическое первого массива
            sumMas1 += (double) Mas1[i]/Mas1.length;
        }  return sumMas1;
    }
}
