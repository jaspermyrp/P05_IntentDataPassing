package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tvOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvOut = findViewById(R.id.textView);

        Intent getIntent = getIntent();
        int value = getIntent.getIntExtra("value", 0);
        tvOut.setText("Integer Value Received: " + value);
    }
}
