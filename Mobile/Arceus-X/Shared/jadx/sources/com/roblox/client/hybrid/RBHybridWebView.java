package com.roblox.client.hybrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import p103eh.C5122j;
import p221ji.C7158a;
import p221ji.C7159b;
import p221ji.C7161d;
import p221ji.C7162e;
import p221ji.C7164g;
import p221ji.C7165h;
import p221ji.C7167j;
import p221ji.C7169l;
import p221ji.C7170m;
import p221ji.C7172o;
import th.C11659h;
import tk.C11669d;
import vg.C12173c0;

/* JADX INFO: loaded from: classes2.dex */
public class RBHybridWebView extends C11669d {

    /* JADX INFO: renamed from: d */
    public C5122j f11886d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RBHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // tk.C11669d
    /* JADX INFO: renamed from: a */
    public void mo15285a() {
        this.f11886d = null;
        super.mo15285a();
    }

    @Override // tk.C11669d
    /* JADX INFO: renamed from: d */
    public void mo15286d(Context context) {
        super.mo15286d(context);
        C5122j c5122j = new C5122j();
        this.f11886d = c5122j;
        c5122j.m23904a(C11659h.m43403a().mo43454H0());
    }

    @Override // tk.C11669d
    /* JADX INFO: renamed from: g */
    public void mo15287g(Context context) {
        m43825f(new C7172o());
        if (!C11659h.m43403a().mo43431D5()) {
            m43825f(new C7161d());
        }
        if (!C11659h.m43403a().mo43411B()) {
            m43825f(new C7158a());
        }
        m43825f(new C7162e());
        m43825f(new C7159b());
        m43825f(new C7170m());
        m43825f(new C7169l(context));
        m43825f(new C7165h());
        m43825f(new C7167j());
        m43825f(new C7164g());
    }

    /* JADX INFO: renamed from: h */
    public void mo15288h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo15289i() {
        if (C11659h.m43403a().mo43504O2()) {
            C12173c0.m45031t();
        }
        if (C11659h.m43403a().mo43470J2()) {
            mo15285a();
        }
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f11886d.m23905b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RBHybridWebView(Context context) {
        super(context);
    }
}
