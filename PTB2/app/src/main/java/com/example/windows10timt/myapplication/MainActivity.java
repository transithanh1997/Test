package com.example.windows10timt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextA,editTextB,editTextC;
    Button buttonthuchien;
    TextView textViewkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA=findViewById(R.id.edtA);
        editTextB=findViewById(R.id.edtB);
        editTextC=findViewById(R.id.edtC);
        buttonthuchien=findViewById(R.id.btnTH);
        textViewkq=findViewById(R.id.txtkq);




        buttonthuchien.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float soa=Float.parseFloat(editTextA.getText().toString());
                float sob=Float.parseFloat (editTextB.getText().toString());
                float soc=Float.parseFloat(editTextC.getText().toString());

                float delta= (float) (Math.pow(sob,2) - 4*soa*soc);
                float x1,x2;


                if(delta<0){
                    textViewkq.setText("Phuong trinh vo nghiem");
                }if(delta==0) {
                    float kq;
                    kq =x1=x2=(-sob)/2*soa;
                    textViewkq.setText("Phuong trinh co nghiem kep :" + "x1=x2="+kq);
                }if(delta>0){
                    float kq1,kq2;
                    kq1=x1= (int) (((-sob)+Math.sqrt(delta))/2*soa);
                    kq2=x2= (int) (((-sob)-Math.sqrt(delta))/2*soa);
                    textViewkq.setText("Phuong trinh co 2 nghiem phan biet :"+"\n" + "x1=" +kq1+"\n"+"x2="+kq2);

                }
            }
        });


    }
}
