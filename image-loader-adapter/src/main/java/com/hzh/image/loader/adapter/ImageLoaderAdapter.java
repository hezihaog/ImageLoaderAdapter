package com.hzh.image.loader.adapter;

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

    public static ImageLoaderAdapter getInstance() {
        return SingleHolder.INSTANCE;
    }

    public void setImageLoader(ILoader imageLoader) {
        this.mImageLoader = imageLoader;
    }

    public ILoader getImageLoader() {
        return this.mImageLoader;
    }
}