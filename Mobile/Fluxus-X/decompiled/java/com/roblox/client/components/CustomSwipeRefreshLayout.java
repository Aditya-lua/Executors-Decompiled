package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import n5.d;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSwipeRefreshLayout extends d {
    public int R;
    public float S;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // n5.d, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.S = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.S) > this.R) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
