package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2626r0 extends C2516h0 {
    public C2626r0() {
        super(4);
    }

    /* JADX INFO: renamed from: b */
    public final C2626r0 m11695b(Object obj) {
        obj.getClass();
        int length = this.f9021a.length;
        int iM11469a = C2527i0.m11469a(length, this.f9022b + 1);
        if (iM11469a > length || this.f9023c) {
            this.f9021a = Arrays.copyOf(this.f9021a, iM11469a);
            this.f9023c = false;
        }
        Object[] objArr = this.f9021a;
        int i10 = this.f9022b;
        this.f9022b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2637s0 m11696c() {
        int i10 = this.f9022b;
        if (i10 == 0) {
            return C2462c1.f8935i;
        }
        if (i10 == 1) {
            Object obj = this.f9021a[0];
            Objects.requireNonNull(obj);
            return new C2484e1(obj);
        }
        AbstractC2637s0 abstractC2637s0M11708m = AbstractC2637s0.m11708m(i10, this.f9021a);
        this.f9022b = abstractC2637s0M11708m.size();
        this.f9023c = true;
        return abstractC2637s0M11708m;
    }
}
