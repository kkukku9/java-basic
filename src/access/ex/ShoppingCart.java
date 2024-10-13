package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    int itemcnt = 0;

    public void addItem(Item item) {
        items[itemcnt] = item;
        itemcnt++;
    }
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (Item item : items) {
            if (item == null) {
                continue;
            }
            System.out.println("상품명: " + item.getName() + ", 합계: " + (item.getPrice() * item.getQuantity()));
            totalPrice += item.getPrice() * item.getQuantity();
        }

        System.out.println("전체 가격 합: " + totalPrice);
    }
}
