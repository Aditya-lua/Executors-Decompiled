package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final zzn[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final String zzd;
    public final float zze;
    public final String zzf;
    public final boolean zzg;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f10, String str2, boolean z10) {
        this.zza = zznVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = str;
        this.zze = f10;
        this.zzf = str2;
        this.zzg = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzn[] zznVarArr = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38481y(parcel, 2, zznVarArr, i10, false);
        C9718b.m38476t(parcel, 3, this.zzb, i10, false);
        C9718b.m38476t(parcel, 4, this.zzc, i10, false);
        C9718b.m38478v(parcel, 5, this.zzd, false);
        C9718b.m38467k(parcel, 6, this.zze);
        C9718b.m38478v(parcel, 7, this.zzf, false);
        C9718b.m38459c(parcel, 8, this.zzg);
        C9718b.m38458b(parcel, iM38457a);
    }
}
