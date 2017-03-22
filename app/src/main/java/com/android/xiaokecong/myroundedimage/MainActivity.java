package com.android.xiaokecong.myroundedimage;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RoundedImageView roundedImageView;
    private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        roundedImageView = (RoundedImageView) findViewById(R.id.round_iv);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        roundedImageView.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.duorou), getResources()
                        .getDimensionPixelSize(R.dimen.dp_5),
                RoundedImageView.CORNER_TOP_LEFT | RoundedImageView.CORNER_TOP_RIGHT);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                roundedImageView.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.duorou), getResources()
                                .getDimensionPixelSize(R.dimen.dp_5),
                        RoundedImageView.CORNER_TOP_LEFT | RoundedImageView.CORNER_TOP_RIGHT);
                break;
            case R.id.btn2:
                roundedImageView.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.duorou), getResources()
                                .getDimensionPixelSize(R.dimen.dp_5),
                        RoundedImageView.CORNER_TOP_LEFT | RoundedImageView.CORNER_BOTTOM_LEFT);
                break;
            case R.id.btn3:
                roundedImageView.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.duorou), getResources()
                                .getDimensionPixelSize(R.dimen.dp_5),
                        RoundedImageView.CORNER_BOTTOM_LEFT | RoundedImageView.CORNER_BOTTOM_RIGHT);
                break;
            case R.id.btn4:
                roundedImageView.setImage(BitmapFactory.decodeResource(getResources(), R.drawable.duorou), getResources()
                                .getDimensionPixelSize(R.dimen.dp_5),
                        RoundedImageView.CORNER_TOP_RIGHT | RoundedImageView.CORNER_BOTTOM_RIGHT);
                break;

        }
    }
}
