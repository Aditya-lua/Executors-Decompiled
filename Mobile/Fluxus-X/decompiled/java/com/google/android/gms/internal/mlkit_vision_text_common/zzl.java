package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final zzr[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final zzf zzd;
    public final String zze;
    public final float zzf;
    public final String zzg;
    public final int zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f10, String str2, int i10, boolean z10, int i11, int i12) {
        this.zza = zzrVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = zzfVar3;
        this.zze = str;
        this.zzf = f10;
        this.zzg = str2;
        this.zzh = i10;
        this.zzi = z10;
        this.zzj = i11;
        this.zzk = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzr[] zzrVarArr = this.zza;
        int iA = c.a(parcel);
        c.y(parcel, 2, zzrVarArr, i10, false);
        c.t(parcel, 3, this.zzb, i10, false);
        c.t(parcel, 4, this.zzc, i10, false);
        c.t(parcel, 5, this.zzd, i10, false);
        c.v(parcel, 6, this.zze, false);
        c.k(parcel, 7, this.zzf);
        c.v(parcel, 8, this.zzg, false);
        c.n(parcel, 9, this.zzh);
        c.c(parcel, 10, this.zzi);
        c.n(parcel, 11, this.zzj);
        c.n(parcel, 12, this.zzk);
        c.b(parcel, iA);
    }
}
