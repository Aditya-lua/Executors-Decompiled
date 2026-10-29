package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new zzvk();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final float zzd;
    private final float zze;

    public zzvj(String str, Rect rect, List list, float f10, float f11) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = f10;
        this.zze = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38476t(parcel, 2, this.zzb, i10, false);
        C9718b.m38482z(parcel, 3, this.zzc, false);
        C9718b.m38467k(parcel, 4, this.zzd);
        C9718b.m38467k(parcel, 5, this.zze);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final float zza() {
        return this.zze;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }

    public final List zze() {
        return this.zzc;
    }
}
