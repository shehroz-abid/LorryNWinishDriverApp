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

    EditText loginPassword_editText, loginUserName_editText;
    Button login_btn, fb_signup_btn;
    //LoginButton fb_signup_btn;
    TextView forgetPasswordTxt, signUp_txt ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.destination_route);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();

        loginPassword_editText = (EditText)findViewById(R.id.loginPassword_editText);
        loginUserName_editText = (EditText)findViewById(R.id.loginUserName_editText);

        forgetPasswordTxt = (TextView)findViewById(R.id.forgetPasswordTxt);
        signUp_txt = (TextView)findViewById(R.id.signUp_txt);
        signUp_txt.setOnClickListener(this);

        login_btn =(Button)findViewById(R.id.login_btn);
        fb_signup_btn =(Button)findViewById(R.id.facebook_signup_btn);

        login_btn.setOnClickListener(this);
        fb_signup_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);




    }


    @Override
    public void onClick(View v) {

        if(v == login_btn){
            //registerUser();
            Intent myIntent = new Intent(DestinationRouteActivity.this, MainActivity.class);
            myIntent.putExtra("YourValueKey", "home");
            DestinationRouteActivity.this.startActivity(myIntent);

        }

        if (v == signUp_txt){

            Intent myIntent = new Intent(DestinationRouteActivity.this, MainActivity.class);
            myIntent.putExtra("YourValueKey","signup");
            DestinationRouteActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}



