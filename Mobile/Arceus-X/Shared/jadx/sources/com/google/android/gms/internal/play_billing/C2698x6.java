package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2698x6 extends AbstractC2720z6 {
    public C2698x6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: a */
    public final double mo11826a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f9434a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: b */
    public final float mo11827b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f9434a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: c */
    public final void mo11828c(Object obj, long j10, boolean z10) {
        if (C2446a7.f8921g) {
            C2446a7.m11239c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            C2446a7.m11240d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: d */
    public final void mo11829d(Object obj, long j10, byte b) {
        if (C2446a7.f8921g) {
            C2446a7.m11239c(obj, j10, b);
        } else {
            C2446a7.m11240d(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: e */
    public final void mo11830e(Object obj, long j10, double d10) {
        this.f9434a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: f */
    public final void mo11831f(Object obj, long j10, float f10) {
        this.f9434a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2720z6
    /* JADX INFO: renamed from: g */
    public final boolean mo11832g(Object obj, long j10) {
        return C2446a7.f8921g ? C2446a7.m11260x(obj, j10) : C2446a7.m11261y(obj, j10);
    }
}
