package Ant.ant_n;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ant_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ant__page);
        TextView tv;
        tv = (TextView)findViewById(R.id.hi);


        Intent intent =  getIntent();
        String text = intent.getStringExtra("TEXT");
        tv.setText(text);
    }
}
