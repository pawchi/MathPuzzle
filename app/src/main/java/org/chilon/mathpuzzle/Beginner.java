package org.chilon.mathpuzzle;

import android.content.ClipData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Beginner extends AppCompatActivity {

    private ImageView image;
    private ViewGroup rootLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        rootLayout = (ViewGroup) findViewById(R.id.view_root);
        image = (ImageView) findViewById(R.id.img_1);




        image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder shadow = new View.DragShadowBuilder(image);
                v.startDrag(data,shadow,null,0);
                return false;
            }
        });


    }
}
