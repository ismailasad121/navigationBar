package com.example.navigationbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Book1Activity extends AppCompatActivity {

    PDFView book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);

        book1=findViewById(R.id.pdfBook1);
        book1.fromAsset("book1.pdf").load();
    }
}