//leetCode problem no344

class Solution{
    public void reverseString(char[] s) {
      reverseString(s, 0);
    }
    //method overloading
      private void reverseString(char[] s, int l) {
         if (l >=s.length/2) return;
         char temp = s[l];
         s[l] = s[s.length-l-1];
         s[s.length-l-1] = temp;
         reverseString(s, l + 1);
     }
    
 }
 public class ReverseString_344{
     public static void main(String[] args){
      Solution obj=new Solution();
      char arr[]=new char[]{'H','e','e','p','f'};
      obj.reverseString(arr);
      // on a char[] array may not always print as expected. It often prints the memory reference like [C@1b6d3586.
      System.out.println( new String(arr));
      
     }

 }
 