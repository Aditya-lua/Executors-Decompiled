package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzvh extends a {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzvi();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final int zze;
    private final String zzf;
    private final boolean zzg;

    public zzvh(String str, String str2, String str3, boolean z10, int i10, String str4, boolean z11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzf = str4;
        this.zze = i10;
        this.zzd = z10;
        this.zzg = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = c.a(parcel);
        c.v(parcel, 1, str, false);
        c.v(parcel, 2, this.zzb, false);
        c.v(parcel, 3, this.zzc, false);
        c.c(parcel, 4, this.zzd);
        c.n(parcel, 5, this.zze);
        c.v(parcel, 6, this.zzf, false);
        c.c(parcel, 7, this.zzg);
        c.b(parcel, iA);
    }
}
