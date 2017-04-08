package com.gmbdesign.android.main;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

/**
 * Created by ggamboa on 8/4/17.
 */

public class FocusListener implements View.OnFocusChangeListener {

    private Context contexto;

    public FocusListener(Context contexto){
        this.contexto = contexto;
    }

    @Override
    public void onFocusChange(View view, boolean hasFocus) {
        if(!hasFocus){
            EditText cajaEmail = (EditText) view;
            String email = cajaEmail.getText().toString();

            Activity actividad = (Activity) contexto;
            TextInputLayout til = (TextInputLayout) actividad.findViewById(R.id.til_email);
            til.setError("Email no válido");

            if(validaEmail(email)){
                //TODO - OK, el mail es valido
                til.setErrorEnabled(false);

            } else {
                //TODO - KO, el mail no es valido
                til.setErrorEnabled(true);
            }


        }
    }

    private boolean validaEmail(String email){

        boolean valido = false;

        valido = Patterns.EMAIL_ADDRESS.matcher(email).matches();

        return valido;

    }
}
