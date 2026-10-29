package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class pd extends rd {
    public pd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final void a(Object obj, long j10, byte b) {
        if (sd.f6794h) {
            sd.d(obj, j10, b);
        } else {
            sd.e(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final boolean b(Object obj, long j10) {
        return sd.f6794h ? sd.z(obj, j10) : sd.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final void c(Object obj, long j10, boolean z10) {
        if (sd.f6794h) {
            sd.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            sd.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f6776a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final void e(Object obj, long j10, float f10) {
        this.f6776a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f6776a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.rd
    public final void g(Object obj, long j10, double d10) {
        this.f6776a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
