package com.advantej.android.test.testnewsupportlibs.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.advantej.android.test.testnewsupportlibs.R;
import com.advantej.android.test.testnewsupportlibs.model.FooBar;

/**
 * Created by tejas on 6/30/14.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageView;
    private TextView mMainText;
    private TextView mSubText;

    public static View inflateCell(Context context) {
        return View.inflate(context, R.layout.cell_recycler_view, null);
    }

    public MyViewHolder(View rootView) {
        super(rootView);

        mImageView = (ImageView) rootView.findViewById(R.id.iv_some_image);
        mMainText = (TextView) rootView.findViewById(R.id.tv_main_text);
        mSubText = (TextView) rootView.findViewById(R.id.tv_sub_text);
    }

    public void bindData(FooBar fooBar) {
        //TODO null checks etc..
        mImageView.setImageResource(fooBar.getImageResourceId());
        mMainText.setText(fooBar.getMainText());
        mSubText.setText(fooBar.getSubText());
    }
}
