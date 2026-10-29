package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    public final PointF[] zza;
    public final int zzb;

    public zzd(PointF[] pointFArr, int i10) {
        this.zza = pointFArr;
        this.zzb = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.y(parcel, 2, this.zza, i10, false);
        b.n(parcel, 3, this.zzb);
        b.b(parcel, iA);
    }
}
