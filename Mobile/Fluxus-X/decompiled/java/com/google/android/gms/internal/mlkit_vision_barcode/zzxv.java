package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzxv extends p9.a {
    public static final Parcelable.Creator<zzxv> CREATOR = new zzyk();
    private final double zza;
    private final double zzb;

    public zzxv(double d10, double d11) {
        this.zza = d10;
        this.zzb = d11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.i(parcel, 1, this.zza);
        c.i(parcel, 2, this.zzb);
        c.b(parcel, iA);
    }

    public final double zza() {
        return this.zza;
    }

    public final double zzb() {
        return this.zzb;
    }
}
