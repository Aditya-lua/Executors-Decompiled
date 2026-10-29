package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {

    /* JADX INFO: renamed from: R */
    public int f11732R;

    /* JADX INFO: renamed from: S */
    public float f11733S;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11732R = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11733S = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f11733S) > this.f11732R) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
