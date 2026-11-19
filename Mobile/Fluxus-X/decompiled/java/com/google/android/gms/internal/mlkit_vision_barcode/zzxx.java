package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzxx extends p9.a {
    public static final Parcelable.Creator<zzxx> CREATOR = new zzyq();
    private final int zza;
    private final String zzb;

    public zzxx(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.v(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
