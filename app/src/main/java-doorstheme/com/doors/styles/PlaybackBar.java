package com.doors.styles;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.doors.substratum.R;

class PlaybackBar extends android.support.v7.widget.AppCompatSeekBar {

    public PlaybackBar( Context context ) {
        this( context, null );
    }

    public PlaybackBar( Context context, AttributeSet attrs ) {
        this( context, attrs, R.attr.playbackBarStyle );
    }

    public PlaybackBar( Context context, AttributeSet attrs,
                              int defStyle ) {
        super( context, attrs, defStyle );

        final TypedArray array = context.obtainStyledAttributes( attrs,
                R.styleable.PlaybackBar, defStyle,
                R.style.Widget_AppCompat_Button );
        array.recycle();
    }
}