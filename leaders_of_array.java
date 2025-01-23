import java.util.*;

class leaders_of_array{

    public static ArrayList<Integer> leader_array(int a[]){
       ArrayList<Integer> ans = new ArrayList<>();
       
       int n = a.length;
       int maxi = a[n-1];
       ans.add(maxi);

       for(int i = n-2;i>=0;i--)
       {
        if(a[i]>maxi)
        {
            ans.add(maxi);
            maxi = a[i];

        }
       }
       return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element:");
        int m = sc.nextInt();

        int []arr = new int[m];

        System.out.println("Enter the array:");
        for(int i=0;i<=m;i++){
            arr[i]= sc.nextInt();
        }

        ArrayList<Integer> ans = leader_array(arr);
        Collections.sort(ans,Collections.reverseOrder());

        for(int i=0;i<=ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}