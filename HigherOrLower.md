Hice un trabajo de lógica en AndroidStudio para probar cómo se puede validar en la misma aplicación, explicándole al usuario
lo que debería hacer o no y dándole 'tips'
Esto es asumiendo que el botón tiene de ID: btn1 y que el Plain Text tiene ID: textField1 en el layout

```Java

package jumpnshootman.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public EditText textfield1;
    public Button btn1;
    int numero;
    public void clickfunction(){

        if((Integer.valueOf(textfield1.getText().toString()) < 21 ) && (Integer.valueOf(textfield1.getText().toString())>0))
        {
            if (Integer.valueOf(textfield1.getText().toString()) == numero) {
                Toast.makeText(MainActivity.this, "Lo conseguiste!", Toast.LENGTH_LONG).show();
            } else if (Integer.valueOf(textfield1.getText().toString()) > numero) {
                Toast.makeText(MainActivity.this, "El numero es mas bajo!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "El numero es mas alto!", Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(MainActivity.this,"Numero entre 1 a 20...",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = (int) (Math.random() * 20) + 1; //(int) porque el tipo de dato generado debe ser entero.
        textfield1=(EditText) findViewById(R.id.textField1);
        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickfunction();
            }
        });

    }
}


```
