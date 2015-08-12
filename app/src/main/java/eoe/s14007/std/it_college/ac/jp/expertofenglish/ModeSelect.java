package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ModeSelect extends AppCompatActivity
    implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_select);

        gameStart();
        titleBack();
        showScores();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mode_select, menu);
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



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnWordMode:
                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btnNetSlangMode:
                Intent intent1 = new Intent(this, GameActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.btnDailyTalkMode:
                Intent intent2 = new Intent(this, GameActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.btnBusinessMode:
                Intent intent3 = new Intent(this, GameActivity.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.btnBack:
                Intent intent4 = new Intent(this, MainActivity.class);
                startActivity(intent4);
                finish();
                break;
            case R.id.btnScoreShow:
                Intent intent5 = new Intent(this, ScoreActivity.class);
                startActivity(intent5);
                finish();
                break;

        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode != KeyEvent.KEYCODE_BACK){
            return super.onKeyDown(keyCode, event);
        }else{
            return false;
        }
    }

    public  void gameStart() {
        Button btnWordMode = (Button)findViewById(R.id.btnWordMode);
        btnWordMode.setOnClickListener(this);

        Button btnDailyTalkMode = (Button)findViewById(R.id.btnDailyTalkMode);
        btnDailyTalkMode.setOnClickListener(this);

        Button btnNetSlangMode = (Button)findViewById(R.id.btnNetSlangMode);
        btnNetSlangMode.setOnClickListener(this);

        Button btnBusinessMode = (Button)findViewById(R.id.btnBusinessMode);
        btnBusinessMode.setOnClickListener(this);

        Button btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        Button btnScoreShow = (Button)findViewById(R.id.btnScoreShow);
        btnScoreShow.setOnClickListener(this);
    }

    public void titleBack() {
        Button btnBack = (Button)findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }

    public void showScores() {
        Button btnScoreShow = (Button)findViewById(R.id.btnScoreShow);
        btnScoreShow.setOnClickListener(this);
    }
}
