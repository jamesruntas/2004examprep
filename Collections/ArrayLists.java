package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public ArrayList<String> myArrayList;
    public int number;
    public static String[] strArray = {"Pikachu", "Charmander", "Lugia"};
    public static String[] strArray2 = {"Squirtle", "Charizard", "Celebi"};

    public ArrayLists(String[] pokemon){
         
        this.myArrayList = new ArrayList<>(Arrays.asList(pokemon));
        this.number = 12345;
    }

    @Override
    public String toString(){
        return "Custom Object printing with ToString" + this.myArrayList + " " + this.number;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){return true;}

        if(!(o instanceof ArrayLists)){
            return false;
        }

        ArrayLists listToCheck = (ArrayLists) o;

        return this.myArrayList.equals(listToCheck.myArrayList) && this.number == listToCheck.number;
    }


    public static void main(String[] args){
        ArrayLists collectionTest = new ArrayLists(strArray);
        ArrayLists collectionTest2 = new ArrayLists(strArray2);

        ArrayLists collectionTest3 = new ArrayLists(strArray);
        ArrayLists collectionTest4 = collectionTest;



        if(collectionTest.equals(collectionTest2)){
           System.out.println("true"); 
        }
        else{
           System.out.println("false"); 
        }





        if(collectionTest.equals(collectionTest3)){
           System.out.println("true"); 
        }
        else{
           System.out.println("false"); 
        }





        if(collectionTest.equals(collectionTest4)){
           System.out.println("true"); 
        }
        else{
           System.out.println("false"); 
        }


        
        System.out.println(collectionTest2);
    }

    
}
