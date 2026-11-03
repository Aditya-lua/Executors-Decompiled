package com.roblox.client.hybrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import dh.j;
import hi.a;
import hi.b;
import hi.e;
import hi.g;
import hi.l;
import hi.m;
import hi.o;
import rh.h;
import rk.d;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class RBHybridWebView extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f9187d;

    public RBHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // rk.d
    public void a() {
        this.f9187d = null;
        super.a();
    }

    @Override // rk.d
    public void d(Context context) {
        super.d(context);
        j jVar = new j();
        this.f9187d = jVar;
        jVar.a(h.a().J0());
    }

    @Override // rk.d
    public void g(Context context) {
        f(new o());
        if (!h.a().H5()) {
            f(new hi.d());
        }
        if (!h.a().A()) {
            f(new a());
        }
        f(new e());
        f(new b());
        f(new m());
        f(new l(context));
        f(new hi.h());
        f(new hi.j());
        f(new g());
    }

    public void h() {
    }

    public void i() {
        if (h.a().T2()) {
            c0.t();
        }
        if (h.a().O2()) {
            a();
        }
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f9187d.b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    public RBHybridWebView(Context context) {
        super(context);
    }
}
