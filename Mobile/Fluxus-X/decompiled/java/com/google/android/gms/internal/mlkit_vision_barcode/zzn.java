package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends p9.a {
    public static final Parcelable.Creator<zzn> CREATOR = new zzaa();
    public int zza;
    public String zzb;
    public String zzc;
    public String zzd;

    public zzn() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 2, this.zza);
        c.v(parcel, 3, this.zzb, false);
        c.v(parcel, 4, this.zzc, false);
        c.v(parcel, 5, this.zzd, false);
        c.b(parcel, iA);
    }

    public zzn(int i10, String str, String str2, String str3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }
}
