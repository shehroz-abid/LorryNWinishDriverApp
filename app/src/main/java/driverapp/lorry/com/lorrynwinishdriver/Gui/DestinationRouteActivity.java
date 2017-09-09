package driverapp.lorry.com.lorrynwinishdriver.Gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import driverapp.lorry.com.lorrynwinishdriver.R;

/**
 * Created by Shehroz on 07-Sep-17.
 */

public class DestinationRouteActivity extends Activity implements View.OnClickListener{

    Button reached_destination_btn, distance_time_btn, wait_count_btn;
    TextView client_name_txt, client_phone_txt ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.destination_route);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();


        client_name_txt = (TextView)findViewById(R.id.client_name_txt);
        client_phone_txt = (TextView)findViewById(R.id.client_phone_txt);


        reached_destination_btn =(Button)findViewById(R.id.reached_destination_btn);
        distance_time_btn =(Button)findViewById(R.id.distance_time_btn);
        wait_count_btn =(Button)findViewById(R.id.wait_count_btn);

        reached_destination_btn.setOnClickListener(this);
        wait_count_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);

    }


    @Override
    public void onClick(View v) {

        if(v == reached_destination_btn){
            //registerUser();
            Intent myIntent = new Intent(DestinationRouteActivity.this, ClientPaymentActivity.class);
            DestinationRouteActivity.this.startActivity(myIntent);

        }

        if (v == wait_count_btn){

            //Intent myIntent = new Intent(DestinationRouteActivity.this, MainActivity.class);
            //DestinationRouteActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}
