package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2594o1 extends AbstractC2583n1 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater<C2627r1, Thread> f9174a = AtomicReferenceFieldUpdater.newUpdater(C2627r1.class, Thread.class, "a");

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater<C2627r1, C2627r1> f9175b = AtomicReferenceFieldUpdater.newUpdater(C2627r1.class, C2627r1.class, "b");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater<? super AbstractC2638s1<?>, C2627r1> f9176c = AtomicReferenceFieldUpdater.newUpdater(AbstractC2638s1.class, C2627r1.class, "c");

    /* JADX INFO: renamed from: d */
    public static final AtomicReferenceFieldUpdater<? super AbstractC2638s1<?>, C2550k1> f9177d = AtomicReferenceFieldUpdater.newUpdater(AbstractC2638s1.class, C2550k1.class, "b");

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater<? super AbstractC2638s1<?>, Object> f9178e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2638s1.class, Object.class, "a");

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0001: CONSTRUCTOR (null com.google.android.gms.internal.play_billing.w1) A[MD:(com.google.android.gms.internal.play_billing.w1):void (m)] call: com.google.android.gms.internal.play_billing.n1.<init>(com.google.android.gms.internal.play_billing.w1):void type: SUPER */
    public /* synthetic */ C2594o1(C2682w1 c2682w1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: a */
    public final C2550k1 mo11603a(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1) {
        return f9177d.getAndSet(abstractC2638s1, c2550k1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: b */
    public final C2627r1 mo11604b(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1) {
        return f9176c.getAndSet(abstractC2638s1, c2627r1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: c */
    public final void mo11605c(C2627r1 c2627r1, C2627r1 c2627r2) {
        f9175b.lazySet(c2627r1, c2627r2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: d */
    public final void mo11606d(C2627r1 c2627r1, Thread thread) {
        f9174a.lazySet(c2627r1, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: e */
    public final boolean mo11607e(AbstractC2638s1 abstractC2638s1, C2550k1 c2550k1, C2550k1 c2550k2) {
        return C2649t1.m11735a(f9177d, abstractC2638s1, c2550k1, c2550k2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: f */
    public final boolean mo11608f(AbstractC2638s1 abstractC2638s1, Object obj, Object obj2) {
        return C2649t1.m11735a(f9178e, abstractC2638s1, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2583n1
    /* JADX INFO: renamed from: g */
    public final boolean mo11609g(AbstractC2638s1 abstractC2638s1, C2627r1 c2627r1, C2627r1 c2627r2) {
        return C2649t1.m11735a(f9176c, abstractC2638s1, c2627r1, c2627r2);
    }
}
