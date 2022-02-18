public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;
        else {
            return ((goal/5 <= bigCount)  && (goal % 5 <= smallCount)) || (goal <= smallCount) ||
                    ((goal - 5 * bigCount <= smallCount) && (goal - 5 * bigCount >= 0));
        }
    }
}
