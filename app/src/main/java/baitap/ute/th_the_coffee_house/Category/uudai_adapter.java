package baitap.ute.th_the_coffee_house.Category;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

import baitap.ute.th_the_coffee_house.R;

public class uudai_adapter extends RecyclerView.Adapter<uudai_adapter.UuDaiViewHolder> {

    private List<baitap.ute.th_the_coffee_house.Category.uudai> mUuDai_126;
    public void setData(List<baitap.ute.th_the_coffee_house.Category.uudai> list){
        this.mUuDai_126 = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public UuDaiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.item_uudai, parent, false);

        return new UuDaiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UuDaiViewHolder holder, int position) {
        uudai uudai = mUuDai_126.get(position);
        if(uudai == null){
            return;
        }
        holder.imgUuDai_126.setImageResource(uudai.getResourceId());
        holder.tvUuDai_126.setText(uudai.getTitle());
//        holder.btnUuDai.setText(uudai.getTitle());
    }



    @Override
    public int getItemCount() {
        if(mUuDai_126 != null){
            return mUuDai_126.size();
        }
        return 0;
    }

    public  class UuDaiViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgUuDai_126;
        private TextView tvUuDai_126;
//        private Button btnUuDai;

        public UuDaiViewHolder(@NonNull  View itemView){
            super(itemView);

            imgUuDai_126 = itemView.findViewById(R.id.img_uudai_126);
            tvUuDai_126 = itemView.findViewById(R.id.tv_uudai_126);
//            btnUuDai = itemView.findViewById(R.id.btn_uudai);
        }
    }

}
