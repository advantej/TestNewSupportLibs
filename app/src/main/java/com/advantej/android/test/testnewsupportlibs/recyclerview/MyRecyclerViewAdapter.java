package com.advantej.android.test.testnewsupportlibs.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.advantej.android.test.testnewsupportlibs.content.MockData;
import com.advantej.android.test.testnewsupportlibs.model.FooBar;

import java.util.List;

/**
 * Created by tejas on 6/30/14.
 */
public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<FooBar> mFooBarList;

    public MyRecyclerViewAdapter() {
        mFooBarList = MockData.getMockFoobarObjects(100);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = MyViewHolder.inflateCell(viewGroup.getContext());
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.bindData(mFooBarList.get(i));
    }

    @Override
    public int getItemCount() {
        return mFooBarList.size();
    }
}
