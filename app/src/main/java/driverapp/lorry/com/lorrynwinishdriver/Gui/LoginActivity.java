package driverapp.lorry.com.lorrynwinishdriver.Gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;

import driverapp.lorry.com.lorrynwinishdriver.R;

/**
 * Created by Shehroz on 07-Sep-17.
 */

public class LoginActivity extends Activity implements View.OnClickListener{

    EditText loginPassword_editText, loginUserName_editText;
    Button login_btn, fb_signup_btn;
    //LoginButton fb_signup_btn;
    TextView forgetPasswordTxt, signUp_txt ;
    ProgressBar progressbar;
    CallbackManager callbackManager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this.getApplicationContext());

        setContentView(R.layout.loginscreen);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();

        progressbar= new ProgressBar(this);
        callbackManager = CallbackManager.Factory.create();

        loginPassword_editText = (EditText)findViewById(R.id.loginPassword_editText);
        loginUserName_editText = (EditText)findViewById(R.id.loginUserName_editText);

        forgetPasswordTxt = (TextView)findViewById(R.id.forgetPasswordTxt);
        signUp_txt = (TextView)findViewById(R.id.signUp_txt);
        signUp_txt.setOnClickListener(this);

        login_btn =(Button)findViewById(R.id.login_btn);
        fb_signup_btn =(Button)findViewById(R.id.facebook_signup_btn);

        /*fb_signup_btn.registerCallback(callbackManager, new FacebookCallback<LoginResult>()
        {
            @Override
            public void onSuccess(LoginResult loginResult)
            {
                System.out.println("onSuccess");
            }

            @Override
            public void onCancel()
            {
                System.out.println("onCancel");
            }

            @Override
            public void onError(FacebookException exception)
            {
                Log.v("LoginActivity", exception.getCause().toString());
            }
        });*/
        login_btn.setOnClickListener(this);
        fb_signup_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);




    }
    private void registerUser(){
        String email = loginUserName_editText.getText().toString().trim();
        String password = loginPassword_editText.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            // Email is Empty
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            // Password is Empty
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
            return;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onClick(View v) {

        if(v == login_btn){
            //registerUser();
            Intent myIntent = new Intent(LoginActivity.this, GoPayActivity.class);
            myIntent.putExtra("YourValueKey", "home");
            LoginActivity.this.startActivity(myIntent);

        }

        if (v == signUp_txt){

            Intent myIntent = new Intent(LoginActivity.this, OrderRequestActivity.class);
            myIntent.putExtra("YourValueKey","signup");
            LoginActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}

