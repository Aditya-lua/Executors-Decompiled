package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38481y(parcel, 2, zzrVarArr, i10, false);
        C9718b.m38476t(parcel, 3, this.zzb, i10, false);
        C9718b.m38476t(parcel, 4, this.zzc, i10, false);
        C9718b.m38476t(parcel, 5, this.zzd, i10, false);
        C9718b.m38478v(parcel, 6, this.zze, false);
        C9718b.m38467k(parcel, 7, this.zzf);
        C9718b.m38478v(parcel, 8, this.zzg, false);
        C9718b.m38470n(parcel, 9, this.zzh);
        C9718b.m38459c(parcel, 10, this.zzi);
        C9718b.m38470n(parcel, 11, this.zzj);
        C9718b.m38470n(parcel, 12, this.zzk);
        C9718b.m38458b(parcel, iM38457a);
    }
}
