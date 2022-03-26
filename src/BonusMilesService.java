public class BonusMilesService {
    public int calculate(int cost) {
        int part = 20;
        int miles = cost / part;
        return miles;
    }
}
