package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends a {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final float zzi;
    public final zzn[] zzj;
    public final float zzk;
    public final float zzl;
    public final float zzm;
    public final zzd[] zzn;
    public final float zzo;

    public zzf(int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, zzn[] zznVarArr, float f17, float f18, float f19, zzd[] zzdVarArr, float f20) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = f12;
        this.zzf = f13;
        this.zzg = f14;
        this.zzh = f15;
        this.zzi = f16;
        this.zzj = zznVarArr;
        this.zzk = f17;
        this.zzl = f18;
        this.zzm = f19;
        this.zzn = zzdVarArr;
        this.zzo = f20;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.n(parcel, 2, this.zzb);
        c.k(parcel, 3, this.zzc);
        c.k(parcel, 4, this.zzd);
        c.k(parcel, 5, this.zze);
        c.k(parcel, 6, this.zzf);
        c.k(parcel, 7, this.zzg);
        c.k(parcel, 8, this.zzh);
        c.y(parcel, 9, this.zzj, i10, false);
        c.k(parcel, 10, this.zzk);
        c.k(parcel, 11, this.zzl);
        c.k(parcel, 12, this.zzm);
        c.y(parcel, 13, this.zzn, i10, false);
        c.k(parcel, 14, this.zzi);
        c.k(parcel, 15, this.zzo);
        c.b(parcel, iA);
    }
}
