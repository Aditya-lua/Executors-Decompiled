package com.roblox.client.hybrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import eh.j;
import ji.a;
import ji.b;
import ji.e;
import ji.g;
import ji.l;
import ji.m;
import ji.o;
import th.h;
import tk.d;
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class RBHybridWebView extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f9114d;

    public RBHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // tk.d
    public void a() {
        this.f9114d = null;
        super.a();
    }

    @Override // tk.d
    public void d(Context context) {
        super.d(context);
        j jVar = new j();
        this.f9114d = jVar;
        jVar.a(h.a().E0());
    }

    @Override // tk.d
    public void g(Context context) {
        f(new o());
        if (!h.a().x5()) {
            f(new ji.d());
        }
        if (!h.a().y()) {
            f(new a());
        }
        f(new e());
        f(new b());
        f(new m());
        f(new l(context));
        f(new ji.h());
        f(new ji.j());
        f(new g());
    }

    public void h() {
    }

    public void i() {
        if (h.a().I2()) {
            c0.t();
        }
        if (h.a().D2()) {
            a();
        }
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f9114d.b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    public RBHybridWebView(Context context) {
        super(context);
    }
}
