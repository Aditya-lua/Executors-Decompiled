package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.C8120w;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new C8120w();

    /* JADX INFO: renamed from: f */
    public final String f9466f;

    /* JADX INFO: renamed from: g */
    public final String f9467g;

    /* JADX INFO: renamed from: h */
    public final String f9468h;

    public zzbj(String str, String str2, String str3) {
        this.f9468h = str;
        this.f9466f = str2;
        this.f9467g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, this.f9466f, false);
        C9718b.m38478v(parcel, 2, this.f9467g, false);
        C9718b.m38478v(parcel, 5, this.f9468h, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
