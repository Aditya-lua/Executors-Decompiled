package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p271lf.C8129a;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f */
    public final int f11169f;

    /* JADX INFO: renamed from: g */
    public static final zza f11166g = new zza(1);

    /* JADX INFO: renamed from: h */
    public static final zza f11167h = new zza(2);

    /* JADX INFO: renamed from: i */
    public static final zza f11168i = new zza(3);
    public static final Parcelable.Creator<zza> CREATOR = new C8129a();

    public zza(int i10) {
        this.f11169f = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f11169f);
        C9718b.m38458b(parcel, iM38457a);
    }
}
