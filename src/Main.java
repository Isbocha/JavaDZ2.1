// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int money = 17_240; //Сумма потраченных рублей
        int priceBonus = 20; //Стоимость одной мили
        int bonus = money / priceBonus; //Колличество полученных миль
        System.out.println("Колличество полученных миль:");
        System.out.println(bonus);
    }
}