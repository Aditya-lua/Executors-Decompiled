package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import n9.m;
import nb.xe;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new xe();
    public final boolean A;
    public final long B;
    public final int C;
    public final String D;
    public final int E;
    public final long F;
    public final String G;
    public final String H;
    public final long I;
    public final int J;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f7520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7527n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f7528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f7529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f7530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f7532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7533t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f7534u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7535v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f7536w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7537x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f7538y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f7539z;

    public zzr(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        m.f(str);
        this.f7519f = str;
        this.f7520g = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f7521h = str3;
        this.f7528o = j10;
        this.f7522i = str4;
        this.f7523j = j11;
        this.f7524k = j12;
        this.f7525l = str5;
        this.f7526m = z10;
        this.f7527n = z11;
        this.f7529p = str6;
        this.f7530q = j13;
        this.f7531r = i10;
        this.f7532s = z12;
        this.f7533t = z13;
        this.f7534u = bool;
        this.f7535v = j14;
        this.f7536w = list;
        this.f7537x = str7;
        this.f7538y = str8;
        this.f7539z = str9;
        this.A = z14;
        this.B = j15;
        this.C = i11;
        this.D = str10;
        this.E = i12;
        this.F = j16;
        this.G = str11;
        this.H = str12;
        this.I = j17;
        this.J = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f7519f;
        int iA = b.a(parcel);
        b.v(parcel, 2, str, false);
        b.v(parcel, 3, this.f7520g, false);
        b.v(parcel, 4, this.f7521h, false);
        b.v(parcel, 5, this.f7522i, false);
        b.r(parcel, 6, this.f7523j);
        b.r(parcel, 7, this.f7524k);
        b.v(parcel, 8, this.f7525l, false);
        b.c(parcel, 9, this.f7526m);
        b.c(parcel, 10, this.f7527n);
        b.r(parcel, 11, this.f7528o);
        b.v(parcel, 12, this.f7529p, false);
        b.r(parcel, 14, this.f7530q);
        b.n(parcel, 15, this.f7531r);
        b.c(parcel, 16, this.f7532s);
        b.c(parcel, 18, this.f7533t);
        b.e(parcel, 21, this.f7534u, false);
        b.r(parcel, 22, this.f7535v);
        b.x(parcel, 23, this.f7536w, false);
        b.v(parcel, 25, this.f7537x, false);
        b.v(parcel, 26, this.f7538y, false);
        b.v(parcel, 27, this.f7539z, false);
        b.c(parcel, 28, this.A);
        b.r(parcel, 29, this.B);
        b.n(parcel, 30, this.C);
        b.v(parcel, 31, this.D, false);
        b.n(parcel, 32, this.E);
        b.r(parcel, 34, this.F);
        b.v(parcel, 35, this.G, false);
        b.v(parcel, 36, this.H, false);
        b.r(parcel, 37, this.I);
        b.n(parcel, 38, this.J);
        b.b(parcel, iA);
    }

    public zzr(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f7519f = str;
        this.f7520g = str2;
        this.f7521h = str3;
        this.f7528o = j12;
        this.f7522i = str4;
        this.f7523j = j10;
        this.f7524k = j11;
        this.f7525l = str5;
        this.f7526m = z10;
        this.f7527n = z11;
        this.f7529p = str6;
        this.f7530q = j13;
        this.f7531r = i10;
        this.f7532s = z12;
        this.f7533t = z13;
        this.f7534u = bool;
        this.f7535v = j14;
        this.f7536w = list;
        this.f7537x = str7;
        this.f7538y = str8;
        this.f7539z = str9;
        this.A = z14;
        this.B = j15;
        this.C = i11;
        this.D = str10;
        this.E = i12;
        this.F = j16;
        this.G = str11;
        this.H = str12;
        this.I = j17;
        this.J = i13;
    }
}
