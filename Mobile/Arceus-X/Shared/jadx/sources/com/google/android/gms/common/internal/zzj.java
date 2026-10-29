package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8922b1;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C8922b1();

    /* JADX INFO: renamed from: f */
    public Bundle f7504f;

    /* JADX INFO: renamed from: g */
    public Feature[] f7505g;

    /* JADX INFO: renamed from: h */
    public int f7506h;

    /* JADX INFO: renamed from: i */
    public ConnectionTelemetryConfiguration f7507i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, this.f7504f, false);
        C9718b.m38481y(parcel, 2, this.f7505g, i10, false);
        C9718b.m38470n(parcel, 3, this.f7506h);
        C9718b.m38476t(parcel, 4, this.f7507i, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzj(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f7504f = bundle;
        this.f7505g = featureArr;
        this.f7506h = i10;
        this.f7507i = connectionTelemetryConfiguration;
    }
}
