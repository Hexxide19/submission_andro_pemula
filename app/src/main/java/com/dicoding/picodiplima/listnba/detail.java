package com.dicoding.picodiplima.listnba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class detail extends AppCompatActivity {
    public static String TITLE = "ex_title";
    public static String Detail1 = "ex_detail1";
    public static String Detail2 = "ex_detail2";
    public static String Detail3 = "ex_detail3";
    public static String Detail4 = "ex_detail4";

    public static String IMG =  "ex_img";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail Team");

        TextView tvtitle   = (TextView)findViewById(R.id.tv_title);
        TextView tvdetail1 = (TextView)findViewById(R.id.tv_detail1);
        TextView tvdetail2 = (TextView)findViewById(R.id.tv_detail2);
        TextView tvdetail3 = (TextView)findViewById(R.id.tv_detail3);
        TextView tvdetail4 = (TextView)findViewById(R.id.tv_detail4);

        ImageView imgV = (ImageView)findViewById(R.id.img);

        String title = getIntent().getStringExtra(TITLE);
        String detail1 = getIntent().getStringExtra(Detail1);
        String detail2 = getIntent().getStringExtra(Detail2);
        String detail3 = getIntent().getStringExtra(Detail3);
        String detail4 = getIntent().getStringExtra(Detail4);

        String image = getIntent().getStringExtra(IMG);

        tvtitle.setText(title);
        tvdetail1.setText(detail1);
        tvdetail2.setText(detail2);
        tvdetail3.setText(detail3);
        tvdetail4.setText(detail4);

        Picasso.with(this).load(image).into(imgV);
    }
}
