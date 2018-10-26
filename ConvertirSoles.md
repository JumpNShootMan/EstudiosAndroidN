```Java

package jumpnshootman.convertirmoneda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaramos variables que utilizaremos
    public EditText textField1;
    public Button btndol,btneur,btnyen,btnlib;
    View view;
    ImageView imgview;
    
    
    //Iniciamos nuestra funcion cuando un boton sea activado
    public void clickfunction(char currency){
        //Convertimos la información que escribió el usuario a un string...
        String montodinero= textField1.getText().toString();
        //Luego convertimos el string a un double para poder procesarlo de la manera correcta
        double monto = Double.parseDouble(montodinero);
        
        //Un switch dependiendo de la moneda a la que el usuario desee convertir
        switch(currency){
            case 'e':
                monto*=0.26;
                break;
            case 'd':
                monto*=0.30;
                break;
            case 'l':
                monto*=0.23;
                break;
            case 'y':
                monto*=33.51;
                break;

        }
        
        //Finalmente imprimimos en un popup el resultado
        Toast.makeText(MainActivity.this, Double.toString(monto), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cada boton asignado a uno de los 4 botones del layout
        btndol= (Button) findViewById(R.id.btndol);
        btneur= (Button) findViewById(R.id.btneur);
        btnyen= (Button) findViewById(R.id.btnyen);
        btnlib= (Button) findViewById(R.id.btnlib);
        textField1= (EditText) findViewById(R.id.textField1);
        btndol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onclick","apreto");
                //al ser el boton de dolares el char d es para validad en la funcion click
                char tipomoneda = 'd';
                clickfunction(tipomoneda);
            }
        });
        btnlib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onclick","apreto");
                char tipomoneda = 'l';
                clickfunction(tipomoneda);
            }
        });
        btnyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onclick","apreto");
                char tipomoneda = 'y';
                clickfunction(tipomoneda);
            }
        });
        btneur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onclick","apreto");
                char tipomoneda = 'e';
                clickfunction(tipomoneda);
            }
        });
    }
}

```
