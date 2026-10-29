package com.roblox.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import p103eh.C5122j;
import p151gk.C6124q;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
public class RBXSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: a */
    public Context f11602a;

    /* JADX INFO: renamed from: b */
    public C5122j f11603b;

    public RBXSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11602a = null;
        m14823a();
        this.f11602a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m14823a() {
        C5122j c5122j = new C5122j();
        this.f11603b = c5122j;
        c5122j.m23904a(C11659h.m43403a().mo43454H0());
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f11603b.m23905b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return PointerIcon.getSystemIcon(this.f11602a, 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        C6124q.m27063h("RBXSurfaceView", "SurfaceView size has changed: old width " + i12 + " new width " + i10 + " old height " + i13 + " new height " + i11);
    }
}
