package algorithm;/*package src.algorithm;

import org.testng.Assert;
import sun.jvm.hotspot.utilities.Assert;

public class UnitTestSorting {

    *//*
      This class is about Unit testing for Sorting Algorithm.
     *//*
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now do for rest of the algorithm...................below


    }
}*/
