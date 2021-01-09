package com.example.dagger2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.dagger2java.Basics.MainViewModel;
import com.example.dagger2java.Network.NetworkClient;
import com.example.dagger2java.Network.NetworkConnection;

import static com.example.dagger2java.Basics.Constants.MY_TAG;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.connect);

        NetworkConnection connection = new NetworkConnection();
        NetworkClient client = new NetworkClient(connection);

        mMainViewModel = new MainViewModel(client);

        button.setOnClickListener(view -> {
            Log.d(MY_TAG, "onCreate: Data fetched");
            textView.setText(mMainViewModel.fetchData());
        });

    }
}
