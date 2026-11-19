package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends a {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    public int zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;
    public float zzf;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 2, this.zza);
        c.n(parcel, 3, this.zzb);
        c.n(parcel, 4, this.zzc);
        c.c(parcel, 5, this.zzd);
        c.c(parcel, 6, this.zze);
        c.k(parcel, 7, this.zzf);
        c.b(parcel, iA);
    }

    public zzh(int i10, int i11, int i12, boolean z10, boolean z11, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = f10;
    }
}
