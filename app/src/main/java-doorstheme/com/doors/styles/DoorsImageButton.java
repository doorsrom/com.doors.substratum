package com.doors.styles;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;

import com.doors.substratum.R;

public class DoorsImageButton extends AppCompatImageButton {

    public DoorsImageButton( Context context ) {
        this( context, null );
    }

    public DoorsImageButton( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.doorsImageButtonStyle );
    }

    public DoorsImageButton( Context context, AttributeSet attrs,
                       int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.DoorsImageButton, defStyle,
                R.style.Widget_AppCompat_ImageButton );
        array.recycle();
    }
}
