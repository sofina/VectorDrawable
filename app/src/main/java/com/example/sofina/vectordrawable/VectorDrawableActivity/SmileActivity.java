package com.example.sofina.vectordrawable.VectorDrawableActivity;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;

import com.example.sofina.vectordrawable.R;

/**
 * Created by fanxiafei on 2017/1/24.
 */
public class SmileActivity extends BaseActivity {

    @Override
    protected void intView() {
        mDrawable = (AnimatedVectorDrawable) getDrawable(R.drawable.smiling_face);
        imageView.setImageResource(R.drawable.face);
    }

}
