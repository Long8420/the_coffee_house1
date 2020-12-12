package baitap.ute.th_the_coffee_house.Dathang.Tab.DoUong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import baitap.ute.th_the_coffee_house.R;

public class DoUongAdapter  extends RecyclerView.Adapter<DoUongAdapter.MyViewHolder>{

    private Context context;
    private List<ListDoUong> apps;

    public  DoUongAdapter(Context context, List<ListDoUong> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        TextView mGia;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mGia=itemView.findViewById( R.id.giagrid);
            mName = itemView.findViewById(R.id.namegrid);
            mImage = itemView.findViewById(R.id.imggrid);
        }
    }

    @NonNull
    @Override
    public DoUongAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_data_gridview,parent,false);

        return new DoUongAdapter.MyViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull DoUongAdapter.MyViewHolder holder, int position) {

        ListDoUong app = apps.get(position);

        holder.mName.setText(app.getNametu());
        holder.mImage.setImageResource(app.getImgtu());
        holder.mGia.setText(app.getGiatu());

    }

    @Override
    public int getItemCount() {
        return apps.size();
    }


}
