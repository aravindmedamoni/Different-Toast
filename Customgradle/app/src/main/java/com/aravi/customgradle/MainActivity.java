package com.aravi.customgradle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.aravi.customgradle.R;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()){
            case R.id.errorbutton:
                Toasty.error(this,"hey you are not logged in try again",Toast.LENGTH_SHORT).show();
                break;
            case R.id.successbutton:
                Toasty.success(this,"Login success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.infobutton:
                Toasty.info(this,"your information is here",Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningbutton:
                Toasty.warning(this,"oopsss",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imagebutton:
                Toasty.normal(this,"project is done",Toast.LENGTH_SHORT,ContextCompat.getDrawable(this,R.drawable.ic_cloud)).show();
                break;
        }
    }
}
