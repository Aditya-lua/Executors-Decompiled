package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import o9.b;
import qb.h;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zat f7472g;

    public zai(int i10, zat zatVar) {
        this.f7471f = i10;
        this.f7472g = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f7471f);
        b.t(parcel, 2, this.f7472g, i10, false);
        b.b(parcel, iA);
    }
}
