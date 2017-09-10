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

public class GoPayActivity extends Activity implements View.OnClickListener{

    Button gopay_btn, gopay_sumbit_btn;
    TextView gopay_txt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gopayscreen);


        //((MainActivity)getActivity()).setTopBarTitle("Add Education");
        //((MainActivity) getActivity()).hideActionBarSearchEditButton();


        gopay_txt = (TextView)findViewById(R.id.gopay_txt);

        gopay_btn =(Button)findViewById(R.id.gopay_btn);
        gopay_sumbit_btn =(Button)findViewById(R.id.gopay_sumbit_btn);

        gopay_btn.setOnClickListener(this);
        gopay_sumbit_btn.setOnClickListener(this);
        //Typeface typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), "fonts/MindBlue_regular_demo.otf");
        //login_btn.setTypeface(typeface);


    }


    @Override
    public void onClick(View v) {

        if(v == gopay_btn){
            //registerUser();
            Intent myIntent = new Intent(GoPayActivity.this, HistoryActivity.class);
            GoPayActivity.this.startActivity(myIntent);

        }

        if (v == gopay_sumbit_btn){

            Intent myIntent = new Intent(GoPayActivity.this, MainActivity.class);
            GoPayActivity.this.startActivity(myIntent);

        }
        // implements your things
    }
}


