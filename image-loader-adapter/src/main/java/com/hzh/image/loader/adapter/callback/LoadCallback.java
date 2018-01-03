package com.hzh.image.loader.adapter.callback;

import android.graphics.Bitmap;

/**
 * 加载Url图片地址成Bitmap回调
 */
public interface LoadCallback {
    /**
     * 加载成功
     *
     * @param bitmap
     */
    void onLoadSuccess(Bitmap bitmap);

    /**
     * 加载异常
     *
     * @param exception 异常对象
     */
    void onLoadFailed(Exception exception);
}