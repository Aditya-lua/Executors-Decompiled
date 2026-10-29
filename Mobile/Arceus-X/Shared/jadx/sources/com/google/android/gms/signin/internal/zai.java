package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p325o9.C9718b;
import p376qb.C10493h;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C10493h();

    /* JADX INFO: renamed from: f */
    public final int f9561f;

    /* JADX INFO: renamed from: g */
    public final zat f9562g;

    public zai(int i10, zat zatVar) {
        this.f9561f = i10;
        this.f9562g = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.f9561f);
        C9718b.m38476t(parcel, 2, this.f9562g, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
