package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p306nb.C9198n;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C9198n();

    /* JADX INFO: renamed from: f */
    public final Bundle f9500f;

    public zzao(Bundle bundle) {
        this.f9500f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f9500f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, bundle, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
