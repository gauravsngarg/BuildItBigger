package gauravsngarg.com.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import gauravsngarg.com.javajokes.Joker;

public class MainActivity extends AppCompatActivity {

    Button btShowJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btShowJoke = (Button) findViewById(R.id.btnShowJoke);

        final Joker joker = new Joker();
        btShowJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, joker.getJoke(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
