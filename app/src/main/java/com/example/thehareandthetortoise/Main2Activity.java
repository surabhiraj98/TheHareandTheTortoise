package com.example.thehareandthetortoise;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


public class Main2Activity extends AppCompatActivity {
    VideoView vid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vid = (VideoView)findViewById(R.id.videoView4);

    }

    public void playVideo(View view) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

        String path = "android.resource://com.example.thehareandthetortoise/"+R.raw.story;

        Uri u = Uri.parse(path);

        vid.setVideoURI(u);

        vid.start();
    }
}
