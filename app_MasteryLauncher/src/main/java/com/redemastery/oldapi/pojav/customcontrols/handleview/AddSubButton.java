package com.redemastery.oldapi.pojav.customcontrols.handleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.redemastery.launcher.R;

import com.redemastery.oldapi.pojav.customcontrols.ControlData;
import com.redemastery.oldapi.pojav.customcontrols.buttons.ControlDrawer;
import com.redemastery.oldapi.pojav.customcontrols.buttons.ControlInterface;

@SuppressLint("AppCompatCustomView")
public class AddSubButton extends Button implements ActionButtonInterface {
    public AddSubButton(Context context) {super(context); init();}
    public AddSubButton(Context context, @Nullable AttributeSet attrs) {super(context, attrs); init();}

    public void init() {
        setText(R.string.customctrl_addsubbutton);
        setOnClickListener(this);
    }

    private ControlInterface mCurrentlySelectedButton = null;

    @Override
    public boolean shouldBeVisible() {
        return mCurrentlySelectedButton != null && mCurrentlySelectedButton instanceof ControlDrawer;
    }

    @Override
    public void setFollowedView(ControlInterface view) {
        mCurrentlySelectedButton = view;
    }

    @Override
    public void onClick() {
        if(mCurrentlySelectedButton instanceof ControlDrawer){
            ((ControlDrawer)mCurrentlySelectedButton).getControlLayoutParent().addSubButton(
                    (ControlDrawer)mCurrentlySelectedButton,
                    new ControlData()
            );
        }
    }


}
