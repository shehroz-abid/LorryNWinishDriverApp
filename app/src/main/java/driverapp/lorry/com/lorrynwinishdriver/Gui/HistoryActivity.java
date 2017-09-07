package driverapp.lorry.com.lorrynwinishdriver.Gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import driverapp.lorry.com.lorrynwinishdriver.R;

/**
 * Created by Shehroz on 07-Sep-17.
 */

public class HistoryActivity extends Activity implements View.OnClickListener{

    Switch history_switch;
    Button history_more_btn;
    TextView history_total_online_txt, history_last_trip_txt, history_total_trips_today_txt, history_total_trip_month_txt ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.history);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();

        history_total_online_txt = (TextView)findViewById(R.id.history_total_online_txt);
        history_last_trip_txt = (TextView)findViewById(R.id.history_last_trip_txt);
        history_total_trips_today_txt = (TextView)findViewById(R.id.history_total_trips_today_txt);
        history_total_trip_month_txt = (TextView)findViewById(R.id.history_total_trip_month_txt);


        history_more_btn =(Button)findViewById(R.id.history_more_btn);


        history_more_btn.setOnClickListener(this);

        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);


    }


    @Override
    public void onClick(View v) {

        if(v == history_more_btn){
            //registerUser();
            Intent myIntent = new Intent(HistoryActivity.this, MainActivity.class);
            myIntent.putExtra("YourValueKey", "home");
            HistoryActivity.this.startActivity(myIntent);

        }

        // implements your things
    }
}



