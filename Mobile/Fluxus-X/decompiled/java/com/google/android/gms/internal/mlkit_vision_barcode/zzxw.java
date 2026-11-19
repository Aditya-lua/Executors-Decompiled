package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzxw extends p9.a {
    public static final Parcelable.Creator<zzxw> CREATOR = new zzyp();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzxw(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = c.a(parcel);
        c.v(parcel, 1, str, false);
        c.v(parcel, 2, this.zzb, false);
        c.v(parcel, 3, this.zzc, false);
        c.v(parcel, 4, this.zzd, false);
        c.v(parcel, 5, this.zze, false);
        c.v(parcel, 6, this.zzf, false);
        c.v(parcel, 7, this.zzg, false);
        c.b(parcel, iA);
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zze;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzg;
    }
}
