/**
 * Created by Grzesław on 2017-10-14.
 */
public class Solution {

    private int mMaxValue;
    private String mFirstKnapstackIndices;
    private String mSecondKnapstackIndices;

    public Solution(int maxValue, String firstKnapstackIndices, String secondKnapstackIndices){

        mMaxValue = maxValue;
        mFirstKnapstackIndices = firstKnapstackIndices;
        mSecondKnapstackIndices = secondKnapstackIndices;

    }

    public int getMaxValue(){
        return mMaxValue;
    }

    public String getFirstKnapstackIndices(){
        return mFirstKnapstackIndices;
    }

    public String getSecondKnapstackIndices(){
        return mSecondKnapstackIndices;
    }

}
