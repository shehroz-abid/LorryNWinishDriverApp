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

public class OrderRequestActivity extends Activity implements View.OnClickListener{


    Button accept_trip_btn, cancel_trip_btn;
    TextView order_request_from_txt, order_request_to_txt, order_request_distance_txt, order_request_time_txt ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.orderrequestscreen);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();


        order_request_from_txt = (TextView)findViewById(R.id.order_request_from_txt);
        order_request_to_txt = (TextView)findViewById(R.id.order_request_to_txt);
        order_request_distance_txt = (TextView)findViewById(R.id.order_request_distance_txt);
        order_request_time_txt = (TextView)findViewById(R.id.order_request_time_txt);


        accept_trip_btn =(Button)findViewById(R.id.accept_trip_btn);
        cancel_trip_btn =(Button)findViewById(R.id.cancel_trip_btn);

        accept_trip_btn.setOnClickListener(this);
        cancel_trip_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);




    }


    @Override
    public void onClick(View v) {

        if(v == accept_trip_btn){
            //registerUser();
            Intent myIntent = new Intent(OrderRequestActivity.this, DestinationRouteActivity.class);
            OrderRequestActivity.this.startActivity(myIntent);

        }

        if (v == cancel_trip_btn){

            Intent myIntent = new Intent(OrderRequestActivity.this, LoginActivity.class);
            OrderRequestActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}



