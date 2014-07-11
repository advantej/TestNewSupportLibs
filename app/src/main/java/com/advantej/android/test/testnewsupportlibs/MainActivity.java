package com.advantej.android.test.testnewsupportlibs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.advantej.android.test.testnewsupportlibs.cardview.TestCardViewActivity;
import com.advantej.android.test.testnewsupportlibs.palette.TestPalettteActivity;
import com.advantej.android.test.testnewsupportlibs.recyclerview.TestRecyclerViewActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.lv_main_menu);
        listView.setAdapter(new MyAdapter());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, TestRecyclerViewActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, TestCardViewActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, TestPalettteActivity.class));
                        break;
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private class MyAdapter extends BaseAdapter {

        List<String> menuItems = new ArrayList<String>();

        private MyAdapter() {
            menuItems.add("Test Recycler View");
            menuItems.add("Test Card View");
            menuItems.add("Test Palette ");
        }

        @Override
        public int getCount() {
            return menuItems.size();
        }

        @Override
        public Object getItem(int position) {
            return menuItems.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = View.inflate(MainActivity.this, R.layout.main_menu_row, null);
            }

            ((TextView)convertView.findViewById(R.id.tv_main_menu_row_menu_name)).setText(menuItems.get(position));

            return convertView;
        }
    }
}
