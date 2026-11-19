package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzou extends a {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final float zzf;

    public zzou(int i10, int i11, int i12, int i13, boolean z10, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = z10;
        this.zzf = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.n(parcel, 2, this.zzb);
        c.n(parcel, 3, this.zzc);
        c.n(parcel, 4, this.zzd);
        c.c(parcel, 5, this.zze);
        c.k(parcel, 6, this.zzf);
        c.b(parcel, iA);
    }
}
