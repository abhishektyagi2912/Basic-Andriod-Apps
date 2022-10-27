package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView2;
    EditText editText;
    int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        textView2=findViewById(R.id.textView2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){

                    case R.id.button:
                        StringBuffer buffer =new StringBuffer();
                        int a=Integer.parseInt(editText.getText().toString());
                        for (int i=1;i<=10;i++){
                            n=a*i;
                            buffer.append(a + " X " + i + " = " + n + "\n\n");
                        }
                    textView2.setText(buffer);
                        break;
                }
            }
        });
    }
}