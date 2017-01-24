package com.example.sofina.vectordrawable;

import android.annotation.TargetApi;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.sofina.vectordrawable.VectorDrawableActivity.CheckAnimation;
import com.example.sofina.vectordrawable.VectorDrawableActivity.SmileActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class MainActivity extends ListActivity {

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final List<Demo> demos = Arrays.asList(
                new Demo(this, CheckAnimation.class),
                new Demo(this, SmileActivity.class),
                new Demo(this, CheckAnimation.class)
        );

        final List<String> demoName = Arrays.asList(
                "对号",
                "笑脸",
                "对号"
        );

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, demoName);
        getListView().setAdapter(adapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Demo demo = demos.get(i);
                startActivity(new Intent(MainActivity.this, demo.activity));
            }
        });

    }

    public static class Demo {
        public final Class<?> activity;

        public Demo(Context context, Class<?> activityName) {
            this.activity = activityName;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }


}
