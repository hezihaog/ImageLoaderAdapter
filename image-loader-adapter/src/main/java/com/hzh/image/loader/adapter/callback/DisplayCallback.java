package com.hzh.image.loader.adapter.callback;

/**
 * 加载Url回调
 */
public interface DisplayCallback {
    /**
     * 加载前的准备
     */
    void onReady();

    /**
     * 加载异常
     */
    void onException();
}