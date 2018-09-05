package com.doors.styles;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.doors.substratum.R;

class MenuItem extends android.support.v7.widget.AppCompatTextView {

    public MenuItem( Context context ) {
        this( context, null );
    }

    public MenuItem( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.menuItemStyle );
    }

    public MenuItem( Context context, AttributeSet attrs,
                              int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.MenuItem, defStyle,
                R.style.TextAppearance_AppCompat_Small );
        array.recycle();
    }
}