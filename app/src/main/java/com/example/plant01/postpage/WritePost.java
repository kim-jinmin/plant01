package com.example.plant01.postpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.plant01.R;


public class WritePost extends AppCompatActivity {
    EditText title, content;
    Button img, vod, post;
    View.OnClickListener cl;
    Intent intent1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_write);

        title = (EditText) findViewById(R.id.title);
        content = (EditText) findViewById(R.id.content);
        img = (Button) findViewById(R.id.img);
        vod = (Button) findViewById(R.id.vod);
        post = (Button) findViewById(R.id.post);

        intent1 = getIntent();

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.img:
                        break;
                    case R.id.vod:
                        break;
                    case R.id.post:
                        break;
                }
            }
        };
        img.setOnClickListener(cl);
        vod.setOnClickListener(cl);
        post.setOnClickListener(cl);
    }
}
