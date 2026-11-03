package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.b1;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new b1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f5888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Feature[] f5889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f5891i;

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.f(parcel, 1, this.f5888f, false);
        o9.b.y(parcel, 2, this.f5889g, i10, false);
        o9.b.n(parcel, 3, this.f5890h);
        o9.b.t(parcel, 4, this.f5891i, i10, false);
        o9.b.b(parcel, iA);
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f5888f = bundle;
        this.f5889g = featureArr;
        this.f5890h = i10;
        this.f5891i = connectionTelemetryConfiguration;
    }
}
