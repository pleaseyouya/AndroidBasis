package com.pleaseyouya.androidbasis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wangjinfa on 2016/1/14.
 */
public class TestWritePreference extends Activity {

    private Button privateBtn;
    private Button readable;
    private Button writable;

    private Button toRead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_write_preference);

        privateBtn = (Button) findViewById(R.id.mode_private);
        readable = (Button) findViewById(R.id.mode_world_readable);
        writable = (Button) findViewById(R.id.mode_world_writable);
        toRead = (Button) findViewById(R.id.go_to_read);

        privateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSharedPreferences("pref", Context.MODE_WORLD_READABLE).edit().putString("key",
                        "private").commit();
            }
        });

        readable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSharedPreferences("pref", Context.MODE_WORLD_READABLE).edit()
                        .putString
                        ("key",
                        "world readable").commit();
            }
        });

        writable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSharedPreferences("pref", Context.MODE_WORLD_READABLE).edit().putString("key",
                        "world writable").commit();
            }
        });

        toRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestWritePreference.this, TestReadPreference.class);
                startActivity(intent);
//                String s = getSharedPreferences("pref", MODE_WORLD_READABLE).getString("key", "default");
//                toRead.setText(s);
            }
        });
    }
}
