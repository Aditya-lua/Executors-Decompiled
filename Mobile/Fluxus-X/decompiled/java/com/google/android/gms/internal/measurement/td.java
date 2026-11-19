package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class td extends vd {
    public td(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final void a(Object obj, long j10, byte b) {
        if (wd.f6913h) {
            wd.d(obj, j10, b);
        } else {
            wd.e(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final boolean b(Object obj, long j10) {
        return wd.f6913h ? wd.z(obj, j10) : wd.A(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final void c(Object obj, long j10, boolean z10) {
        if (wd.f6913h) {
            wd.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            wd.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f6893a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final void e(Object obj, long j10, float f10) {
        this.f6893a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f6893a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final void g(Object obj, long j10, double d10) {
        this.f6893a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
