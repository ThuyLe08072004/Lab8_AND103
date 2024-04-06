package fpoly.thuyltph35992.lab8.View;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.GridLayoutManager;



import java.util.ArrayList;

import fpoly.thuyltph35992.lab8.Adapter.product_Adapter;
import fpoly.thuyltph35992.lab8.Models.Product;
import fpoly.thuyltph35992.lab8.R;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Product> list = new ArrayList<>();
    private product_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list.add(new Product("1", "fruit", "Apple", "Fresh and juicy apple", 4.5, 2.99, R.drawable.apple));
        list.add(new Product("2", "fruit", "Banana", "Ripe banana", 4.2, 1.99, R.drawable.bana));
        list.add(new Product("3", "fruit", "Orange", "Sweet and tangy orange", 4.0, 3.49, R.drawable.oranges));
        list.add(new Product("4", "fruit", "Grape", "Delicious grapes", 4.3, 4.99, R.drawable.grapes));
        adapter = new product_Adapter(list, this);
        binding.rcvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        binding.rcvProduct.setAdapter(adapter);

    }
}