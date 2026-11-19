package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<r1, Thread> f7194a = AtomicReferenceFieldUpdater.newUpdater(r1.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater<r1, r1> b = AtomicReferenceFieldUpdater.newUpdater(r1.class, r1.class, "b");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super s1<?>, r1> f7195c = AtomicReferenceFieldUpdater.newUpdater(s1.class, r1.class, "c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super s1<?>, k1> f7196d = AtomicReferenceFieldUpdater.newUpdater(s1.class, k1.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<? super s1<?>, Object> f7197e = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "a");

    public /* synthetic */ o1(w1 w1Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final k1 a(s1 s1Var, k1 k1Var) {
        return f7196d.getAndSet(s1Var, k1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final r1 b(s1 s1Var, r1 r1Var) {
        return f7195c.getAndSet(s1Var, r1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void c(r1 r1Var, r1 r1Var2) {
        b.lazySet(r1Var, r1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final void d(r1 r1Var, Thread thread) {
        f7194a.lazySet(r1Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean e(s1 s1Var, k1 k1Var, k1 k1Var2) {
        return t1.a(f7196d, s1Var, k1Var, k1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean f(s1 s1Var, Object obj, Object obj2) {
        return t1.a(f7197e, s1Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    public final boolean g(s1 s1Var, r1 r1Var, r1 r1Var2) {
        return t1.a(f7195c, s1Var, r1Var, r1Var2);
    }
}
