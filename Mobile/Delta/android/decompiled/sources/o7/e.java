package o7;

import java.util.List;
import java.util.Locale;
import m7.j;
import m7.k;
import m7.n;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n7.c> f27816a;
    public final f7.i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f27819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<n7.i> f27822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f27823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f27827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f27828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f27830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f27831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f27832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m7.b f27833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<t7.a<Float>> f27834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f27835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f27836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n7.a f27837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q7.j f27838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n7.h f27839y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<n7.c> list, f7.i iVar, String str, long j10, a aVar, long j11, String str2, List<n7.i> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<t7.a<Float>> list3, b bVar, m7.b bVar2, boolean z10, n7.a aVar2, q7.j jVar2, n7.h hVar) {
        this.f27816a = list;
        this.b = iVar;
        this.f27817c = str;
        this.f27818d = j10;
        this.f27819e = aVar;
        this.f27820f = j11;
        this.f27821g = str2;
        this.f27822h = list2;
        this.f27823i = nVar;
        this.f27824j = i10;
        this.f27825k = i11;
        this.f27826l = i12;
        this.f27827m = f10;
        this.f27828n = f11;
        this.f27829o = f12;
        this.f27830p = f13;
        this.f27831q = jVar;
        this.f27832r = kVar;
        this.f27834t = list3;
        this.f27835u = bVar;
        this.f27833s = bVar2;
        this.f27836v = z10;
        this.f27837w = aVar2;
        this.f27838x = jVar2;
        this.f27839y = hVar;
    }

    public n7.h a() {
        return this.f27839y;
    }

    public n7.a b() {
        return this.f27837w;
    }

    public f7.i c() {
        return this.b;
    }

    public q7.j d() {
        return this.f27838x;
    }

    public long e() {
        return this.f27818d;
    }

    public List<t7.a<Float>> f() {
        return this.f27834t;
    }

    public a g() {
        return this.f27819e;
    }

    public List<n7.i> h() {
        return this.f27822h;
    }

    public b i() {
        return this.f27835u;
    }

    public String j() {
        return this.f27817c;
    }

    public long k() {
        return this.f27820f;
    }

    public float l() {
        return this.f27830p;
    }

    public float m() {
        return this.f27829o;
    }

    public String n() {
        return this.f27821g;
    }

    public List<n7.c> o() {
        return this.f27816a;
    }

    public int p() {
        return this.f27826l;
    }

    public int q() {
        return this.f27825k;
    }

    public int r() {
        return this.f27824j;
    }

    public float s() {
        return this.f27828n / this.b.e();
    }

    public j t() {
        return this.f27831q;
    }

    public String toString() {
        return z("");
    }

    public k u() {
        return this.f27832r;
    }

    public m7.b v() {
        return this.f27833s;
    }

    public float w() {
        return this.f27827m;
    }

    public n x() {
        return this.f27823i;
    }

    public boolean y() {
        return this.f27836v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e eVarT = this.b.t(k());
        if (eVarT != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarT.j());
            e eVarT2 = this.b.t(eVarT.k());
            while (eVarT2 != null) {
                sb2.append("->");
                sb2.append(eVarT2.j());
                eVarT2 = this.b.t(eVarT2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f27816a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (n7.c cVar : this.f27816a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
