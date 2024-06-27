/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author menag
 */
import java.util.*;
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double tot=0;
        int array[]= new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
            tot+=array[i];
            
        }
        
        double avg=tot/n;
        
        List<List<Integer>>subsets=generateSubsets(array);
        System.out.println("Full subset");
        System.out.println(subsets);
        System.out.println("Average subset");        
        for (List<Integer> subset:subsets) {
            double sum=0;
            int size1=subset.size();
            for(int s:subset)
            {
                sum+=s;
            }
            double avg1=sum/size1;
            if(avg==avg1)
            {
                System.out.println(subset);
            }
                    
        }
        
        List<Integer>new1=new ArrayList<>(); //5
        System.out.print(new1);
    }

    public static List<List<Integer>> generateSubsets(int[] array) 
    {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
       
        for (int num:array) {
            int size=subsets.size();
            for (int i=0;i<size;i++) {
                List<Integer>newSubset=new ArrayList<>(subsets.get(i)); //5
                newSubset.add(num);
                subsets.add(newSubset);
            }
        }
       
        return subsets;
    }
}
    


