package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2501f7 extends AbstractC2693x1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater f8974a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater f8975b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f8976c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f8977d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f8978e;

    public C2501f7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f8974a = atomicReferenceFieldUpdater;
        this.f8975b = atomicReferenceFieldUpdater2;
        this.f8976c = atomicReferenceFieldUpdater3;
        this.f8977d = atomicReferenceFieldUpdater4;
        this.f8978e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: a */
    public final void mo11408a(C2624q9 c2624q9, C2624q9 c2624q10) {
        this.f8975b.lazySet(c2624q9, c2624q10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: b */
    public final void mo11409b(C2624q9 c2624q9, Thread thread) {
        this.f8974a.lazySet(c2624q9, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: c */
    public final boolean mo11410c(C2646s9 c2646s9, C2554k5 c2554k5, C2554k5 c2554k6) {
        return C2566l6.m11541a(this.f8977d, c2646s9, c2554k5, c2554k6);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: d */
    public final boolean mo11411d(C2646s9 c2646s9, Object obj, Object obj2) {
        return C2566l6.m11541a(this.f8978e, c2646s9, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2693x1
    /* JADX INFO: renamed from: e */
    public final boolean mo11412e(C2646s9 c2646s9, C2624q9 c2624q9, C2624q9 c2624q10) {
        return C2566l6.m11541a(this.f8976c, c2646s9, c2624q9, c2624q10);
    }
}
