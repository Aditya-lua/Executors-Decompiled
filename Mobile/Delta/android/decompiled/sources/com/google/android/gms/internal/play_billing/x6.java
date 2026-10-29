package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class x6 extends z6 {
    public x6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f7358a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f7358a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final void c(Object obj, long j10, boolean z10) {
        if (a7.f7002g) {
            a7.c(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            a7.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final void d(Object obj, long j10, byte b) {
        if (a7.f7002g) {
            a7.c(obj, j10, b);
        } else {
            a7.d(obj, j10, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final void e(Object obj, long j10, double d10) {
        this.f7358a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final void f(Object obj, long j10, float f10) {
        this.f7358a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.z6
    public final boolean g(Object obj, long j10) {
        return a7.f7002g ? a7.x(obj, j10) : a7.y(obj, j10);
    }
}
