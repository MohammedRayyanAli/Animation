package animation.learncoding.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageView;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }
    public void zoom(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
       image.startAnimation(animation);
    }
    public void clockwise(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation1=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        image.startAnimation(animation1);
    }
    public void blink(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation2=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        image.startAnimation(animation2);
    }
    public void fade(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation3=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        image.startAnimation(animation3);
    }
    public void move(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation4=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        image.startAnimation(animation4);
    }
    public void slide(View view){

        ImageView image = (ImageView)findViewById(R.id.imageView);

        Animation animation5=  AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        image.startAnimation(animation5);
    }
}
