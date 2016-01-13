package com.pleaseyouya.androidbasis;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ListView listView;

    private List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data.add("data1");
        data.add("data2");
        data.add("data3");
        data.add("data4");
        data.add("data5");
        data.add("data6");
        data.add("data7");
        data.add("data8");
        data.add("data9");
        data.add("data10");
        data.add("data11");
        data.add("data12");

        listView = (ListView)findViewById(R.id.list);

        listView.addHeaderView(LayoutInflater.from(this).inflate(R.layout.list_item, null));
        listView.addFooterView(LayoutInflater.from(this).inflate(R.layout.list_item, null));

        listView.setAdapter(new Adapter());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    class Adapter extends BaseAdapter {
        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.list_item, null);
            TextView textView = (TextView)convertView.findViewById(R.id.text);
            textView.setText(data.get(position));
            return convertView;
        }
    }
}
