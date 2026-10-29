package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.f0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eb.m3;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new f0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f6049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final m3 f6050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final m3 f6051i;

    public zzq(long j10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        byte[] bArr4 = (byte[]) m.l(bArr);
        m3 m3Var = m3.b;
        m3 m3VarM = m3.m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) m.l(bArr2);
        m3 m3VarM2 = m3.m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) m.l(bArr3);
        m3 m3VarM3 = m3.m(bArr6, 0, bArr6.length);
        this.f6048f = j10;
        this.f6049g = (m3) m.l(m3VarM);
        this.f6050h = (m3) m.l(m3VarM2);
        this.f6051i = (m3) m.l(m3VarM3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f6048f == zzqVar.f6048f && k.b(this.f6049g, zzqVar.f6049g) && k.b(this.f6050h, zzqVar.f6050h) && k.b(this.f6051i, zzqVar.f6051i);
    }

    public final int hashCode() {
        return k.c(Long.valueOf(this.f6048f), this.f6049g, this.f6050h, this.f6051i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f6048f;
        int iA = o9.b.a(parcel);
        o9.b.r(parcel, 1, j10);
        o9.b.g(parcel, 2, this.f6049g.p(), false);
        o9.b.g(parcel, 3, this.f6050h.p(), false);
        o9.b.g(parcel, 4, this.f6051i.p(), false);
        o9.b.b(parcel, iA);
    }
}
