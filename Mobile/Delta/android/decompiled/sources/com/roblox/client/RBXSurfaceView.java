package com.roblox.client;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;
import dh.j;
import ek.q;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class RBXSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8971a;
    public j b;

    public RBXSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8971a = null;
        a();
        this.f8971a = context;
    }

    public void a() {
        j jVar = new j();
        this.b = jVar;
        jVar.a(h.a().J0());
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.b.b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return PointerIcon.getSystemIcon(this.f8971a, 0);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q.h("RBXSurfaceView", "SurfaceView size has changed: old width " + i12 + " new width " + i10 + " old height " + i13 + " new height " + i11);
    }
}
