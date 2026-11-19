package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends p9.a {
    public static final Parcelable.Creator<zzo> CREATOR = new zzab();
    public double zza;
    public double zzb;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.i(parcel, 2, this.zza);
        c.i(parcel, 3, this.zzb);
        c.b(parcel, iA);
    }

    public zzo(double d10, double d11) {
        this.zza = d10;
        this.zzb = d11;
    }
}
