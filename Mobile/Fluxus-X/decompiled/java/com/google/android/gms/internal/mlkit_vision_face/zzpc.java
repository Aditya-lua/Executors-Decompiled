package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzpc extends a {
    public static final Parcelable.Creator<zzpc> CREATOR = new zzpd();
    private final int zza;
    private final PointF zzb;

    public zzpc(int i10, PointF pointF) {
        this.zza = i10;
        this.zzb = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.t(parcel, 2, this.zzb, i10, false);
        c.b(parcel, iA);
    }

    public final int zza() {
        return this.zza;
    }

    public final PointF zzb() {
        return this.zzb;
    }
}
