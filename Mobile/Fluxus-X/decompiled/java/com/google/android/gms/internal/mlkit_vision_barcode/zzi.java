package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzi extends p9.a {
    public static final Parcelable.Creator<zzi> CREATOR = new zzh();
    public int zza;
    public String[] zzb;

    public zzi() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 2, this.zza);
        c.w(parcel, 3, this.zzb, false);
        c.b(parcel, iA);
    }

    public zzi(int i10, String[] strArr) {
        this.zza = i10;
        this.zzb = strArr;
    }
}
