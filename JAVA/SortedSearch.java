public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
       return binarySearch(sortedArray, 0, sortedArray.length-1,lessThan);
    }
    
    public static int binarySearch(int[] sortedArray, int min, int max, int lessThan){
         while (min <= max)
        {
            int m = min + (max-min)/2;
 
    // Check if x is present at mid
            if (sortedArray[m] == lessThan) 
        return m;  
 
    // If x greater, ignore left half  
    if (sortedArray[m] < lessThan) 
        return binarySearch(sortedArray, m+1, max, lessThan);// = m + 1; 
 
    // If x is smaller, ignore right half 
    else 
        return binarySearch(sortedArray, min, m-1, lessThan);
         //r = m - 1; 
  }
        return min+(max-min)/2;
        
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}