package fr.basire.todoliste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by basire1u on 12/02/18.
 */

public class ProductListAdapter extends BaseAdapter{
    private LayoutInflater inflat;
    private ArrayList<Product> prods;

    public ProductListAdapter(Context context, ArrayList<Product> list) {
        inflat = LayoutInflater.from(context);
        this.prods = list;
    }

    public int getCount(){
        return prods.size();
    }

    public Object getItem(int position){
        return prods.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;

        if (convertView == null) {

            convertView = inflat.inflate(R.layout.row, null);
            holder = new ViewHolder();
            holder.categ = (TextView) convertView.findViewById(R.id.itemcateg);
            holder.name = (TextView) convertView.findViewById(R.id.itemname);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product p = (Product) getItem(position);
        holder.categ.setText(p.getCategory());
        holder.name.setText(p.getTitle());

        return convertView;
    }

    private class ViewHolder {
        private TextView categ;
        private TextView name;
    }
}
