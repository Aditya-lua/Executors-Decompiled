package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import nb.qd;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new qd();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7428h;

    public zzoh(String str, long j10, int i10) {
        this.f7426f = str;
        this.f7427g = j10;
        this.f7428h = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7426f;
        int iA = b.a(parcel);
        b.v(parcel, 1, str, false);
        b.r(parcel, 2, this.f7427g);
        b.n(parcel, 3, this.f7428h);
        b.b(parcel, iA);
    }
}
