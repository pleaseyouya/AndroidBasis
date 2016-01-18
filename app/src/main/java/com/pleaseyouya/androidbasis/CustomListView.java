package com.pleaseyouya.androidbasis;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ListView;

/**
 * Created by wangjinfa on 2016/1/19.
 */
public class CustomListView extends ListView {

    public CustomListView(Context context) {
        super(context);
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.d("wjf", "listview onintercept:" + super.onInterceptTouchEvent(event));
        return super.onInterceptTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.d("wjf", "listview ontouch event:" + super.onTouchEvent(ev));
        return super.onTouchEvent(ev);
    }
}
