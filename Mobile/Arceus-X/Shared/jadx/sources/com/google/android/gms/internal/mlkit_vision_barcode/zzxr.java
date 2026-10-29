package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new zzyg();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzxq zzf;
    private final zzxq zzg;

    public zzxr(String str, String str2, String str3, String str4, String str5, zzxq zzxqVar, zzxq zzxqVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzxqVar;
        this.zzg = zzxqVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38478v(parcel, 2, this.zzb, false);
        C9718b.m38478v(parcel, 3, this.zzc, false);
        C9718b.m38478v(parcel, 4, this.zzd, false);
        C9718b.m38478v(parcel, 5, this.zze, false);
        C9718b.m38476t(parcel, 6, this.zzf, i10, false);
        C9718b.m38476t(parcel, 7, this.zzg, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final zzxq zza() {
        return this.zzg;
    }

    public final zzxq zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zza;
    }
}
