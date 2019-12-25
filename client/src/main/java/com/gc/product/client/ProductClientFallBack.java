package com.gc.product.client;

import com.gc.product.common.DecreaseStockInput;
import com.gc.product.common.ProductInfoOutput;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientFallBack implements ProductClient{


    @Override
    public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
        return null;
    }

    @Override
    public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {

    }
}
