package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends p9.a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzy();
    public zzp zza;
    public String zzb;
    public String zzc;
    public zzq[] zzd;
    public zzn[] zze;
    public String[] zzf;
    public zzi[] zzg;

    public zzl() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.t(parcel, 2, this.zza, i10, false);
        c.v(parcel, 3, this.zzb, false);
        c.v(parcel, 4, this.zzc, false);
        c.y(parcel, 5, this.zzd, i10, false);
        c.y(parcel, 6, this.zze, i10, false);
        c.w(parcel, 7, this.zzf, false);
        c.y(parcel, 8, this.zzg, i10, false);
        c.b(parcel, iA);
    }

    public zzl(zzp zzpVar, String str, String str2, zzq[] zzqVarArr, zzn[] zznVarArr, String[] strArr, zzi[] zziVarArr) {
        this.zza = zzpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzqVarArr;
        this.zze = zznVarArr;
        this.zzf = strArr;
        this.zzg = zziVarArr;
    }
}
