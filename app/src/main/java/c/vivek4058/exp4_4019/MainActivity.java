package c.vivek4058.exp4_4019;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v13.view.DragStartHelper;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void onStart() {
        super.onStart();
        Log.i("onStart", "activity started.");
    }

    protected void onResume() {
        super.onResume();
        Log.i("onResume", "activity resume.");
    }

    protected void onPause() {
        super.onPause();
        Log.i("onPause", "activity paused.");
    }
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "activity stoped.");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "activity destroyed.");
    }
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "activity restarted.");
    }
    public void redirect(View view) {

        AlertDialog.Builder ab=new AlertDialog.Builder(this);
        ab.setIcon(R.drawable.ic_launcher_foreground);
        ab.setTitle("warning");
        ab.setMessage("Do you want to go on second activity");

        ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),"You are on next activity", Toast.LENGTH_LONG).show();
                Intent obj = new Intent(MainActivity.this, second.class);
                 startActivity(obj);
            }
        });

        ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You are on same activity", Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog ad= ab.create();
        ad.show();

    }
}