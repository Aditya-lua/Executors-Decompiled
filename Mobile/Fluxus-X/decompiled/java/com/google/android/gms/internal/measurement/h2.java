package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends p9.a {
    public static final Parcelable.Creator<h2> CREATOR = new i2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f6531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6532j;

    public h2(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f6528f = j10;
        this.f6529g = j11;
        this.f6530h = z10;
        this.f6531i = bundle;
        this.f6532j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f6528f;
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, j10);
        p9.c.r(parcel, 2, this.f6529g);
        p9.c.c(parcel, 3, this.f6530h);
        p9.c.f(parcel, 7, this.f6531i, false);
        p9.c.v(parcel, 8, this.f6532j, false);
        p9.c.b(parcel, iA);
    }
}
