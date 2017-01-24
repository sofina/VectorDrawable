package com.example.sofina.vectordrawable.VectorDrawableActivity;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import com.example.sofina.vectordrawable.R;
import com.example.sofina.vectordrawable.Version.Version;

/**
 * Created by fanxiafei on 2017/1/24.
 */
public class CheckAnimation extends BaseActivity {

    @Override
    protected void intView() {
        mDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.animated_check);
        imageView.setImageResource(R.drawable.check_mark);
    }


}
