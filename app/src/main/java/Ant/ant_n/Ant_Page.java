package Ant.ant_n;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Ant_Page extends AppCompatActivity {

    private TextView itemText;
    private TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ant__page);
        itemText = (TextView)findViewById(R.id.itemList);
        titleText = (TextView)findViewById(R.id.titleList);


        Intent intent =  getIntent();
        String itemList = intent.getStringExtra("itemList"); // recycler에서 itemList의 값 가져와서 여기서 받아줌
        String titleList = intent.getStringExtra("titleList"); // recycler에서 titleList의 값 가져와서 여기서 받아줌
        titleText.setText(titleList);   // textview에 출력
        itemText.setText(itemList);
    }
}
