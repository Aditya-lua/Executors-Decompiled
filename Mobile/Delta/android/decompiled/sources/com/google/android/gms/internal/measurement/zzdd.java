package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new h2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f7048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7049j;

    public zzdd(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f7045f = j10;
        this.f7046g = j11;
        this.f7047h = z10;
        this.f7048i = bundle;
        this.f7049j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7045f;
        int iA = o9.b.a(parcel);
        o9.b.r(parcel, 1, j10);
        o9.b.r(parcel, 2, this.f7046g);
        o9.b.c(parcel, 3, this.f7047h);
        o9.b.f(parcel, 7, this.f7048i, false);
        o9.b.v(parcel, 8, this.f7049j, false);
        o9.b.b(parcel, iA);
    }
}
