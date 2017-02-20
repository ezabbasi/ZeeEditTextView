package com.tpl.zeeedittextview;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Ahsan-TPL on 2/20/2017.
 */

public class ZeeEditText extends EditText {
    public ZeeEditText(Context context) {
        super(context);
    }

    public ZeeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        super.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

    public ZeeEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void setTextColor(int color) {
        super.setTextColor(getResources().getColor(R.color.colorPrimary));
    }

}
