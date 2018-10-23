package kr.co.woobi.imyeon.myoption;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button;
    int currentAngle=0;
    float currentSize=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseLayout=(LinearLayout)findViewById(R.id.baseLayout);
        button=(Button)findViewById(R.id.button);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.parseColor("#ff3366"));
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.parseColor("#339966"));
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.parseColor("#ffcc00"));
                return true;
            case R.id.subRotate:
                currentAngle=currentAngle+45;
                button.setRotation(currentAngle);
                return true;
            case R.id.subSize:
                currentSize=currentSize+1.5f;
                button.setScaleX(currentSize);
                button.setScaleY(currentSize);
                return true;
            case R.id.subSizereturn:
                button.setScaleX(1);
                button.setScaleY(1);
                currentAngle=0;
                button.setRotation(0);
                return true;
        }
        return false;
    }
}
