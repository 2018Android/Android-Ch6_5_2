package com.example.admin.ch6_5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private RadioGroup radioGroup;
    private RadioButton rdb01, rdb02, rdb03, rdb04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //取得View物件
        output = (TextView) findViewById(R.id.txv_output);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rdb01 = (RadioButton) findViewById(R.id.rdbRare);
        rdb02 = (RadioButton) findViewById(R.id.rdbMedium);
        rdb03 = (RadioButton) findViewById(R.id.rdbMedWell);
        rdb04 = (RadioButton) findViewById(R.id.rdbWellDone);
        //註冊傾聽者物件
        radioGroup.setOnCheckedChangeListener(listener);
    }
    //建立傾聽者物件
    private RadioGroup.OnCheckedChangeListener listener = new RadioGroup.OnCheckedChangeListener(){
        public void onCheckedChanged(RadioGroup group,int checkedId){
            //判斷選擇哪個RadioButton物件
            if (checkedId == rdb01.getId()){
                output.setText(rdb01.getText());
            }else if (checkedId == rdb02.getId()){
                output.setText(rdb02.getText());
            }else if (checkedId == rdb03.getId()){
                output.setText(rdb03.getText());
            }else output.setText(rdb04.getText());

        }

    };
}
