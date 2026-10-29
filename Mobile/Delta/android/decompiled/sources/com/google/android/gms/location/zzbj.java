package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.w;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new w();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7390h;

    public zzbj(String str, String str2, String str3) {
        this.f7390h = str;
        this.f7388f = str2;
        this.f7389g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 1, this.f7388f, false);
        b.v(parcel, 2, this.f7389g, false);
        b.v(parcel, 5, this.f7390h, false);
        b.b(parcel, iA);
    }
}
