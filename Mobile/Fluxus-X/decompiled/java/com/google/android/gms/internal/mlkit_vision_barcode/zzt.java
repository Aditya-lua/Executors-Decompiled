package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends p9.a {
    public static final Parcelable.Creator<zzt> CREATOR = new zzag();
    public String zza;
    public String zzb;
    public int zzc;

    public zzt() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.v(parcel, 2, this.zza, false);
        c.v(parcel, 3, this.zzb, false);
        c.n(parcel, 4, this.zzc);
        c.b(parcel, iA);
    }

    public zzt(String str, String str2, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }
}
