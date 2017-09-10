package driverapp.lorry.com.lorrynwinishdriver.Gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import driverapp.lorry.com.lorrynwinishdriver.R;

/**
 * Created by Shehroz on 07-Sep-17.
 */

public class SplashScreen extends Activity implements View.OnClickListener{

    // Splash screen timer
    Button get_start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        get_start_btn= (Button)findViewById(R.id.get_start_btn);
        get_start_btn.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        if(v == get_start_btn){
            //registerUser();
            Intent myIntent = new Intent(SplashScreen.this, LoginActivity.class);
            SplashScreen.this.startActivity(myIntent);

        }

        // implements your things
    }

}
