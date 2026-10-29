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
    public final RootTelemetryConfiguration f5766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f5769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f5771k;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5766f = rootTelemetryConfiguration;
        this.f5767g = z10;
        this.f5768h = z11;
        this.f5769i = iArr;
        this.f5770j = i10;
        this.f5771k = iArr2;
    }

    @NonNull
    public final RootTelemetryConfiguration A3() {
        return this.f5766f;
    }

    public int v3() {
        return this.f5770j;
    }

    public int[] w3() {
        return this.f5769i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.t(parcel, 1, this.f5766f, i10, false);
        o9.b.c(parcel, 2, y3());
        o9.b.c(parcel, 3, z3());
        o9.b.o(parcel, 4, w3(), false);
        o9.b.n(parcel, 5, v3());
        o9.b.o(parcel, 6, x3(), false);
        o9.b.b(parcel, iA);
    }

    public int[] x3() {
        return this.f5771k;
    }

    public boolean y3() {
        return this.f5767g;
    }

    public boolean z3() {
        return this.f5768h;
    }
}
