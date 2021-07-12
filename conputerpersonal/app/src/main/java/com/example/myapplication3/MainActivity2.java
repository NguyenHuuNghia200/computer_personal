package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_cong, b_tru, b_nhan, b_chia, b_bang;
    TextView input, output;
    final char cong = '+', tru = '-', nhan = '*', chia = '/', bang = '0';
    double var1, var2, ans;
    char thucthi;
    double gtri1 = Double.NaN, gtri2 = Double.NaN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.one);
        b2 = (Button) findViewById(R.id.two);
        b3 = (Button) findViewById(R.id.three);
        b4 = (Button) findViewById(R.id.four);
        b5 = (Button) findViewById(R.id.five);
        b6 = (Button) findViewById(R.id.six);
        b7 = (Button) findViewById(R.id.seven);
        b8 = (Button) findViewById(R.id.eight);
        b9 = (Button) findViewById(R.id.nine);
        b0 = (Button) findViewById(R.id.zero);
        b_cong = (Button) findViewById(R.id.cong);
        b_tru = (Button) findViewById(R.id.tru);
        b_nhan = (Button) findViewById(R.id.nhan);
        b_chia = (Button) findViewById(R.id.chia);
        b_bang = (Button) findViewById(R.id.bang);
        input = (TextView) findViewById(R.id.testinput);
        output = (TextView) findViewById(R.id.testoutput);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(input.getText() + "0");
            }
        });
        b_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan();
                thucthi = cong;
                output.setText(String.valueOf(gtri1) + "+");
                input.setText(null);
            }
        });
        b_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan();
                thucthi = cong;
                output.setText(String.valueOf(gtri1) + "-");
                input.setText(null);
            }
        });
        b_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan();
                thucthi = cong;
                output.setText(String.valueOf(gtri1) + "*");
                input.setText(null);
            }
        });
        b_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan();
                thucthi = cong;
                output.setText(String.valueOf(gtri1) + "/");
                input.setText(null);
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhtoan();
                thucthi = bang;
                EditTextNumber.setText(EditTextNumber.getText().toString() + String.valueOf(gtri2) + "=" + String.valueOf(gtri1));
                EditTextKQ.setText(null);
            }
        });
    }
    public void tinhtoan() {
        if (!Double.isNaN(gtri1)) {
            gtri2 = Double.parseDouble(input.getText().toString());
            switch (thucthi) {
                case cong:
                    gtri1 = gtri1 + gtri2;
                    break;
                case tru:
                    gtri1 = gtri1 - gtri2;
                    break;
                case nhan:
                    gtri1 = gtri1 * gtri2;
                    break;
                case chia:
                    gtri1 = gtri1 / gtri2;
                    break;
                case bang:
                    break;
            }
        } else {
            gtri1 = Double.parseDouble(input.getText().toString());
        }
    }
}