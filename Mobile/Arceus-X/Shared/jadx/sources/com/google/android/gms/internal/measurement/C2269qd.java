package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.qd */
/* JADX INFO: loaded from: classes.dex */
public final class C2269qd extends AbstractC2287rd {
    public C2269qd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: a */
    public final void mo10535a(Object obj, long j10, byte b) {
        if (C2305sd.f8649h) {
            C2305sd.m10729d(obj, j10, b);
        } else {
            C2305sd.m10730e(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: b */
    public final boolean mo10536b(Object obj, long j10) {
        return C2305sd.f8649h ? C2305sd.m10751z(obj, j10) : C2305sd.m10721A(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.sd.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.sd.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.sd.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.measurement.sd.B(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: c */
    public final void mo10537c(Object obj, long j10, boolean z10) {
        if (C2305sd.f8649h) {
            C2305sd.m10722B(obj, j10, z10);
        } else {
            C2305sd.m10723C(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: d */
    public final float mo10538d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f8626a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: e */
    public final void mo10539e(Object obj, long j10, float f10) {
        this.f8626a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: f */
    public final double mo10540f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f8626a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2287rd
    /* JADX INFO: renamed from: g */
    public final void mo10541g(Object obj, long j10, double d10) {
        this.f8626a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
