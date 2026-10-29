package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;
import r9.e;

/* JADX INFO: loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5820g;

    public ModuleAvailabilityResponse(boolean z10, int i10) {
        this.f5819f = z10;
        this.f5820g = i10;
    }

    public boolean v3() {
        return this.f5819f;
    }

    public int w3() {
        return this.f5820g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.c(parcel, 1, v3());
        b.n(parcel, 2, w3());
        b.b(parcel, iA);
    }
}
