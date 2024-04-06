package fpoly.thuyltph35992.lab8.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import fpoly.thuyltph35992.lab8.Models.Product;
import fpoly.thuyltph35992.lab8.R;
import fpoly.thuyltph35992.lab8.View.LocationActivity;

public class product_Adapter extends RecyclerView.Adapter<product_Adapter.MyViewHolder> {
    private ArrayList<Product> list;
    private Context context;

    public product_Adapter(ArrayList<Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product dt = list.get(position);

        String productID = dt.getProductId();

        holder.tv_evaluate.setText(String.valueOf(dt.getRate()));
        holder.tv_nameProduct.setText(dt.getProductName());

        Locale vietnamLocale = new Locale("vi", "VN");
        NumberFormat vietnamFormat = NumberFormat.getCurrencyInstance(vietnamLocale);
        String priceFormatted = vietnamFormat.format(dt.getPrice());
        holder.tv_priceProduct.setText(priceFormatted);

        Glide.with(context)
                .load(dt.getImage())
                .into(holder.img_productItem);

        holder.tv_name_productType.setText(dt.getProductTypeId());

        holder.addToCart.setOnClickListener(v -> {
            Intent intent = new Intent(context, LocationActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("productId", dt.getProductId());
            bundle.putString("productTypeId", dt.getProductTypeId());
            bundle.putString("productName", dt.getProductName());
            bundle.putString("description", dt.getDescription());
            bundle.putDouble("rate", dt.getRate());
            bundle.putDouble("price", dt.getPrice());
            bundle.putInt("image", dt.getImage());
            intent.putExtras(bundle);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_evaluate, tv_nameProduct, tv_priceProduct, tv_name_productType;
        CardView addToCart;
        ImageView img_productItem;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_evaluate = itemView.findViewById(R.id.tv_evaluate);
            tv_nameProduct = itemView.findViewById(R.id.tv_nameProduct);
            addToCart = itemView.findViewById(R.id.addToCart);
            tv_priceProduct = itemView.findViewById(R.id.tv_priceProduct);
            img_productItem = itemView.findViewById(R.id.img_productItem);
            tv_name_productType = itemView.findViewById(R.id.tv_name_productType);
        }
    }
}
