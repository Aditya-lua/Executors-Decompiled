package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzn extends AbstractSafeParcelable {
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
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38467k(parcel, 2, this.zzb);
        C9718b.m38467k(parcel, 3, this.zzc);
        C9718b.m38470n(parcel, 4, this.zzd);
        C9718b.m38458b(parcel, iM38457a);
    }
}
