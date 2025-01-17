import java.util.Random;

public class ShopperFabric {
    private static Random random = new Random();

    public static Shopper generateShopper(){
        String[] names = new String[] { "Федор", "София", "Владимир", "Светлана", "Кристина", "Борис", "Олег", "Мария" };
        String[] surnames = new String[] { "Селиверстов", "Вазовски", "Федорова", "Барабанов", "Банникова", "Бирюкова", "Акулова", "Григорьев" };
        int salary = random.nextInt(60000, 120001);
        Integer day = random.nextInt(1, 31);
        Integer month = random.nextInt(1, 12);
        Integer year = random.nextInt(1950, 2004);

        String name = names[random.nextInt(names.length)];
        String surname = surnames[random.nextInt(surnames.length)];
        MaleEnum male = name == "София" || name == "Светлана" || name == "Кристина" || name == "Мария" ? MaleEnum.female : MaleEnum.male;

        return new Shopper(surname, name, salary, year, month, day, male);
    }

    /**
     * Фабрика по созданию рабочих
     * @param count
     * @return
     */
    public static Shopper[] generateShoppers(int count){
        Shopper[] shopper = new Shopper[count];

        for (int i = 0; i < count; i++) {
            shopper[i] = generateShopper();
        }
        return shopper;
    }
}
