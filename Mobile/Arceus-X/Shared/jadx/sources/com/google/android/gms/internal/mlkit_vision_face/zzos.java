package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();
    private final int zza;
    private final List zzb;

    public zzos(int i10, List list) {
        this.zza = i10;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, this.zza);
        C9718b.m38482z(parcel, 2, this.zzb, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }
}
