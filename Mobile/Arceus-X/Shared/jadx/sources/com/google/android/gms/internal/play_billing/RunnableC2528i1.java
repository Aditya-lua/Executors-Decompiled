package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2528i1<V> implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2572m1<V> f9045a;

    /* JADX INFO: renamed from: b */
    public final InterfaceFutureC2529i2<? extends V> f9046b;

    public RunnableC2528i1(AbstractC2572m1 abstractC2572m1, InterfaceFutureC2529i2 interfaceFutureC2529i2) {
        this.f9045a = abstractC2572m1;
        this.f9046b = interfaceFutureC2529i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9045a.f9224a != this) {
            return;
        }
        if (AbstractC2638s1.m11710k(this.f9045a, this, AbstractC2572m1.m11573t(this.f9046b))) {
            AbstractC2572m1.m11575w(this.f9045a, false);
        }
    }
}
