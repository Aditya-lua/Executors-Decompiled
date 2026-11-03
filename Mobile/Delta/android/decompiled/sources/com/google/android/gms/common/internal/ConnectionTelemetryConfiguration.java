package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.c1;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new c1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RootTelemetryConfiguration f5839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f5844k;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5839f = rootTelemetryConfiguration;
        this.f5840g = z10;
        this.f5841h = z11;
        this.f5842i = iArr;
        this.f5843j = i10;
        this.f5844k = iArr2;
    }

    @NonNull
    public final RootTelemetryConfiguration A3() {
        return this.f5839f;
    }

    public int v3() {
        return this.f5843j;
    }

    public int[] w3() {
        return this.f5842i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, this.f5839f, i10, false);
        o9.b.c(parcel, 2, y3());
        o9.b.c(parcel, 3, z3());
        o9.b.o(parcel, 4, w3(), false);
        o9.b.n(parcel, 5, v3());
        o9.b.o(parcel, 6, x3(), false);
        o9.b.b(parcel, iA);
    }

    public int[] x3() {
        return this.f5844k;
    }

    public boolean y3() {
        return this.f5840g;
    }

    public boolean z3() {
        return this.f5841h;
    }
}
