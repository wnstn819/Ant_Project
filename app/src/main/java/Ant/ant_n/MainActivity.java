package Ant.ant_n;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button test_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test_btn = (Button)findViewById(R.id.test_btn);

        test_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void  onClick(View view) {
                Toast.makeText(getApplication(),"클릭",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),board_page.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }
        });

    }
}