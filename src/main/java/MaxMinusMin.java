
import java.util.List;
import java.util.Comparator;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        nums.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer int1, Integer int2) {
                return Integer.compare(int1,int2);
            }
        });
        return nums.get(nums.size()-1)-nums.get(0);
        //commenting some code so that I can re-commit bc the RevPro site is being stupid
    }
}
