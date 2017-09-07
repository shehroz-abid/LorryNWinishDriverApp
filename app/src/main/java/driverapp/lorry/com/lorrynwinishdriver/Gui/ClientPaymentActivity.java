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

public class ClientPaymentActivity extends Activity implements View.OnClickListener{


    Button client_payment_btn;
    TextView client_payment_txt, client_visa_payment_txt ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.clientpayment);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();

        client_payment_txt = (TextView)findViewById(R.id.client_payment_txt);
        client_visa_payment_txt = (TextView)findViewById(R.id.client_visa_payment_txt);

        client_payment_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);




    }


    @Override
    public void onClick(View v) {

        if(v == client_payment_btn){
            //registerUser();
            Intent myIntent = new Intent(ClientPaymentActivity.this, MainActivity.class);
            myIntent.putExtra("YourValueKey", "home");
            ClientPaymentActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}

