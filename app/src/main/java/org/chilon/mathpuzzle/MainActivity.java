package org.chilon.mathpuzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button beginner = (Button)findViewById(R.id.beginner);
        Button intermed = (Button) findViewById(R.id.intermediate);
        Button recyclerView = (Button) findViewById(R.id.activity_recyclerview);

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Beginner.class);
                startActivity(intent);
            }
        });

        intermed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(getApplicationContext(),Intermediate.class);
                startActivity(int2);
            }
        });

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(getApplicationContext(),NavigationRecyclerView.class);
                startActivity(int3);
            }
        });
    }
}
