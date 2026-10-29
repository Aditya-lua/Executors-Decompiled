package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;
import p539x8.C12770d;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C12770d();

    /* JADX INFO: renamed from: f */
    public final String f7210f;

    /* JADX INFO: renamed from: g */
    public final String f7211g;

    public zza(String str, String str2) {
        this.f7210f = str;
        this.f7211g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, this.f7210f, false);
        C9718b.m38478v(parcel, 2, this.f7211g, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
