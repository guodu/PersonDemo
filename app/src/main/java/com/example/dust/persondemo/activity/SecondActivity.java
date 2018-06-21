package com.example.dust.persondemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dust.persondemo.R;
import com.example.dust.persondemo.view.MyGradientView;
import com.example.dust.persondemo.view.RadarGradientView;
import com.example.dust.persondemo.view.ZoomImageView;

public class SecondActivity extends AppCompatActivity {



    public   static String STATE_TYPE="state_type";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String state_type = getIntent().getStringExtra(STATE_TYPE);


        switch (state_type){

            case "1":
                /**
                 * 雷达效果
                 */
               setContentView(new RadarGradientView(this));
                break;

            case "2":

                /**   局部放大  **/
              setContentView(new ZoomImageView(this));
                break;

            case "3":


                /**   刀剑回影子  效果  **/
              setContentView(R.layout.activity_second);
                break;

            case "4":

                /**   心形图渐变效果  **/
                setContentView(new MyGradientView(this));
                break;

            case "5":

                break;


        }





    }


}
