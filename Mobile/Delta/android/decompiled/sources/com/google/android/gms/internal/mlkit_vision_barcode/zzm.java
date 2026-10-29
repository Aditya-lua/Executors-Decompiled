package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzz();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public String zzm;
    public String zzn;

    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 2, this.zza, false);
        b.v(parcel, 3, this.zzb, false);
        b.v(parcel, 4, this.zzc, false);
        b.v(parcel, 5, this.zzd, false);
        b.v(parcel, 6, this.zze, false);
        b.v(parcel, 7, this.zzf, false);
        b.v(parcel, 8, this.zzg, false);
        b.v(parcel, 9, this.zzh, false);
        b.v(parcel, 10, this.zzi, false);
        b.v(parcel, 11, this.zzj, false);
        b.v(parcel, 12, this.zzk, false);
        b.v(parcel, 13, this.zzl, false);
        b.v(parcel, 14, this.zzm, false);
        b.v(parcel, 15, this.zzn, false);
        b.b(parcel, iA);
    }

    public zzm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }
}
