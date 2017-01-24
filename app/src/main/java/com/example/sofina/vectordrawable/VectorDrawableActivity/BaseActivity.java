package com.example.sofina.vectordrawable.VectorDrawableActivity;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.sofina.vectordrawable.R;

/**
 * Created by fanxiafei on 2017/1/24.
 */
public abstract class BaseActivity extends Activity {

    protected AnimatedVectorDrawable mDrawable;

    protected ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_layout);
        imageView = (ImageView) findViewById(R.id.image);
        intView();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animate();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        imageView.clearAnimation();
    }

    protected void animate() {
        imageView.setImageDrawable(mDrawable);
        mDrawable.start();
    }

    protected abstract void intView();

}
