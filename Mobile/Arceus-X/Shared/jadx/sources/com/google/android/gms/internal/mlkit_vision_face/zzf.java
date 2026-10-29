package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38470n(parcel, 2, this.zzb);
        C9718b.m38467k(parcel, 3, this.zzc);
        C9718b.m38467k(parcel, 4, this.zzd);
        C9718b.m38467k(parcel, 5, this.zze);
        C9718b.m38467k(parcel, 6, this.zzf);
        C9718b.m38467k(parcel, 7, this.zzg);
        C9718b.m38467k(parcel, 8, this.zzh);
        C9718b.m38481y(parcel, 9, this.zzj, i10, false);
        C9718b.m38467k(parcel, 10, this.zzk);
        C9718b.m38467k(parcel, 11, this.zzl);
        C9718b.m38467k(parcel, 12, this.zzm);
        C9718b.m38481y(parcel, 13, this.zzn, i10, false);
        C9718b.m38467k(parcel, 14, this.zzi);
        C9718b.m38467k(parcel, 15, this.zzo);
        C9718b.m38458b(parcel, iM38457a);
    }
}
