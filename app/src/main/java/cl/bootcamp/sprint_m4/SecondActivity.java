package cl.bootcamp.sprint_m4;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import cl.bootcamp.sprint_m4.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.webView.setWebViewClient(new WebViewClient());
        binding.webView.getSettings().setJavaScriptEnabled(true);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.videoFragmentContainer, new VideoFragment())
                    .commit();
        }

        binding.btnLoadWeb.setOnClickListener(v -> {
            binding.webView.setVisibility(View.VISIBLE);
            binding.webView.loadUrl("https://www.sekirothegame.com");
        });

        binding.btnvolver.setOnClickListener(v -> finish());
    }
}