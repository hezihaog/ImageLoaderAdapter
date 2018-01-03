package com.hzh.image.loader.adapter;

import com.hzh.image.loader.adapter.base.ILoader;

/**
 * Package: com.hzh.image.loader.middleware
 * FileName: ImageLoader
 * Date: on 2018/1/1  下午12:31
 * Auther: zihe
 * Descirbe:ImageLoader中间层
 * Email: hezihao@linghit.com
 */

public class ImageLoaderAdapter {
    private ILoader mImageLoader;

    private ImageLoaderAdapter() {
    }

    private static class SingleHolder {
        private static final ImageLoaderAdapter INSTANCE = new ImageLoaderAdapter();
    }

    /**
     * 获取适配器实例
     *
     * @return 适配器实例
     */
    public static ImageLoaderAdapter getInstance() {
        return SingleHolder.INSTANCE;
    }

    /**
     * 设置加载器实现类
     *
     * @param imageLoader 加载器实现类对象
     */
    public void setImageLoader(ILoader imageLoader) {
        this.mImageLoader = imageLoader;
    }

    /**
     * 获取加载器实现类对象
     *
     * @return 加载器实现类对象
     */
    public ILoader getImageLoader() {
        return this.mImageLoader;
    }
}