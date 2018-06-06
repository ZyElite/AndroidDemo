package com.mainli.d.d2018.view.round;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/** 
 * 圆角LinearLayout 
 * 
 * @author wangheng 
 */ 
public class RoundRectLinearLayout extends LinearLayout {
 
    public RoundRectLinearLayout(Context context) {
        super(context);
        init(context,null);
    } 
 
    public RoundRectLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    } 
 
    public RoundRectLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    } 
 
 
    private RoundRectHelper mHelper = null;
 
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RoundRectLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    } 
 
    private void init(Context context, AttributeSet attrs) {
        mHelper = new RoundRectHelper(context,attrs,RoundRectLinearLayout.this);
    } 
 
    @Override
    protected void dispatchDraw(Canvas canvas) {
 
        mHelper.startRoundRect(canvas);
 
        // dst 
        super.dispatchDraw(canvas);
 
        // src setXfermode 
        mHelper.completedRoundRect(canvas);
    } 
} 