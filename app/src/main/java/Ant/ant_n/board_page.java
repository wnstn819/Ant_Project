package Ant.ant_n;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class board_page extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_page);


        recyclerView=findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true); // recyclerview 안 아이템들의 크기를 가변적으로 할지 일정한 고정값으로 할지 , false하면 성능 저하 발생
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter());
    }
}
