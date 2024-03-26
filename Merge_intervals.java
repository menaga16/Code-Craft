class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparing(i->i[0]));
    
        int n=intervals.length;
        List<int[]> result =new ArrayList<>();
        int[] newint=intervals[0];
        result.add(newint);
        for(int[] i:intervals)
        {
            if(i[0]<=newint[1] )
            {
                newint[1]=Math.max(newint[1],i[1]);
            }
            else
            {
                newint=i;
                result.add(i);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}


output:

intervals =
[[1,3],[2,6],[8,10],[15,18]]
Output
[[1,6],[8,10],[15,18]]
Expected
[[1,6],[8,10],[15,18]]
