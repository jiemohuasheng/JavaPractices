package dataStructures;

public class LinearSearch {
    int[] array = {2,4,1,5,3,7,9,8,0};//declare the array
    
    public LinearSearch(){//create a constructor
        
    }
    
    public void search(){//create a method
        for(int i=0;i<array.length;i++){
            if(array[i]==3){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        LinearSearch newObj = new LinearSearch();
        newObj.search();
    }
}
