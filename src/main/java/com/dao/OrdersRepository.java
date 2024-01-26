package com.dao;

import com.model.Orders;

public interface OrdersRepository {
    Orders getOrders(long id);
}
