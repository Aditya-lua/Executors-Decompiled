package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.ud;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new ud();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f7430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f7432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f7435l;

    public zzom(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f7429f = j10;
        this.f7430g = bArr;
        this.f7431h = str;
        this.f7432i = bundle;
        this.f7433j = i10;
        this.f7434k = j11;
        this.f7435l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7429f;
        int iA = b.a(parcel);
        b.r(parcel, 1, j10);
        b.g(parcel, 2, this.f7430g, false);
        b.v(parcel, 3, this.f7431h, false);
        b.f(parcel, 4, this.f7432i, false);
        b.n(parcel, 5, this.f7433j);
        b.r(parcel, 6, this.f7434k);
        b.v(parcel, 7, this.f7435l, false);
        b.b(parcel, iA);
    }
}
