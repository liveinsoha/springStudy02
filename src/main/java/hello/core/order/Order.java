package hello.core.order;

public class Order {

    Long MemberId;
    String itemName;
    int itemPrice;
    int discountPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        MemberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "MemberId=" + MemberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
