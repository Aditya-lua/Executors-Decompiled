package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p305n9.C8953m;
import p306nb.C9373xe;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C9373xe();

    /* JADX INFO: renamed from: A */
    public final boolean f9525A;

    /* JADX INFO: renamed from: B */
    public final long f9526B;

    /* JADX INFO: renamed from: C */
    public final int f9527C;

    /* JADX INFO: renamed from: D */
    public final String f9528D;

    /* JADX INFO: renamed from: E */
    public final int f9529E;

    /* JADX INFO: renamed from: F */
    public final long f9530F;

    /* JADX INFO: renamed from: G */
    public final String f9531G;

    /* JADX INFO: renamed from: H */
    public final String f9532H;

    /* JADX INFO: renamed from: I */
    public final long f9533I;

    /* JADX INFO: renamed from: J */
    public final int f9534J;

    /* JADX INFO: renamed from: f */
    public final String f9535f;

    /* JADX INFO: renamed from: g */
    public final String f9536g;

    /* JADX INFO: renamed from: h */
    public final String f9537h;

    /* JADX INFO: renamed from: i */
    public final String f9538i;

    /* JADX INFO: renamed from: j */
    public final long f9539j;

    /* JADX INFO: renamed from: k */
    public final long f9540k;

    /* JADX INFO: renamed from: l */
    public final String f9541l;

    /* JADX INFO: renamed from: m */
    public final boolean f9542m;

    /* JADX INFO: renamed from: n */
    public final boolean f9543n;

    /* JADX INFO: renamed from: o */
    public final long f9544o;

    /* JADX INFO: renamed from: p */
    public final String f9545p;

    /* JADX INFO: renamed from: q */
    public final long f9546q;

    /* JADX INFO: renamed from: r */
    public final int f9547r;

    /* JADX INFO: renamed from: s */
    public final boolean f9548s;

    /* JADX INFO: renamed from: t */
    public final boolean f9549t;

    /* JADX INFO: renamed from: u */
    public final Boolean f9550u;

    /* JADX INFO: renamed from: v */
    public final long f9551v;

    /* JADX INFO: renamed from: w */
    public final List f9552w;

    /* JADX INFO: renamed from: x */
    public final String f9553x;

    /* JADX INFO: renamed from: y */
    public final String f9554y;

    /* JADX INFO: renamed from: z */
    public final String f9555z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zzr(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        C8953m.m36041f(str);
        this.f9535f = str;
        this.f9536g = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f9537h = str3;
        this.f9544o = j10;
        this.f9538i = str4;
        this.f9539j = j11;
        this.f9540k = j12;
        this.f9541l = str5;
        this.f9542m = z10;
        this.f9543n = z11;
        this.f9545p = str6;
        this.f9546q = j13;
        this.f9547r = i10;
        this.f9548s = z12;
        this.f9549t = z13;
        this.f9550u = bool;
        this.f9551v = j14;
        this.f9552w = list;
        this.f9553x = str7;
        this.f9554y = str8;
        this.f9555z = str9;
        this.f9525A = z14;
        this.f9526B = j15;
        this.f9527C = i11;
        this.f9528D = str10;
        this.f9529E = i12;
        this.f9530F = j16;
        this.f9531G = str11;
        this.f9532H = str12;
        this.f9533I = j17;
        this.f9534J = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f9535f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, str, false);
        C9718b.m38478v(parcel, 3, this.f9536g, false);
        C9718b.m38478v(parcel, 4, this.f9537h, false);
        C9718b.m38478v(parcel, 5, this.f9538i, false);
        C9718b.m38474r(parcel, 6, this.f9539j);
        C9718b.m38474r(parcel, 7, this.f9540k);
        C9718b.m38478v(parcel, 8, this.f9541l, false);
        C9718b.m38459c(parcel, 9, this.f9542m);
        C9718b.m38459c(parcel, 10, this.f9543n);
        C9718b.m38474r(parcel, 11, this.f9544o);
        C9718b.m38478v(parcel, 12, this.f9545p, false);
        C9718b.m38474r(parcel, 14, this.f9546q);
        C9718b.m38470n(parcel, 15, this.f9547r);
        C9718b.m38459c(parcel, 16, this.f9548s);
        C9718b.m38459c(parcel, 18, this.f9549t);
        C9718b.m38461e(parcel, 21, this.f9550u, false);
        C9718b.m38474r(parcel, 22, this.f9551v);
        C9718b.m38480x(parcel, 23, this.f9552w, false);
        C9718b.m38478v(parcel, 25, this.f9553x, false);
        C9718b.m38478v(parcel, 26, this.f9554y, false);
        C9718b.m38478v(parcel, 27, this.f9555z, false);
        C9718b.m38459c(parcel, 28, this.f9525A);
        C9718b.m38474r(parcel, 29, this.f9526B);
        C9718b.m38470n(parcel, 30, this.f9527C);
        C9718b.m38478v(parcel, 31, this.f9528D, false);
        C9718b.m38470n(parcel, 32, this.f9529E);
        C9718b.m38474r(parcel, 34, this.f9530F);
        C9718b.m38478v(parcel, 35, this.f9531G, false);
        C9718b.m38478v(parcel, 36, this.f9532H, false);
        C9718b.m38474r(parcel, 37, this.f9533I);
        C9718b.m38470n(parcel, 38, this.f9534J);
        C9718b.m38458b(parcel, iM38457a);
    }

    public zzr(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f9535f = str;
        this.f9536g = str2;
        this.f9537h = str3;
        this.f9544o = j12;
        this.f9538i = str4;
        this.f9539j = j10;
        this.f9540k = j11;
        this.f9541l = str5;
        this.f9542m = z10;
        this.f9543n = z11;
        this.f9545p = str6;
        this.f9546q = j13;
        this.f9547r = i10;
        this.f9548s = z12;
        this.f9549t = z13;
        this.f9550u = bool;
        this.f9551v = j14;
        this.f9552w = list;
        this.f9553x = str7;
        this.f9554y = str8;
        this.f9555z = str9;
        this.f9525A = z14;
        this.f9526B = j15;
        this.f9527C = i11;
        this.f9528D = str10;
        this.f9529E = i12;
        this.f9530F = j16;
        this.f9531G = str11;
        this.f9532H = str12;
        this.f9533I = j17;
        this.f9534J = i13;
    }
}
