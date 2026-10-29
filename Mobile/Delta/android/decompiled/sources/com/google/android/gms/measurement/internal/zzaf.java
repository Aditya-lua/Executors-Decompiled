package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.g;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7408h;

    public zzaf(long j10, int i10, long j11) {
        this.f7406f = j10;
        this.f7407g = i10;
        this.f7408h = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7406f;
        int iA = b.a(parcel);
        b.r(parcel, 1, j10);
        b.n(parcel, 2, this.f7407g);
        b.r(parcel, 3, this.f7408h);
        b.b(parcel, iA);
    }
}
