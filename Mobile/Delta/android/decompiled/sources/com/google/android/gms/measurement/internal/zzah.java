package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.m;
import nb.h;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzpl f7411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzbg f7415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzbg f7417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzbg f7419p;

    public zzah(zzah zzahVar) {
        m.l(zzahVar);
        this.f7409f = zzahVar.f7409f;
        this.f7410g = zzahVar.f7410g;
        this.f7411h = zzahVar.f7411h;
        this.f7412i = zzahVar.f7412i;
        this.f7413j = zzahVar.f7413j;
        this.f7414k = zzahVar.f7414k;
        this.f7415l = zzahVar.f7415l;
        this.f7416m = zzahVar.f7416m;
        this.f7417n = zzahVar.f7417n;
        this.f7418o = zzahVar.f7418o;
        this.f7419p = zzahVar.f7419p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 2, this.f7409f, false);
        b.v(parcel, 3, this.f7410g, false);
        b.t(parcel, 4, this.f7411h, i10, false);
        b.r(parcel, 5, this.f7412i);
        b.c(parcel, 6, this.f7413j);
        b.v(parcel, 7, this.f7414k, false);
        b.t(parcel, 8, this.f7415l, i10, false);
        b.r(parcel, 9, this.f7416m);
        b.t(parcel, 10, this.f7417n, i10, false);
        b.r(parcel, 11, this.f7418o);
        b.t(parcel, 12, this.f7419p, i10, false);
        b.b(parcel, iA);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.f7409f = str;
        this.f7410g = str2;
        this.f7411h = zzplVar;
        this.f7412i = j10;
        this.f7413j = z10;
        this.f7414k = str3;
        this.f7415l = zzbgVar;
        this.f7416m = j11;
        this.f7417n = zzbgVar2;
        this.f7418o = j12;
        this.f7419p = zzbgVar3;
    }
}
