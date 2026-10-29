package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j9.e0;
import j9.k0;
import j9.q;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f5847j;

    public zzr(boolean z10, String str, int i10, int i11, long j10) {
        this.f5843f = z10;
        this.f5844g = str;
        this.f5845h = k0.a(i10) - 1;
        this.f5846i = q.a(i11) - 1;
        this.f5847j = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, this.f5843f);
        b.v(parcel, 2, this.f5844g, false);
        b.n(parcel, 3, this.f5845h);
        b.n(parcel, 4, this.f5846i);
        b.r(parcel, 5, this.f5847j);
        b.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f5843f;
    }

    public final String zzb() {
        return this.f5844g;
    }

    public final long zzc() {
        return this.f5847j;
    }

    public final int zzd() {
        return k0.a(this.f5845h);
    }

    public final int zze() {
        return q.a(this.f5846i);
    }
}
