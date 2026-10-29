package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.s0;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new s0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5803j;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5799f = i10;
        this.f5800g = z10;
        this.f5801h = z11;
        this.f5802i = i11;
        this.f5803j = i12;
    }

    public int v3() {
        return this.f5802i;
    }

    public int w3() {
        return this.f5803j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, z3());
        o9.b.c(parcel, 2, x3());
        o9.b.c(parcel, 3, y3());
        o9.b.n(parcel, 4, v3());
        o9.b.n(parcel, 5, w3());
        o9.b.b(parcel, iA);
    }

    public boolean x3() {
        return this.f5800g;
    }

    public boolean y3() {
        return this.f5801h;
    }

    public int z3() {
        return this.f5799f;
    }
}
