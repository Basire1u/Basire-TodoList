package fr.basire.todoliste;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by basire1u on 19/02/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TodoHolder> {

    private ArrayList<TodoItem> items;

    public RecyclerAdapter(ArrayList<TodoItem> items){
        this.items = items;
    }



    public static class TodoHolder extends RecyclerView.ViewHolder{

        private Resources resources;
        private ImageView image;
        private Switch sw;
        private TextView label;
        private TodoItem item;

        public TodoHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.imageView);
            sw = (Switch) itemView.findViewById(R.id.check);
            label = (TextView) itemView.findViewById(R.id.label);
            resources = itemView.getResources();
        }

        public void bindTodo(TodoItem todo) {
            label.setText(todo.getLabel());
            sw.setChecked(todo.getRealiser());
            switch(todo.getTag()){
                case Faible:
                    image.setBackgroundColor(resources.getColor(R.color.faible));
                    break;
                case Normal:
                    image.setBackgroundColor(resources.getColor(R.color.normal));
                    break;
                case Important:
                    image.setBackgroundColor(resources.getColor(R.color.important));
                    break;
            }
        }
    }




    @Override
    public RecyclerAdapter.TodoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new TodoHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.TodoHolder holder, int position) {
        TodoItem item = items.get(position);
        holder.bindTodo(item);
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }
}
