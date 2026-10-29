package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new zzve();
    private final String zza;
    private final Rect zzb;
    private final List zzc;
    private final String zzd;
    private final List zze;
    private final float zzf;
    private final float zzg;

    public zzvd(String str, Rect rect, List list, String str2, List list2, float f10, float f11) {
        this.zza = str;
        this.zzb = rect;
        this.zzc = list;
        this.zzd = str2;
        this.zze = list2;
        this.zzf = f10;
        this.zzg = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, str, false);
        C9718b.m38476t(parcel, 2, this.zzb, i10, false);
        C9718b.m38482z(parcel, 3, this.zzc, false);
        C9718b.m38478v(parcel, 4, this.zzd, false);
        C9718b.m38482z(parcel, 5, this.zze, false);
        C9718b.m38467k(parcel, 6, this.zzf);
        C9718b.m38467k(parcel, 7, this.zzg);
        C9718b.m38458b(parcel, iM38457a);
    }

    public final float zza() {
        return this.zzg;
    }

    public final float zzb() {
        return this.zzf;
    }

    public final Rect zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zza;
    }

    public final List zzf() {
        return this.zzc;
    }

    public final List zzg() {
        return this.zze;
    }
}
