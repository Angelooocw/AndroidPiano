package com.curso.android_piano;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    TextView texto;
    Button Do,Re,Mi,Fa,Sol,La,Si,Dos,Res,Fas,Sols,Las;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Do = (Button)findViewById(R.id.Do);
        Re = (Button)findViewById(R.id.Re);
        Mi = (Button)findViewById(R.id.Mi);
        Fa = (Button)findViewById(R.id.Fa);
        Sol = (Button)findViewById(R.id.Sol);
        La = (Button)findViewById(R.id.La);
        Si = (Button)findViewById(R.id.Si);
        Dos = (Button) findViewById(R.id.Dos);
        Res = (Button) findViewById(R.id.Res);
        Fas = (Button) findViewById(R.id.Fas);
        Sols = (Button) findViewById(R.id.Sols);
        Las = (Button) findViewById(R.id.Las);

        Do.setOnTouchListener(this);
        Re.setOnTouchListener(this);
        Mi.setOnTouchListener(this);
        Fa.setOnTouchListener(this);
        Sol.setOnTouchListener(this);
        La.setOnTouchListener(this);
        Si.setOnTouchListener(this);
        Dos.setOnTouchListener(this);
        Res.setOnTouchListener(this);
        Fas.setOnTouchListener(this);
        Sols.setOnTouchListener(this);
        Las.setOnTouchListener(this);
    }

//Metodo para presionar botones con Motion Event

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public boolean onTouch(View view, MotionEvent event){
        MediaPlayer mp;
        int act= event.getAction();

        switch(view.getId()) {

            case R.id.Do:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.doo);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.Re:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.re);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }

            case R.id.Mi:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.mi);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.Fa:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.fa);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.Sol:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.sol);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.La:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.la);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.Si:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.Pulsacion));
                    mp = MediaPlayer.create(this, R.raw.si);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act == MotionEvent.ACTION_UP){
                    view.setBackgroundTintList(getResources().getColorStateList(R.color.tecla));
                    break;
                }
            case R.id.Dos:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundColor(Color.CYAN);
                    mp = MediaPlayer.create(this, R.raw.do_sostenido);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act== MotionEvent.ACTION_UP){
                    view.setBackgroundColor(Color.BLACK);
                }

            case R.id.Res:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundColor(Color.CYAN);
                    mp = MediaPlayer.create(this, R.raw.re_sostenido);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act== MotionEvent.ACTION_UP){
                    view.setBackgroundColor(Color.BLACK);
                }

            case R.id.Fas:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundColor(Color.CYAN);
                    mp = MediaPlayer.create(this, R.raw.fa_sostenido);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act== MotionEvent.ACTION_UP){
                    view.setBackgroundColor(Color.BLACK);
                }
            case R.id.Sols:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundColor(Color.CYAN);
                    mp = MediaPlayer.create(this, R.raw.sol_sostenido);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act== MotionEvent.ACTION_UP){
                    view.setBackgroundColor(Color.BLACK);
                }
            case R.id.Las:
                if (act == MotionEvent.ACTION_DOWN ) {
                    view.setBackgroundColor(Color.CYAN);
                    mp = MediaPlayer.create(this, R.raw.la_sostenido);
                    mp.start();
                    setComplete(mp);
                    break;
                }
                if (act== MotionEvent.ACTION_UP){
                    view.setBackgroundColor(Color.BLACK);
                }
            }
        return true;
        }
    
    public void setComplete(MediaPlayer mp){
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

}
