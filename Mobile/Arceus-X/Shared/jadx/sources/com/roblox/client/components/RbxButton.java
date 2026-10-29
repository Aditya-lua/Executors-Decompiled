package com.roblox.client.components;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p103eh.C5117e;
import p103eh.C5118f;

/* JADX INFO: loaded from: classes2.dex */
public class RbxButton extends Button {

    /* JADX INFO: renamed from: a */
    public RbxButton f11742a;

    /* JADX INFO: renamed from: b */
    public C5118f f11743b;

    /* JADX INFO: renamed from: c */
    public View.OnClickListener f11744c;

    public RbxButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11742a = null;
        this.f11743b = null;
        C5117e.m23879c(this, context, attributeSet);
        m15064a(attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m15064a(AttributeSet attributeSet) {
        this.f11742a = this;
        this.f11743b = new C5118f(this, attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f11743b.m23892i(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f11743b.m23895l(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f11744c = onClickListener;
    }
}
