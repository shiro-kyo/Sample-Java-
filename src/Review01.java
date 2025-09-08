
public class Review01 {
    public static void main(String[] args) {
        int price = 1500;
        int taxAmount = tax(price);
        int total = price + taxAmount;
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + taxAmount + "円)です。");
    }
    public static int tax(int price) {
        double taxRate = 0.10;
        return (int)(price * taxRate);
    }
}
