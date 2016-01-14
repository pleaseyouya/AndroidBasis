package com.pleaseyouya.androidbasis;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by wangjinfa on 2016/1/14.
 */
public class TestReadPreference extends Activity {

    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_read_preference);

        content = (TextView) findViewById(R.id.read_content);

        String s = getSharedPreferences("pref", MODE_PRIVATE).getString("key",
                "default");
        content.setText(s);
    }
}
