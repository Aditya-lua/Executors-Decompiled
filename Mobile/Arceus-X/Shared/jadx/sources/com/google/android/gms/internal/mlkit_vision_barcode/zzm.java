package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, this.zza, false);
        C9718b.m38478v(parcel, 3, this.zzb, false);
        C9718b.m38478v(parcel, 4, this.zzc, false);
        C9718b.m38478v(parcel, 5, this.zzd, false);
        C9718b.m38478v(parcel, 6, this.zze, false);
        C9718b.m38478v(parcel, 7, this.zzf, false);
        C9718b.m38478v(parcel, 8, this.zzg, false);
        C9718b.m38478v(parcel, 9, this.zzh, false);
        C9718b.m38478v(parcel, 10, this.zzi, false);
        C9718b.m38478v(parcel, 11, this.zzj, false);
        C9718b.m38478v(parcel, 12, this.zzk, false);
        C9718b.m38478v(parcel, 13, this.zzl, false);
        C9718b.m38478v(parcel, 14, this.zzm, false);
        C9718b.m38478v(parcel, 15, this.zzn, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
