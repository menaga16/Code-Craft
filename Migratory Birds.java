import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] types=new int[n];
        for(int types_i=0;types_i<n;types_i++)
        {
            types[types_i]=in.nextInt();
        }
        
        Map<Integer,Long>typesToCountMap=IntStream.of(types).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Long maxCount=typesToCountMap.values().stream().max(Comparator.naturalOrder()).get();
        List<Integer>typeWithMaxCount=typesToCountMap.entrySet().stream().filter(item -> Objects.equals(item.getValue(), maxCount)).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(typeWithMaxCount.get(0));
    }
}
