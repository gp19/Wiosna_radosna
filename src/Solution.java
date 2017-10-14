/**
 * Created by Grzesław on 2017-10-14.
 */
public class Solution {

    private int mMaxValue;
    private String mFirstKnapsackIndices;
    private String mSecondKnapsackIndices;

    public Solution(int maxValue, String firstKnapsackIndices, String secondKnapsackIndices){

        mMaxValue = maxValue;
        mFirstKnapsackIndices = firstKnapsackIndices;
        mSecondKnapsackIndices = secondKnapsackIndices;

    }

    public int getMaxValue(){
        return mMaxValue;
    }

    public String getFirstKnapsackIndices(){
        return mFirstKnapsackIndices;
    }

    public String getSecondKnapsackIndices(){
        return mSecondKnapsackIndices;
    }

}
