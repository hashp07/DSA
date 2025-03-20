import java.util.ArrayList;

public class Majority_Element_II {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        // Extended Boyer-Moore Voting Algorithm
        for (int i = 0; i < arr.size(); i++) {
            if (cnt1 == 0 && el2 != arr.get(i)) {
                el1 = arr.get(i);
                cnt1++;
            } else if (cnt2 == 0 && el1 != arr.get(i)) {
                el2 = arr.get(i);
                cnt2++;
            } else if (el1 == arr.get(i)) {
                cnt1++;
            } else if (el2 == arr.get(i)) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        ArrayList<Integer> ls = new ArrayList<>(); // List to store results

        // Reset counts and verify the candidates
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (el1 == arr.get(i)) {
                cnt1++;
            } else if (el2 == arr.get(i)) {
                cnt2++;
            }
        }

        int mini = (int) (arr.size() / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        return ls;
    }
}
