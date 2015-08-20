package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.TextView;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.transform.Result;


public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        gameInit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void gameInit() {
        DBHelper dbHelper =new DBHelper(this);

        TextView q = (TextView)findViewById(R.id.q);
        q.setText(dbHelper.getReadableDatabase().toString());
    }

    // Test
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent i = getIntent();
        String keyword = i.getStringExtra("id");
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("id", keyword);
        startActivity(intent);
        return true;
    }
}