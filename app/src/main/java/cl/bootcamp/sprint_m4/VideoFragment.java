package cl.bootcamp.sprint_m4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cl.bootcamp.sprint_m4.databinding.ActivitySecondBinding;
import cl.bootcamp.sprint_m4.databinding.FragmentVideoBinding;


public class VideoFragment extends Fragment {

    FragmentVideoBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentVideoBinding.inflate(inflater, container, false);

        binding.video.getSettings().setJavaScriptEnabled(true);

        binding.video.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView web, WebResourceRequest request) {
                return false;
            }
        });

        String videoId = "rXMX4YJ7Lks"; // Cambia esto por el ID del video que quieras
        String youtubeUrl = "https://www.youtube.com/embed/" + videoId + "?autoplay=0&controls=0&showinfo=0";


        binding.video.loadUrl(youtubeUrl);

        return binding.getRoot();

    }
}