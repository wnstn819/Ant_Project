package Ant.ant_n;


import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<String> itemList=new ArrayList<>();
    private List<String> titleList=new ArrayList<>();

    public RecyclerAdapter(){

        itemList.clear();
        titleList.clear();
        for(int i=100;i<200;i++){
            itemList.add(i+"번째 요약글 "+ i+"번째 요약글 "+ i+"번째 요약글 "+i+"번째 요약글 ");
            titleList.add(i+"번째 게시글 입니다.");
        }
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView item;
        private TextView item_title;
        public ViewHolder(View itemView) {
            super(itemView);
            item = (TextView) itemView.findViewById(R.id.item);
            item_title = (TextView) itemView.findViewById(R.id.item_Title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 Log.d("Recyclerview", "position = " + getAdapterPosition());
                 int pos = getAdapterPosition();
                 //Intent intent = new Intent(,Ant_Page.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                 //intent.putExtra("TEXT",itemList.get(pos));
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Log.d("RecyclerView","postion = " + getAdapterPosition());
                    return false;
                }
            });

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_recycler_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        ViewHolder holder=(ViewHolder)viewHolder;

        //holder2.item.setText(titleList.get(i));
        holder.item.setText(itemList.get(i));
        holder.item_title.setText(titleList.get(i));
    }


    @Override
    public int getItemCount() {
        return itemList.size();
    }
}