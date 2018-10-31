package dnr96.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View view;
    ImageView img1;
    ImageView img2;
    int c;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        Toast.makeText(MainActivity.this,"Sorpresa!",Toast.LENGTH_LONG).show();
        img2.animate().alpha(1f).setDuration(2000);

        return super.onTouchEvent(event);
    }


    public void fade(){
        img1.animate().translationX(-1000f).setDuration(1500);

        //img1.animate().alpha(0f).setDuration(2000); //ms
        //img2.setVisibility(View.INVISIBLE);
        //img2.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = (ImageView) findViewById(R.id.img1);
        img2= (ImageView) findViewById(R.id.img2);
        c=1;
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fade();
            }
        });
    }
}


// @Override
// public boolean onTouchEvent(MotionEvent event){

//     return super.onTouchEvent(event);
// }

// if(c==1) {
        /*img2.animate().alpha(1f).setDuration(2000);
          c--;
        }
        else{
            img2.animate().alpha(0f).setDuration(2000);
            c++;
        }*/
