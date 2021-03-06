package com.yusheng123.yushengzuche.order;

import com.yusheng123.yushengzuche.entity.Order;
import com.yusheng123.yushengzuche.util.JsonUtil;

import java.util.List;

/**
 * Created by Monty on 2017/1/4.
 */

public class OrdetModelImpl extends AbsModel {

    @Override
    public void getOrderList(int page, OnOrderListListener onOrderListListener) {
        List<Order> orders = parseOrderList(JsonUtil.getOrderJson());
        if(null==orders||orders.isEmpty()){
            onOrderListListener.onError("无数据");
        }else{
            onOrderListListener.onSuccess(orders);
        }
    }
}
