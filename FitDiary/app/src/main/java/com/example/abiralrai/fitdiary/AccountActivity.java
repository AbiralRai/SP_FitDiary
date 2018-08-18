package com.example.abiralrai.fitdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.Account;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;

import java.util.Locale;

public class AccountActivity extends AppCompatActivity {

    TextView id;
    TextView infoLabel;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        id = (TextView) findViewById(R.id.id);
        infoLabel = (TextView) findViewById(R.id.info_label);
        info = (TextView) findViewById(R.id.info);



    }

    public void onLogout(View view) {
        // logout of Account Kit
        AccountKit.logOut();
        launchLoginActivity();
    }

    private void launchLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }


}
