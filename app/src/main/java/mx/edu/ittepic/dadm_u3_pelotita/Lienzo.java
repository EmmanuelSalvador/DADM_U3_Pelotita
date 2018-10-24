package mx.edu.ittepic.dadm_u3_pelotita;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Pelota pe1,pe2,pe3,pe4,pe5,pe6,pe7,pe8,pe9,pe10,pe11,pe12;
    public Lienzo(Context context){
        super(context);
        pe1 = new Pelota(200,500,this,Color.GRAY,60);
        pe2 = new Pelota(60,40,this,Color.GREEN,10);
        pe3 = new Pelota(800,1000,this,Color.RED,100);
        pe4 = new Pelota(1000,1000,this,Color.BLACK,500);
        pe5 = new Pelota(300,300,this,Color.GRAY,25);
        pe6 = new Pelota(400,400,this,Color.GREEN,190);
        pe7 = new Pelota(500,500,this,Color.RED,62);
        pe8 = new Pelota(600,600,this,Color.MAGENTA,230);
        pe9 = new Pelota(700,700,this,Color.GRAY,25);
        pe10 = new Pelota(900,900,this,Color.GREEN,90);
        pe11= new Pelota(1200,1200,this,Color.RED,18);
        pe12 = new Pelota(1000,1000,this,Color.MAGENTA,60);
        pe1.mover(50, 15);
        pe2.mover(80, 60);
        pe3.mover(5,5);
        pe4.mover(1,1);
        pe5.mover(50, 30);
        pe6.mover(43, 40);
        pe7.mover(99,20);
        pe8.mover(13,10);
        pe9.mover(80, 80);
        pe10.mover(40, 55);
        pe11.mover(62,31);
        pe12.mover(10,6);
    }
    public void onDraw(Canvas c){
        super.onDraw(c);
        Paint p = new Paint();
        pe4.pintar(p,c);
        pe1.pintar(p,c);
        pe2.pintar(p,c);
        pe3.pintar(p,c);
        pe5.pintar(p,c);
        pe6.pintar(p,c);
        pe7.pintar(p,c);
        pe8.pintar(p,c);
        pe9.pintar(p,c);
        pe10.pintar(p,c);
        pe11.pintar(p,c);
        pe12.pintar(p,c);

    }
}
