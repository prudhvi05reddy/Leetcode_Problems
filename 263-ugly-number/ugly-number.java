class Solution {
    public boolean isUgly(int n) {
       if(n<=0)
         return false;
         int [] prime={2,3,5};
         for(int i:prime){
            while(n%i==0){
                n/=i;
            }
         }
         return n==1;
    }
}




























// class Solution {
//     public boolean isUgly(int n) {
//         if (n <= 0) return false;
//         int[] factors = {2, 3, 5};
//         for (int f : factors) {
//             while (n % f == 0) {
//                 n /= f;
//             }
//         }
//         return n == 1;
//     }
// }
