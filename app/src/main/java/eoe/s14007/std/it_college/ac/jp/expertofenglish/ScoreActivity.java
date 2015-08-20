package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_score, menu);
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

    public void showScores() {
        TextView labelTotalAverage = (TextView)findViewById(R.id.labelTotalAverage);
        TextView labelWordModeAve = (TextView)findViewById(R.id.labelWordModeAve);
        TextView labelWordModeMaxScore = (TextView)findViewById(R.id.labelWordModeMaxScore);
        TextView labelDailyModeAve = (TextView)findViewById(R.id.labelDailyModeAve);
        TextView labelDailyModeMaxScore = (TextView)findViewById(R.id.labelDailyModeMaxScore);
        TextView labelSlangModeAve = (TextView)findViewById(R.id.labelSlangModeAve);
        TextView labelSlangModeMaxScore = (TextView)findViewById(R.id.labelSlangModeMaxScore);
        TextView labelBusinessModeAve = (TextView)findViewById(R.id.labelBusinessModeAve);
        TextView labelBusinessModeMaxScore = (TextView)findViewById(R.id.labelBusinessModeMaxScore);
    }

}
