package com.example.yperezmartinez.fragmentsab;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class DetailActivity extends Activity {
    public static final String EXTRA_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // check if dual pane mode is active
        // if yes, finish this activity
        if (getResources().getBoolean(R.bool.dual_panel)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String url = extras.getString(EXTRA_URL);
            MainActivityFragment detailFragment = (MainActivityFragment) getFragmentManager()
                    .findFragmentById(R.id.detailFragment);
            TextView textview= (TextView) findViewById(R.id.textView);
            textview.setText(url);
        }
    }
}
