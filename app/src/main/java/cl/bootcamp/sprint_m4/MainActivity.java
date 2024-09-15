package cl.bootcamp.sprint_m4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import cl.bootcamp.sprint_m4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAbrir.setOnClickListener(view1 -> {
            intent = new Intent(view1.getContext(), SecondActivity.class);
            view1.getContext().startActivity(intent);
        });

    }
}