package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import x8.d;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5615g;

    public zza(String str, String str2) {
        this.f5614f = str;
        this.f5615g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, this.f5614f, false);
        b.v(parcel, 2, this.f5615g, false);
        b.b(parcel, iA);
    }
}
