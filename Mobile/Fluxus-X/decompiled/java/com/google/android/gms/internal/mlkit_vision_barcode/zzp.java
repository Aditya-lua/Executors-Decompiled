package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends p9.a {
    public static final Parcelable.Creator<zzp> CREATOR = new zzac();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.v(parcel, 2, this.zza, false);
        c.v(parcel, 3, this.zzb, false);
        c.v(parcel, 4, this.zzc, false);
        c.v(parcel, 5, this.zzd, false);
        c.v(parcel, 6, this.zze, false);
        c.v(parcel, 7, this.zzf, false);
        c.v(parcel, 8, this.zzg, false);
        c.b(parcel, iA);
    }

    public zzp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }
}
