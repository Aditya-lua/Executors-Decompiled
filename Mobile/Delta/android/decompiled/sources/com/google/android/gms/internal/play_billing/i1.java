package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class i1<V> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1<V> f7105a;
    public final i2<? extends V> b;

    public i1(m1 m1Var, i2 i2Var) {
        this.f7105a = m1Var;
        this.b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7105a.f7231a != this) {
            return;
        }
        if (s1.k(this.f7105a, this, m1.t(this.b))) {
            m1.w(this.f7105a, false);
        }
    }
}
