package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7119a;
    public final AtomicReferenceFieldUpdater b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7122e;

    public f7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f7119a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.f7120c = atomicReferenceFieldUpdater3;
        this.f7121d = atomicReferenceFieldUpdater4;
        this.f7122e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void a(q9 q9Var, q9 q9Var2) {
        this.b.lazySet(q9Var, q9Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final void b(q9 q9Var, Thread thread) {
        this.f7119a.lazySet(q9Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean c(s9 s9Var, k5 k5Var, k5 k5Var2) {
        return l6.a(this.f7121d, s9Var, k5Var, k5Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean d(s9 s9Var, Object obj, Object obj2) {
        return l6.a(this.f7122e, s9Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final boolean e(s9 s9Var, q9 q9Var, q9 q9Var2) {
        return l6.a(this.f7120c, s9Var, q9Var, q9Var2);
    }
}
