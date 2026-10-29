package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxq> CREATOR = new zzyf();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final boolean zzg;
    private final String zzh;

    public zzxq(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = z10;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38470n(parcel, 2, this.zzb);
        C9718b.m38470n(parcel, 3, this.zzc);
        C9718b.m38470n(parcel, 4, this.zzd);
        C9718b.m38470n(parcel, 5, this.zze);
        C9718b.m38470n(parcel, 6, this.zzf);
        C9718b.m38459c(parcel, 7, this.zzg);
        C9718b.m38478v(parcel, 8, this.zzh, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzg;
    }
}
