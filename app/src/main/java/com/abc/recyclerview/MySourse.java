package com.abc.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MySourse extends Source {

    /**
     * @param title
     * @param image
     */
    public MySourse(String title, int image) {
        super(title, image);
    }

    @Override
    public String getTitle() {
        //me trae el del papá
        return super.getTitle() + "kelin";
    }
}
