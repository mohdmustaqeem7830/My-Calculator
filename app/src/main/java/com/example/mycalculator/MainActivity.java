package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
Button btnratio ,btnoff,btnac,btndiv,btn7,btn8,btn9,btnmul,btn4,btn5,btn6,btnadd,btn1,btn2,btn3,btnmin,btndel,btn0,btndot,btnequal;
char div,mul,add,min,ratio;
int flag=0;
TextView edt ;
double res1,res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //id create for all button
        idcreate();
        buttonstring();
        operatorbutton();
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");
                }
                else {
                    res2 = Double.parseDouble(edt.getText().toString() + "");

                    if (add == '+') {
                        edt.setText(res1 + res2 + "");
                        add = '\0';
                    }
                    if (min == '-') {
                        edt.setText(res1 - res2 + "");
                        min = '\0';
                    }
                    if (mul == '*') {
                        edt.setText(res1 * res2 + "");
                        mul = '\0';
                    }
                    if (div == '/') {
                        edt.setText(res1 / res2 + "");
                        div = '\0';
                    }
                    if (ratio == '%') {
                        edt.setText(res1 % res2 + "");
                        ratio = '\0';
                    }
                }
            }
        });


        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText("0");
            }
        });
        btnoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt.getVisibility()==View.VISIBLE){
                    edt.setVisibility(View.GONE);
                    btnoff.setText("ON");
                }
                else{
                    edt.setVisibility((View.VISIBLE));
                    btnoff.setText("OFF");
                    edt.setText("0");
                }
            }
        });
        btndel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if((edt.getText().toString().length()>1)){
                    String str =  edt.getText().toString();
                    String str2 = str.substring(0,str.length()-1);
                    edt.setText(str2.toString());
                }
               else{
                   edt.setText("0");
               }
            }
        });

    }
    public void idcreate(){
        edt = findViewById(R.id.edt);
        btnratio = findViewById(R.id.btnratio);
        btnoff = findViewById(R.id.btnoff);
        btnac = findViewById(R.id.btnac);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);
        btnadd = findViewById(R.id.btnadd);
        btnmin = findViewById(R.id.btnmin);
        btn7= findViewById(R.id.btn7);
        btn8= findViewById(R.id.btn8);
        btn9= findViewById(R.id.btn9);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn0= findViewById(R.id.btn0);
        btndot=findViewById(R.id.btndec);
        btndel= findViewById(R.id.btndel);
        btnequal= findViewById(R.id.btnequal);
    }
    public void buttonstring(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt.setText(edt.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+"0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt.setText(edt.getText()+".");
            }
        });
    }
    public void operatorbutton(){

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");
                }
                else {
                    res1 =   Double.parseDouble(edt.getText().toString()+"");
                    add='+';
                    edt.setText("");
                }
            }
        });
        btnmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");

                }
                else{
                    res1 =   Double.parseDouble(edt.getText().toString()+"");
                    min='-';
                    edt.setText("");

                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");
                }
                else{
                    res1 =   Double.parseDouble(edt.getText().toString()+"");
                    mul='*';
                    edt.setText("");

                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");
                }
                else{
                    res1 =   Double.parseDouble(edt.getText().toString()+"");
                    div='/';
                    edt.setText("");

                }
            }
        });
        btnratio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((edt.getText().toString().length()<=0)){
                    edt.setText("");

                }
                else{
                    res1 =   Double.parseDouble(edt.getText().toString()+"");
                    ratio='%';
                    edt.setText("");

                }
            }
        });
    }
}