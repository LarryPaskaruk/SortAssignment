/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortassignment;

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
        
//        String[] sorted= insertionSort(list);
//        for(int i=0;i<sorted.length;i++){
//            System.out.println(sorted[i]);
//        }

//        String[] sortedB= bubbleSort(list);
//        for(int i=0;i<sortedB.length;i++){
//            System.out.println(sortedB[i]);
//        }

//        String[] sortedC= (String[]) selectionSort(list);
//        for(int i=0;i<sortedC.length;i++){
//            System.out.println(sortedC[i]);
//        }
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
    public static String[] bubbleSort(String[] list){
        String temp;
        //loop goes through array
        for(int j =0; j<=list.length;j++){
        for(int i=0;i<list.length-j-1;i++){
            //store array[i] in temporary variable temp
        temp = list[i];
            //compare temp to array[i+1]
            if(temp.compareTo(list[i+1])>0){
                //swap the two values
                list[i]= list[i+1];
                list[i+1]=temp;
            }
        }
        }
        return list;
}
    
    public static Comparable[] selectionSort(Comparable[] array) {
        //remembers how many indexs have already been sorted
        int indexSorted = 0;
        //loops once for every array member, although value itself is unused
        for (Comparable member : array) {
            //remembers the index of the next ,owest member, by default the next index
            int low = indexSorted;
            
            //loops over every array member and comares with current lowest value
            for(int j = indexSorted; j < array.length; j++) {
                //if a lower value than low is found, set low to index of lower value
                if (array[j].compareTo(array[low]) < 0) {
                    low = j;
                }
            }
            
            //if an index other than the next one is the lowest, swap the values of the two indexs
            if (low != indexSorted) {
                Comparable toShift = array[indexSorted];
                array[indexSorted] = array[low];
                array[low] = toShift;
            }
            
            //adds one index to the amount of sorted index
            indexSorted++;
        }
        
        return array;
    }
}