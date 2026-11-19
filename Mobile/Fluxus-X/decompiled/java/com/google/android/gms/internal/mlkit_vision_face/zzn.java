package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends a {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    public final int zza;
    public final float zzb;
    public final float zzc;
    public final int zzd;

    public zzn(int i10, float f10, float f11, int i11) {
        this.zza = i10;
        this.zzb = f10;
        this.zzc = f11;
        this.zzd = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.k(parcel, 2, this.zzb);
        c.k(parcel, 3, this.zzc);
        c.n(parcel, 4, this.zzd);
        c.b(parcel, iA);
    }
}
