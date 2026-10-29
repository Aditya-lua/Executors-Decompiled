package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2604p0 {

    /* JADX INFO: renamed from: a */
    public Object[] f9182a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f9183b = 0;

    /* JADX INFO: renamed from: c */
    public C2593o0 f9184c;

    /* JADX INFO: renamed from: a */
    public final C2604p0 m11638a(Object obj, Object obj2) {
        int i10 = this.f9183b + 1;
        Object[] objArr = this.f9182a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f9182a = Arrays.copyOf(objArr, C2527i0.m11469a(length, i11));
        }
        C2494f0.m11400a(obj, obj2);
        Object[] objArr2 = this.f9182a;
        int i12 = this.f9183b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f9183b = i12 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2615q0 m11639b() {
        C2593o0 c2593o0 = this.f9184c;
        if (c2593o0 != null) {
            throw c2593o0.m11631a();
        }
        C2451b1 c2451b1M11272g = C2451b1.m11272g(this.f9183b, this.f9182a, this);
        C2593o0 c2593o1 = this.f9184c;
        if (c2593o1 == null) {
            return c2451b1M11272g;
        }
        throw c2593o1.m11631a();
    }
}
