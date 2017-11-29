/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortassignment;
import java.util.ArrayList;

/**
 *
 * @author 068787845
 */
public class SortAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] list={"4","6","3","7","1","2","5","9","8"};
        
        String[] sorted= insertionSort(list);
        for(int i=0;i<sorted.length;i++){
            System.out.println(sorted[i]);
        }
    }
    public static String[] insertionSort(String[] list){
        //create a loop that loops from the second item to the last
        for (int i=1; i<list.length; i++){
        //use a variable a to temporarily store the index of the current item
            int a = i;
        //loop through comparisons with items before it until it reaches an item that is smaller than it
            while(list[a].compareTo(list[a-1])<0){
        //when item before it is larger, use a temporary string variable to store the current item's value
                String temp = list[a];
                list[a]=list[a-1];//give list[a] the value of the list[a-1]
                list[a-1]=temp;//give list[a-1] the value that is stored in the temporary
                a-=1;
                if(a==0)
                    break;
            }
        }
        return list;
    }
}
