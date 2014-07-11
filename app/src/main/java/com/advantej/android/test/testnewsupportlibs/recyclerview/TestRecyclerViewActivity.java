package com.advantej.android.test.testnewsupportlibs.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.advantej.android.test.testnewsupportlibs.R;

public class TestRecyclerViewActivity extends Activity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mRecyclerViewAdapter;

    private int mOrientation = LinearLayoutManager.VERTICAL;
    private LinearLayoutManager mLinearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(mOrientation);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        mRecyclerViewAdapter = new MyRecyclerViewAdapter();
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test_recycler_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_toggle_orientation) {
            mOrientation = mOrientation == LinearLayoutManager.VERTICAL ? LinearLayoutManager.HORIZONTAL : LinearLayoutManager.VERTICAL;
            mLinearLayoutManager.setOrientation(mOrientation);
//            mRecyclerView.invalidate(); // even this is not needed !
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
