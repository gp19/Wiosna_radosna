/**
 * Created by gp19 on 2017-10-14.
 */
class Solution {

    private final int mMaxValue;
    private final String mFirstKnapsackIndices;
    private final String mSecondKnapsackIndices;

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
