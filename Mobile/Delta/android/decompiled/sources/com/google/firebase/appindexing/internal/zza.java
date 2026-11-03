package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lf.a;
import o9.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zza f8753g = new zza(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zza f8754h = new zza(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zza f8755i = new zza(3);
    public static final Parcelable.Creator<zza> CREATOR = new a();

    public zza(int i10) {
        this.f8756f = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 1, this.f8756f);
        b.b(parcel, iA);
    }
}
