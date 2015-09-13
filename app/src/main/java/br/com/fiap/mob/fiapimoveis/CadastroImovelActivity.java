package br.com.fiap.mob.fiapimoveis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.mob.fiapimoveis.model.TamanhoImovel;
import br.com.fiap.mob.fiapimoveis.model.TipoImovel;
import br.com.fiap.mob.fiapimoveis.util.Constants;

public class CadastroImovelActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private ImageView ivImovel;
    private String pathImage;
    private File photoFile;
    private String nomeFoto;
    private EditText etNomeContato;
    private EditText etTelefone;
    private Spinner spTipo;
    private Spinner spTmanho;
    private CheckBox cbEmConstrucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_imovel);
        ivImovel = (ImageView) findViewById(R.id.ivMovel);
        etNomeContato = (EditText) findViewById(R.id.etNomeContato);
        etTelefone = (EditText) findViewById(R.id.etTelefoneContato);
        spTipo = (Spinner) findViewById(R.id.spTipo);
        spTmanho = (Spinner) findViewById(R.id.spTamanho);
        cbEmConstrucao = (CheckBox) findViewById(R.id.cbEmConstrucao);



        ArrayAdapter<TipoImovel> adapter = new ArrayAdapter<TipoImovel>(this,
                android.R.layout.simple_spinner_item, TipoImovel.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTipo.setAdapter(adapter);

        ArrayAdapter<TamanhoImovel> adapterTamanho = new ArrayAdapter<TamanhoImovel>(this,
                android.R.layout.simple_spinner_item, TamanhoImovel.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spTmanho.setAdapter(adapterTamanho);

    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {

            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            if (photoFile != null) {
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile));
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {

            galleryAddPic();

            File image = new File(Constants.DIRETORIO_FOTOS,nomeFoto);

            Picasso.with(ivImovel.getContext()).load(image).fit().centerInside().into(ivImovel);

        }
        else{
            finish();
        }
    }

    private File createImageFile() throws IOException {

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        nomeFoto = "JPEG_" + timeStamp + "_"+".jpg";

        File storageDir = Constants.DIRETORIO_FOTOS;

        if(!storageDir.exists()){
            storageDir.mkdir();
        }

        File image = new File(storageDir,nomeFoto);

        pathImage = image.getAbsolutePath();

        return image;
    }


    private void galleryAddPic() {
        Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        File f = new File(pathImage);
        Uri contentUri = Uri.fromFile(f);
        mediaScanIntent.setData(contentUri);
        this.sendBroadcast(mediaScanIntent);
    }

    public void salvarImovel(View view){
        //TODO salvar Imovel
    }

    public void obterNovaFotoParaImovel(View view){
        //TODO
        dispatchTakePictureIntent();
    }

}
