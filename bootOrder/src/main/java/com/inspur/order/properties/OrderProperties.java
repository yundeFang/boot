package com.inspur.order.properties;

/**
 * @Description
 * @Author Harland.Fang
 * @Date 2020/6/8
 **/

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 以myspcloud开头的配置被匹配到
 * @author Evan
 */
@Component
@ConfigurationProperties(prefix="myspcloud")
public class OrderProperties {

    private ItemProperties item = new ItemProperties();

    public ItemProperties getItem() {
        return item;
    }

    public void setItem(ItemProperties item) {
        this.item = item;
    }
}