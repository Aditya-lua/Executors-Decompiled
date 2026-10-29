package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzf(int i10, int i11, int i12, int i13, float f10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 2, i11);
        C9718b.m38470n(parcel, 3, this.zzb);
        C9718b.m38470n(parcel, 4, this.zzc);
        C9718b.m38470n(parcel, 5, this.zzd);
        C9718b.m38467k(parcel, 6, this.zze);
        C9718b.m38458b(parcel, iM38457a);
    }
}
