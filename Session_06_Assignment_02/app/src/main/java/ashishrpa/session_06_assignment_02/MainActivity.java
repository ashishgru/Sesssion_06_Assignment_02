package ashishrpa.session_06_assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.menuClickedTextview);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }
    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about: {
                Toast.makeText(MainActivity.this, "About icon Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "About icon Selected");
                textView.setText("About icon Selected");
                return true;
            }
            case R.id.help: {
                Toast.makeText(MainActivity.this, "Help icon Selected", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "Help icon Selected");
                textView.setText("Help icon Selected");
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
