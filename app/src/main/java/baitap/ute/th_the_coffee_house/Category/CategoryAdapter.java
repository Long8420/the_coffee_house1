package baitap.ute.th_the_coffee_house.Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import baitap.ute.th_the_coffee_house.R;
import baitap.ute.th_the_coffee_house.TinTuc.TinTucFragment;


public class CategoryAdapter  extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{
    private Context mContext;

    private List<Category> mListCategory;
    public CategoryAdapter(Context mContext){
        this.mContext = mContext;

    }

    public void setData(List<Category> list){
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category  = mListCategory.get(position);
        if(category == null){
            return;
        }
        holder.tvNameCategory_126 .setText(category.getNameCategory());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcvUuDai_126.setLayoutManager(linearLayoutManager);
        uudai_adapter uudai_adapter = new uudai_adapter();
        uudai_adapter.setData(category.getUudais());
        holder.rcvUuDai_126.setAdapter(uudai_adapter);

    }

    @Override
    public int getItemCount() {
        if(mListCategory != null){
            return  mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNameCategory_126;
        private RecyclerView rcvUuDai_126;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameCategory_126=itemView.findViewById( R.id.tv_name_126);
            rcvUuDai_126=itemView.findViewById(R.id.rcv_uudai_126);
        }

    }
}
