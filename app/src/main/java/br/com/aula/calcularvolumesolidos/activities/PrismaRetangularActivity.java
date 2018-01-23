package br.com.aula.calcularvolumesolidos.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import br.com.aula.calcularvolumesolidos.R;
import br.com.aula.calcularvolumesolidos.solidos.PrismaRetangular;

public class PrismaRetangularActivity extends AppCompatActivity {

    private EditText txtBase;
    private EditText txtAlturaBase;
    private EditText txtAlturaPrisma;
    private TextView txtResultado;
    private PrismaRetangular prismaRetangular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma_retangular);
        this.txtBase = (EditText)findViewById(R.id.txtBase);
        this.txtAlturaBase = (EditText)findViewById(R.id.txtAlturaBase);
        this.txtAlturaPrisma = (EditText)findViewById(R.id.txtAlturaPrisma);
        this.txtResultado = (TextView)findViewById(R.id.txtResultado);
        this.prismaRetangular = new PrismaRetangular();

    }

    public void calcularVolume(View view){
        this.prismaRetangular.setBase(Double.parseDouble(this.txtBase.getText().toString()));
        this.prismaRetangular.setAlturaBase(Double.parseDouble(this.txtAlturaBase.getText().toString()));
        this.prismaRetangular.setAlturaPrisma(Double.parseDouble(this.txtAlturaPrisma.getText().toString()));
        this.txtResultado.setText(String.valueOf(this.prismaRetangular.calcularVolume()));
    }

}
