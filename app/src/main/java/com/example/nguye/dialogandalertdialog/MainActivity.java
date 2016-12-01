package com.example.nguye.dialogandalertdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btDialog;
    private Button btAlertDialog;
    Dialog dialog;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btDialog = (Button) findViewById(R.id.btDialog);
        btDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickDialog();
        }

        });
        btAlertDialog = (Button) findViewById(R.id.btAlertDialog);
        btAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickAlertdialog();
            }
        });
    }

    public void clickAlertdialog (){

           AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("NguyenNguyen.doler");
            builder.setCancelable(false);
            builder.setMessage("Bạn có muốn đăng xuất không");

        builder.setNegativeButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Ứ chịu ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alertdialog = builder.create();
        alertdialog.show();
    }

    public void clickDialog(){
        dialog = new Dialog(MainActivity.this);
        dialog.setTitle("NguyenNguyen.doler");
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_layout);
        Button btDangxuat = (Button) dialog.findViewById(R.id.btDangxuat);
        Button btUchiu = (Button) dialog.findViewById(R.id.btUchiu);

        btDangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        btUchiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


}
