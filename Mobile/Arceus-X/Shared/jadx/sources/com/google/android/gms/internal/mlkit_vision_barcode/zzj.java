package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzw();
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 2, this.zza);
        C9718b.m38470n(parcel, 3, this.zzb);
        C9718b.m38470n(parcel, 4, this.zzc);
        C9718b.m38470n(parcel, 5, this.zzd);
        C9718b.m38470n(parcel, 6, this.zze);
        C9718b.m38470n(parcel, 7, this.zzf);
        C9718b.m38459c(parcel, 8, this.zzg);
        C9718b.m38478v(parcel, 9, this.zzh, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public zzj(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = z10;
        this.zzh = str;
    }
}
