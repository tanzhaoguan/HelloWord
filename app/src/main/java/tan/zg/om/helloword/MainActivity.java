package tan.zg.om.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //TODO 刚开始，在TODO创建点击即可来到此代码出
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //按钮的点击事件命名为showInfo，获取用户输入的账号密码java代码
    public void showInfo(View view){
        //账号命名为Textname
        EditText Textname = (EditText)this.findViewById(R.id.Textname);
        //密码命名为Textp
        EditText Textp = (EditText)this.findViewById(R.id.Textp);

        //转换为String接收
        String name = Textname.getText().toString();
        String p = Textp.getText().toString();
        String s = "\n"+"您输入的账号为："+name+"\n"+"密码为："+p;

        //使用Toast 输出到本页面上
        Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
        if(name.equals("123") && p.equals("123")) {
            Toast.makeText(MainActivity.this, "密码正确", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_LONG).show();
        }

    }
}
