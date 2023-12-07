package hello.core.order.service;

import hello.core.member.domain.Member;
import hello.core.order.Order;

public interface OrderService {

    Order order(Long memberId,String itemName, int itemPrice);
}
