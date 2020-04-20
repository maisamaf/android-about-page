package com.example.aboutpage;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutMe extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.coverr)
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("Connect with us")
                .addEmail("elmehdi.sakout@gmail.com")
                .addWebsite("http://medyo.github.io/")
                .addFacebook("the.medy")
                .addTwitter("medyo80")
                .addYoutube("UCdPQtdWIsg7_pi4mrRu46vA")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("medyo")
                .addInstagram("medyo80")
                .addItem(createCopyright())
                .create();

        setContentView(aboutPage);
    }
    private Element createCopyright(){

        Element copyright = new Element();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String copyrightString = String.format("Copyright %d", year);
        copyright.setTitle(copyrightString);
        copyright.setIconDrawable(R.drawable.about_icon_google_play);
        copyright.setGravity(Gravity.CENTER);

        return copyright;
    }











}
