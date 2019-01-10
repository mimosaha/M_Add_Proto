package portal.remote.superpeer.remote.com.m_add_proto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TeleMeshChat.ProtoChat build = TeleMeshChat.ProtoChat.newBuilder().build();
    }
}
