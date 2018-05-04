package com.curso.android_piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Button Do, Re, Mi, Fa, Sol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Do = (Button)findViewById(R.id.Do);
        Re = (Button)findViewById(R.id.Re);
        Mi = (Button)findViewById(R.id.Mi);
        Fa = (Button)findViewById(R.id.Fa);
        Sol = (Button)findViewById(R.id.Sol);

        /*boton.setOnClickListener(new OnClickListener() {
            public void onClick(View view){
                texto.setText("Nudes");
                onClickBoton(view);
            }
        });

        boton2.setOnClickListener(new OnClickListener() {
            public void onClick(View view){

                onClickBoton(view);
            }
        });
        */
    }

    public void onClickBoton(View view) {
        MediaPlayer mp;
        switch(view.getId()){
            case R.id.Do:
                mp = MediaPlayer.create(this, R.raw.doo);
                mp.start();
                setComplete(mp);
                break;

            case R.id.Re:
                mp = MediaPlayer.create(this, R.raw.re);
                mp.start();
                setComplete(mp);
                break;

            case R.id.Mi:
                mp = MediaPlayer.create(this, R.raw.mi);
                mp.start();
                setComplete(mp);
                break;

            case R.id.Fa:
                mp = MediaPlayer.create(this, R.raw.fa);
                mp.start();
                setComplete(mp);
                break;

            case R.id.Sol:
                mp = MediaPlayer.create(this, R.raw.sol);
                mp.start();
                setComplete(mp);
                break;

            case R.id.La:
                mp = MediaPlayer.create(this, R.raw.la);
                mp.start();
                setComplete(mp);
                break;

            case R.id.Si:
                mp = MediaPlayer.create(this, R.raw.si);
                mp.start();
                setComplete(mp);
                break;
            default:
                break;
        }

    }

    public void setComplete(MediaPlayer mp){
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

}
