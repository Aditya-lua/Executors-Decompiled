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
    public String f7483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzpl f7485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzbg f7489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zzbg f7491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzbg f7493p;

    public zzah(zzah zzahVar) {
        m.l(zzahVar);
        this.f7483f = zzahVar.f7483f;
        this.f7484g = zzahVar.f7484g;
        this.f7485h = zzahVar.f7485h;
        this.f7486i = zzahVar.f7486i;
        this.f7487j = zzahVar.f7487j;
        this.f7488k = zzahVar.f7488k;
        this.f7489l = zzahVar.f7489l;
        this.f7490m = zzahVar.f7490m;
        this.f7491n = zzahVar.f7491n;
        this.f7492o = zzahVar.f7492o;
        this.f7493p = zzahVar.f7493p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.v(parcel, 2, this.f7483f, false);
        b.v(parcel, 3, this.f7484g, false);
        b.t(parcel, 4, this.f7485h, i10, false);
        b.r(parcel, 5, this.f7486i);
        b.c(parcel, 6, this.f7487j);
        b.v(parcel, 7, this.f7488k, false);
        b.t(parcel, 8, this.f7489l, i10, false);
        b.r(parcel, 9, this.f7490m);
        b.t(parcel, 10, this.f7491n, i10, false);
        b.r(parcel, 11, this.f7492o);
        b.t(parcel, 12, this.f7493p, i10, false);
        b.b(parcel, iA);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.f7483f = str;
        this.f7484g = str2;
        this.f7485h = zzplVar;
        this.f7486i = j10;
        this.f7487j = z10;
        this.f7488k = str3;
        this.f7489l = zzbgVar;
        this.f7490m = j11;
        this.f7491n = zzbgVar2;
        this.f7492o = j12;
        this.f7493p = zzbgVar3;
    }
}
