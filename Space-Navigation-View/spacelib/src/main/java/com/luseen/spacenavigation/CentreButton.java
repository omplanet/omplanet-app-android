package com.luseen.spacenavigation;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.design.widget.FloatingActionButton;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Chatikyan on 10.11.2016.
 */

public class CentreButton extends FrameLayout {

    private TextView tvTitle;
    private ImageView ivCentre;
    private RelativeLayout container;

    public CentreButton(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.cetre_item_view, this);
        tvTitle = findViewById(R.id.space_text);
        container = findViewById(R.id.cetre_item_container);
        ivCentre = findViewById(R.id.space_icon);
        //ivCentre.setColorFilter(android.R.color.black, PorterDuff.Mode.SRC_OVER);
    }

    public TextView getCentreText() {
        return tvTitle;
    }

    public ImageView getImage() {
        return ivCentre;
    }

    public RelativeLayout getContainer() {
        return container;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean result = super.onTouchEvent(ev);
        if (!result) {
            if(ev.getAction() == MotionEvent.ACTION_UP) {
                cancelLongPress();
            }
            setPressed(false);
        }
        return result;
    }
}
