public class Main {
    public static void main(String[] args) {
        BonusMilesService bonus = new BonusMilesService();
        int result =  bonus.calculate( 10_000);
        System.out.println("Ваш бонус составляет=" + result);
    }
}