package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.e0;

/* JADX INFO: loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzbe f7423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7425i;

    public zzbg(zzbg zzbgVar, long j10) {
        m.l(zzbgVar);
        this.f7422f = zzbgVar.f7422f;
        this.f7423g = zzbgVar.f7423g;
        this.f7424h = zzbgVar.f7424h;
        this.f7425i = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7423g);
        String str = this.f7424h;
        int length = String.valueOf(str).length();
        String str2 = this.f7422f;
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
        e0.a(this, parcel, i10);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j10) {
        this.f7422f = str;
        this.f7423g = zzbeVar;
        this.f7424h = str2;
        this.f7425i = j10;
    }
}
