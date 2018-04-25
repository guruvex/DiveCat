package example.android.divecats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView infoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoText = findViewById(R.id.two);
    }

    /** show open times in the main text view */
    public void showTime(View view) {
        String screenTextPart1 = getResources().getString(R.string.openDaysOne);
        String screenTextPart2 = getResources().getString(R.string.openDaysTwo);
        String screenTextPart3 = getResources().getString(R.string.openDaysThree);

        String screenText = screenTextPart1 + "\n" + screenTextPart2 + "\n" +  screenTextPart3;
        infoText.setText(screenText);
    }
    /** show web site info in the main text view */
    public void showWeb(View view) {
        String screenTextPart1 = getResources().getString(R.string.webSite);
        String screenTextPart2 = getResources().getString(R.string.webSite1);
        String screenText = screenTextPart1 + "\n" + screenTextPart2;
        infoText.setText(screenText);
    }
    /** show phone number in the main text view */
    public void showPhone(View view) {
        String screenTextPart1 = getResources().getString(R.string.phone);
        String screenTextPart2 = getResources().getString(R.string.phone1);
        String screenText = screenTextPart1 + "\n" + screenTextPart2;
        infoText.setText(screenText);
    }
    /** show address in the main text view */
    public void showAddress(View view) {
        String screenTextPart1 = getResources().getString(R.string.address);
        String screenTextPart2 = getResources().getString(R.string.address1);
        String screenText = screenTextPart1 + "\n" + screenTextPart2;
        infoText.setText(screenText);
    }
}
