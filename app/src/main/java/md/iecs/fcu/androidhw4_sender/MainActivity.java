package md.iecs.fcu.androidhw4_sender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg=(EditText)findViewById(R.id.msg_edt);
        Button bto=(Button)findViewById(R.id.bot_send);
        bto.setOnClickListener(broadcastmsg);
    }
    private View.OnClickListener broadcastmsg=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent("hw4.msg");
            intent.putExtra("msg_data",msg.getText().toString());
            sendBroadcast(intent);
        }
    };
}
