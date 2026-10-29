package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzx();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public zzj zzf;
    public zzj zzg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, this.zza, false);
        C9718b.m38478v(parcel, 3, this.zzb, false);
        C9718b.m38478v(parcel, 4, this.zzc, false);
        C9718b.m38478v(parcel, 5, this.zzd, false);
        C9718b.m38478v(parcel, 6, this.zze, false);
        C9718b.m38476t(parcel, 7, this.zzf, i10, false);
        C9718b.m38476t(parcel, 8, this.zzg, i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzk(String str, String str2, String str3, String str4, String str5, zzj zzjVar, zzj zzjVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzjVar;
        this.zzg = zzjVar2;
    }
}
