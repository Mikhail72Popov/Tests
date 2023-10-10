package org.example.hw6;
public class List2 {
    public static double list2(){
        double sumMas2=0;
        int[] Mas2 = new int[6];
        for(int i=0;i<Mas2.length;i++){
            Mas2[i]=(int)(Math.random()*6);
//            System.out.print(Mas2[i] +" ");
            //Посчитаем и сохраним соеднее арифметическое первого массива
            sumMas2 += (double) Mas2[i]/Mas2.length;
        } return sumMas2;
    }
}
