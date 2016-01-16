package com.pleaseyouya.androidbasis;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by wangjinfa on 2016/1/14.
 */
public class TestReadPreference extends Activity {

    private TextView content;
    private Button write;

    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_read_preference);

        content = (TextView) findViewById(R.id.read_content);
        write = (Button) findViewById(R.id.write);




        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "write from test readPref";
                if (flag) {
                    s = "write from test readPref 2";
                }
                flag = !flag;
                getSharedPreferences("pref", MODE_MULTI_PROCESS).edit().putString("key",
                        s).commit();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        String s = getSharedPreferences("pref", MODE_MULTI_PROCESS).getString("key",
                "default");
        content.setText(s);
    }
}
