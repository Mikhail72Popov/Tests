package org.example.hw6;
import org.junit.Assert;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ArithmeticMeanTest{
    private ArithmeticMean arithmeticMean;
    private List1 list1;
    private List2 list2;

    @Before
    public void setup(){
        arithmeticMean = new ArithmeticMean();
        list1 = new List1();
        list2 = new List2();
    }

    @Test
    public void testCompareList_GivenTwoEmptyLists_ShouldReturnEqual() {
        List<Double> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        String result = arithmeticMean.toString();
        Assert.assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareLists_GivenTwoListWithEqualAverages_ShouldReturnEqual(){
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        List<Double> list2 = new ArrayList<>();
        list2.add(4.0);
        list2.add(5.0);
        String result = arithmeticMean.toString();
        Assert.assertEquals("Второй список имеет большее среднее значение", result);
    }
    @Test
    public  void testCompareLists_GivenTwoListsWithEqualAverages_ShouldReturnEqual(){
        List<Double> list1 = new ArrayList<>();
        list1.add(4.0);
        list1.add(2.0);
        list1.add(3.0);
        List<Double> list2 = new ArrayList<>();
        list2.add(4.0);
        list2.add(2.0);
        String result = arithmeticMean.toString();
        Assert.assertEquals("Средние значения равны", result);
    }
}



