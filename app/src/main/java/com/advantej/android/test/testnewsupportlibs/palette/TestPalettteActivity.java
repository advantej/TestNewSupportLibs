package com.advantej.android.test.testnewsupportlibs.palette;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.advantej.android.test.testnewsupportlibs.R;

public class TestPalettteActivity extends Activity {

   // More on using the palette at : http://chris.banes.me/2014/07/04/palette-preview/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_palette);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.raw.map);
        Palette palette = Palette.generate(bitmap);

        ((ImageView)findViewById(R.id.iv_palette_image)).setImageBitmap(bitmap);

        TextView textView1 =  ((TextView)findViewById(R.id.tv_palette1));
        textView1.setText("getVibrantColor");
        textView1.setTextColor(palette.getVibrantColor().getRgb());

        TextView textView2 =  ((TextView)findViewById(R.id.tv_palette2));
        textView2.setText("getDarkVibrantColor");
        textView2.setTextColor(palette.getDarkVibrantColor().getRgb());

        TextView textView3 =  ((TextView)findViewById(R.id.tv_palette3));
        textView3.setText("getLightVibrantColor");
        textView3.setTextColor(palette.getLightVibrantColor().getRgb());

        TextView textView4 =  ((TextView)findViewById(R.id.tv_palette4));
        textView4.setText("getMutedColor");
        textView4.setTextColor(palette.getMutedColor().getRgb());

        TextView textView5 =  ((TextView)findViewById(R.id.tv_palette5));
        textView5.setText("getDarkMutedColor()");
        textView5.setTextColor(palette.getDarkMutedColor().getRgb());

        TextView textView6 =  ((TextView)findViewById(R.id.tv_palette6));
        textView6.setText("getLightMutedColor()");
        textView6.setTextColor(palette.getLightMutedColor().getRgb());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test_palette, menu);
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
}
