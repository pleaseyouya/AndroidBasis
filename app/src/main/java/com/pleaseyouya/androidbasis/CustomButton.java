package com.pleaseyouya.androidbasis;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by wangjinfa on 2016/1/19.
 */
public class CustomButton extends Button{

    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("wjf", "Button on touch event:" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
