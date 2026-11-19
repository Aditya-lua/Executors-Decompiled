package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p9.a;
import p9.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzos extends a {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();
    private final int zza;
    private final List zzb;

    public zzos(int i10, List list) {
        this.zza = i10;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.z(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }
}
