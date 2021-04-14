public class Tasks {
    public int calculateStairSize(int n) {
        int answer = 0;
        for(int i = 1; i <= n; ++i){
            n-=i;
            ++answer;
        }
        return answer;
    }
    public int calculateMaximumTank(int... nums ) {
        int biggest = 0;
        for(int firstColumn = 0; firstColumn < nums.length; ++firstColumn){
            for(int secondColumn = firstColumn+1; secondColumn < nums.length;++secondColumn){
                if(nums[firstColumn] >= nums[secondColumn]){
                    int tmp = nums[secondColumn] * (secondColumn - firstColumn);
                    if(tmp > biggest)
                        biggest = tmp;
                }
            }
        }
        return biggest;
    }
}
