package cn.njcit.text;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //uI控件
    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;
    private TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListeners();
    }
    //初始化UI控件
    private void initViews() {
        etUserName=findViewById(R.id.et_username);
        etPassword=findViewById(R.id.et_password);
        btnLogin=findViewById(R.id.btn_login);
        tvResult=findViewById(R.id.tv_result);
    }
    //初始化事件监听
    private void initListeners(){
        btnLogin.setOnClickListener(this::onClick);
    }
    @Override
    public void onClick(View view) {
        switch ( view.getId()){
            case R.id.btn_login:
                //1.获取用户输入的值
                String userName = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                //2.对用户输入值进行校验
                if (userName.equals("zhangsan")&&password.equals("123456")) {
                    // tvResult.setText("登陆成功" + userName);
                    //完成activity的转换
                    Intent intent = new Intent( MainActivity.this,SecondActivity.class);
                    intent.putExtra("user_name",userName);
                    startActivity(intent);

                }else {
                    tvResult.setText("登陆失败，用户名或密码输入错误");
                }
        }

    }
}
