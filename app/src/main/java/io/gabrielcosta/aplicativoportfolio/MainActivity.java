package io.gabrielcosta.aplicativoportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    @Override
    public void onClick(View v) {
        final Button button = (Button) v;
        showAppNotification(button.getText().toString());
    }

    private void showAppNotification(final String appName) {
        Toast.makeText(this, getString(R.string.main_toats_notification_app, appName),
                Toast.LENGTH_LONG).show();
    }

    private void initButtons() {
        findViewById(R.id.button_main_popular_movies).setOnClickListener(this);
        findViewById(R.id.button_main_stock_hawk).setOnClickListener(this);
        findViewById(R.id.button_main_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.button_main_capstone).setOnClickListener(this);
        findViewById(R.id.button_main_make_your_app_material).setOnClickListener(this);
        findViewById(R.id.button_main_go_ubiquitous).setOnClickListener(this);
    }
}
