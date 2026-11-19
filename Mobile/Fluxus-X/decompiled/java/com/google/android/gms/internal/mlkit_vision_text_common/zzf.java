package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends a {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzf(int i10, int i11, int i12, int i13, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = c.a(parcel);
        c.n(parcel, 2, i11);
        c.n(parcel, 3, this.zzb);
        c.n(parcel, 4, this.zzc);
        c.n(parcel, 5, this.zzd);
        c.k(parcel, 6, this.zze);
        c.b(parcel, iA);
    }
}
