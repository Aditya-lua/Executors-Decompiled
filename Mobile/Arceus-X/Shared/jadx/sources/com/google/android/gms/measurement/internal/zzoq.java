package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p306nb.C9356wd;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new C9356wd();

    /* JADX INFO: renamed from: f */
    public final List f9517f;

    public zzoq(List list) {
        this.f9517f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f9517f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, list, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
