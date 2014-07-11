package com.advantej.android.test.testnewsupportlibs.model;

/**
 * Created by tejas on 6/30/14.
 */
public class FooBar {

    private int mImageResourceId;
    private String mMainText;
    private String mSubText;

    public FooBar(int imageResourceId, String mainText, String subText) {
        mImageResourceId = imageResourceId;
        mMainText = mainText;
        mSubText = subText;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    public String getMainText() {
        return mMainText;
    }

    public void setMainText(String mainText) {
        mMainText = mainText;
    }

    public String getSubText() {
        return mSubText;
    }

    public void setSubText(String subText) {
        mSubText = subText;
    }
}
