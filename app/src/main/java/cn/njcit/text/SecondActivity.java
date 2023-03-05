package cn.njcit.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvLoginResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        String userName = getIntent().getStringExtra("user_name");
        tvLoginResult.setText(userName);
    }

    private void initViews() {
        tvLoginResult = findViewById(R.id.tv_login_result);
    }
}
