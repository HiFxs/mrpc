package com.kongzhong.mrpc.model;

/**
 * 负载均衡策略
 * <p>
 * Created by biezhi on 2016/12/30.
 */
public enum Strategy {

    POLL("轮询"),
    RANDOM("随机"),
    LAST("最新节点");

    private final String desc;

    Strategy(String desc) {
        this.desc = desc;
    }

}