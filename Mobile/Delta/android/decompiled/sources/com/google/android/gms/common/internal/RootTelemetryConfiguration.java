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
    public final int f5872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5876j;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5872f = i10;
        this.f5873g = z10;
        this.f5874h = z11;
        this.f5875i = i11;
        this.f5876j = i12;
    }

    public int v3() {
        return this.f5875i;
    }

    public int w3() {
        return this.f5876j;
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
        return this.f5873g;
    }

    public boolean y3() {
        return this.f5874h;
    }

    public int z3() {
        return this.f5872f;
    }
}
