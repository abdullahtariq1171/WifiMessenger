package com.example.abdullah.wifimessenger;


import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class Editprofile extends AppCompatActivity {

    ImageView phototaker;
    Button btn_photo_taker;
    private static final int CAM_REQUEST=1313;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        btn_photo_taker=(Button) findViewById(R.id.button);
        phototaker=(ImageView) findViewById(R.id.imageView);
        btn_photo_taker.setOnClickListener(new btn_photo_taker_function());
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAM_REQUEST)
        {
            Bitmap thumbnail=(Bitmap) data.getExtras().get("data");
            phototaker.setImageBitmap(thumbnail);
        }
    }

    class btn_photo_taker_function implements Button.OnClickListener
    {
        public void onClick(View v)
        {
            Intent cameraIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(cameraIntent,CAM_REQUEST);
        }
    }


    public void Camera(View view) {

    }
}
