package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p306nb.C9054e0;

/* JADX INFO: loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new C9054e0();

    /* JADX INFO: renamed from: f */
    public final String f9502f;

    /* JADX INFO: renamed from: g */
    public final zzbe f9503g;

    /* JADX INFO: renamed from: h */
    public final String f9504h;

    /* JADX INFO: renamed from: i */
    public final long f9505i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzbg(zzbg zzbgVar, long j10) {
        C8953m.m36047l(zzbgVar);
        this.f9502f = zzbgVar.f9502f;
        this.f9503g = zzbgVar.f9503g;
        this.f9504h = zzbgVar.f9504h;
        this.f9505i = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9503g);
        String str = this.f9504h;
        int length = String.valueOf(str).length();
        String str2 = this.f9502f;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(strValueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C9054e0.m36287a(this, parcel, i10);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j10) {
        this.f9502f = str;
        this.f9503g = zzbeVar;
        this.f9504h = str2;
        this.f9505i = j10;
    }
}
