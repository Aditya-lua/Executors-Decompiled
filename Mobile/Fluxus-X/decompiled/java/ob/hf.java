package ob;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hf extends p9.a {
    public static final Parcelable.Creator<hf> CREATOR = new jf();
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
    public final String f27424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f27428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f27429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f27430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f27431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f27432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f27433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f27434p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f27435q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f27436r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f27437s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f27438t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Boolean f27439u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f27440v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f27441w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f27442x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f27443y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f27444z;

    public hf(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        o9.s.f(str);
        this.f27424f = str;
        this.f27425g = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f27426h = str3;
        this.f27433o = j10;
        this.f27427i = str4;
        this.f27428j = j11;
        this.f27429k = j12;
        this.f27430l = str5;
        this.f27431m = z10;
        this.f27432n = z11;
        this.f27434p = str6;
        this.f27435q = j13;
        this.f27436r = i10;
        this.f27437s = z12;
        this.f27438t = z13;
        this.f27439u = bool;
        this.f27440v = j14;
        this.f27441w = list;
        this.f27442x = str7;
        this.f27443y = str8;
        this.f27444z = str9;
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
        String str = this.f27424f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, str, false);
        p9.c.v(parcel, 3, this.f27425g, false);
        p9.c.v(parcel, 4, this.f27426h, false);
        p9.c.v(parcel, 5, this.f27427i, false);
        p9.c.r(parcel, 6, this.f27428j);
        p9.c.r(parcel, 7, this.f27429k);
        p9.c.v(parcel, 8, this.f27430l, false);
        p9.c.c(parcel, 9, this.f27431m);
        p9.c.c(parcel, 10, this.f27432n);
        p9.c.r(parcel, 11, this.f27433o);
        p9.c.v(parcel, 12, this.f27434p, false);
        p9.c.r(parcel, 14, this.f27435q);
        p9.c.n(parcel, 15, this.f27436r);
        p9.c.c(parcel, 16, this.f27437s);
        p9.c.c(parcel, 18, this.f27438t);
        p9.c.e(parcel, 21, this.f27439u, false);
        p9.c.r(parcel, 22, this.f27440v);
        p9.c.x(parcel, 23, this.f27441w, false);
        p9.c.v(parcel, 25, this.f27442x, false);
        p9.c.v(parcel, 26, this.f27443y, false);
        p9.c.v(parcel, 27, this.f27444z, false);
        p9.c.c(parcel, 28, this.A);
        p9.c.r(parcel, 29, this.B);
        p9.c.n(parcel, 30, this.C);
        p9.c.v(parcel, 31, this.D, false);
        p9.c.n(parcel, 32, this.E);
        p9.c.r(parcel, 34, this.F);
        p9.c.v(parcel, 35, this.G, false);
        p9.c.v(parcel, 36, this.H, false);
        p9.c.r(parcel, 37, this.I);
        p9.c.n(parcel, 38, this.J);
        p9.c.b(parcel, iA);
    }

    public hf(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f27424f = str;
        this.f27425g = str2;
        this.f27426h = str3;
        this.f27433o = j12;
        this.f27427i = str4;
        this.f27428j = j10;
        this.f27429k = j11;
        this.f27430l = str5;
        this.f27431m = z10;
        this.f27432n = z11;
        this.f27434p = str6;
        this.f27435q = j13;
        this.f27436r = i10;
        this.f27437s = z12;
        this.f27438t = z13;
        this.f27439u = bool;
        this.f27440v = j14;
        this.f27441w = list;
        this.f27442x = str7;
        this.f27443y = str8;
        this.f27444z = str9;
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
