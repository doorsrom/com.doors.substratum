package com.doors.styles;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.doors.substratum.R;

class FirstMenuItem extends android.support.v7.widget.AppCompatTextView {

    public FirstMenuItem( Context context ) {
        this( context, null );
    }

    public FirstMenuItem( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.firstMenuItemStyle );
    }

    public FirstMenuItem( Context context, AttributeSet attrs,
                              int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.FirstMenuItem, defStyle,
                R.style.TextAppearance_AppCompat_Small );
        array.recycle();
    }
}