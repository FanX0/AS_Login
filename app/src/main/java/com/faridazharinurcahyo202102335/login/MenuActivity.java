package com.faridazharinurcahyo202102335.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import cz.msebera.android.httpclient.Header;

public class MenuActivity extends AppCompatActivity {
    private Button _tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilMahasiswaButton();

    }





    private void initTampilMahasiswaButton() {
        _tampilMahasiswaButton = findViewById(R.id.inputMahasiswa);

        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);

            }
        });

    }

}

