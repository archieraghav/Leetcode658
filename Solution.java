import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    static class Answer {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i=0; i<k; i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1]){
            for(int i=n-1; i>=(n-k); i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int lb = n;
        int lo = 0;
        int hi = (n-1);
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }

        int j= lb;
        int i = lb-1;
        while(k>0 && i>=0 && j<n){
            int di = Math.abs(x - arr[i]);
            int dj = Math.abs(x - arr[j]);

            if(di<=dj){
                ans.add(arr[i]);
                i--;
            }
            else {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i>=0 && k>0){
            ans.add(arr[i]);
            i--;
            k--;
        }
        while(j<n && k>0){
            ans.add(arr[j]);
            j++;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}
public static void main(String[] args) {
        Answer sol = new Answer();

        int[] arr = {-2, -1, 1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        List<Integer> result = sol.findClosestElements(arr, k, x);
        System.out.println(result); // Expected Output: [1, 2, 3, 4, 5]
    }
}
