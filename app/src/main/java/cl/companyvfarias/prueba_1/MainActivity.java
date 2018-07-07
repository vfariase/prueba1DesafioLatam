package cl.companyvfarias.prueba_1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.print("onCreate"+savedInstanceState);
        super.onCreate(savedInstanceState);
        Log.d("TAG1", "onCreate: ");
        System.out.print("onCreate");
        setContentView(R.layout.activity_main);
        final String password = "admin";
        final String user = "admin";


        //Creación de la instancia boton, donde se asocia a button
        // existente en xml MainActivity.xml
        Button btnLogin=(Button) findViewById(R.id.loginBtn);
        final AutoCompleteTextView userTv= findViewById(R.id.userTv);
        final AutoCompleteTextView passwordTv=findViewById(R.id.passwordTv);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String userInput=String.valueOf(userTv.getText().toString());
                String passwordInput=passwordTv.getText().toString();


                  if(user.equals(userInput) && (passwordInput.equals(password)))
                    {
                      forward();
                    }
                    else Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
           }
        });
    }


         private void forward(){
             Intent intent;
             intent= new Intent(getBaseContext(),DestinyActivity.class);
             startActivity(intent);
         }
}
