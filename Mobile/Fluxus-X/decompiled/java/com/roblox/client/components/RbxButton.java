package com.roblox.client.components;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import nh.e;
import nh.f;

/* JADX INFO: loaded from: classes2.dex */
public class RbxButton extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RbxButton f8882a;
    public f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f8883c;

    public RbxButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8882a = null;
        this.b = null;
        e.c(this, context, attributeSet);
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        this.f8882a = this;
        this.b = new f(this, attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.b.i(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.b.l(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f8883c = onClickListener;
    }
}
