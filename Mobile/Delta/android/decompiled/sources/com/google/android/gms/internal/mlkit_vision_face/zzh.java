package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    public int zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;
    public float zzf;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.n(parcel, 2, this.zza);
        b.n(parcel, 3, this.zzb);
        b.n(parcel, 4, this.zzc);
        b.c(parcel, 5, this.zzd);
        b.c(parcel, 6, this.zze);
        b.k(parcel, 7, this.zzf);
        b.b(parcel, iA);
    }

    public zzh(int i10, int i11, int i12, boolean z10, boolean z11, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = z11;
        this.zzf = f10;
    }
}
