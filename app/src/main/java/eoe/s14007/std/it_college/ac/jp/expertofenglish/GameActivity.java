package eoe.s14007.std.it_college.ac.jp.expertofenglish;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;

import org.w3c.dom.Text;

import javax.xml.transform.Result;


public class GameActivity extends AppCompatActivity {
    private String answer;
    private PopupWindow mPopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

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
        /*TextView q = (TextView)findViewById(R.id.q);
        q.setText(QuestionBank.randomQView());*/

        TextView question = (TextView)findViewById(R.id.question);

        final TextView finalAnswer = (TextView)findViewById(R.id.answer);
        final TextView btn1 = (TextView)findViewById(R.id.button1);
        final TextView btn2 = (TextView)findViewById(R.id.button2);
        final TextView btn3 = (TextView)findViewById(R.id.button3);
        final TextView btn4 = (TextView)findViewById(R.id.button4);
        final TextView[] a = {btn1,btn2,btn3,btn4};

        final String[] hoge = QuestionBank.randomQView();
        question.setText(hoge[1]);
        btn1.setText(hoge[5]);
        btn2.setText(hoge[6]);
        btn3.setText(hoge[7]);
        btn4.setText(hoge[8]);
        answer = hoge[2];

        for (int i = 0; i < 4; i++) {
            final int finalI = i;
            a[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (answer.equals(a[finalI].getText())) {
                        finalAnswer.setText("正解");
                    } else {
                        finalAnswer.setText(a[finalI].getText());

                        mPopupWindow = new PopupWindow(GameActivity.this);

                        // レイアウト設定
                        View popupView = getLayoutInflater().inflate(R.layout.activity_test, null);
                        popupView.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (mPopupWindow.isShowing()) {
                                    mPopupWindow.dismiss();
                                }
                            }
                        });
                        mPopupWindow.setContentView(popupView);

                        // タップ時に他のViewでキャッチされないための設定
                        mPopupWindow.setOutsideTouchable(true);
                        mPopupWindow.setFocusable(true);

                        // 表示サイズの設定 今回は幅300dp
                        float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 300, getResources().getDisplayMetrics());
                        mPopupWindow.setWindowLayoutMode((int) width, WindowManager.LayoutParams.WRAP_CONTENT);
                        mPopupWindow.setWidth((int) width);
                        mPopupWindow.setHeight(WindowManager.LayoutParams.WRAP_CONTENT);

                        // 画面中央に表示
                        mPopupWindow.showAtLocation(findViewById(R.id.close_button), Gravity.CENTER, 0, 0);
                    }
                }
            });
        }

        /*btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalAnswer.setText(btn2.getText());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalAnswer.setText(btn3.getText());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalAnswer.setText(btn4.getText());
            }
        });*/


    }

    // Test
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
        return true;
    }
}
