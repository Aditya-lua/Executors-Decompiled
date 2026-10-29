package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzou extends AbstractSafeParcelable {
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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38470n(parcel, 2, this.zzb);
        C9718b.m38470n(parcel, 3, this.zzc);
        C9718b.m38470n(parcel, 4, this.zzd);
        C9718b.m38459c(parcel, 5, this.zze);
        C9718b.m38467k(parcel, 6, this.zzf);
        C9718b.m38458b(parcel, iM38457a);
    }
}
