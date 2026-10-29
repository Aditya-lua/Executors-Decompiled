package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzvg();
    private final String zza;
    private final List zzb;

    public zzvf(String str, List list) {
        this.zza = str;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38482z(parcel, 2, this.zzb, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final String zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }
}
