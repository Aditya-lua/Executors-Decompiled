package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new ca.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6030f;

    public zzab(long j10) {
        this.f6030f = ((Long) m.l(Long.valueOf(j10))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzab) && this.f6030f == ((zzab) obj).f6030f;
    }

    public final int hashCode() {
        return k.c(Long.valueOf(this.f6030f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f6030f;
        int iA = o9.b.a(parcel);
        o9.b.r(parcel, 1, j10);
        o9.b.b(parcel, iA);
    }
}
