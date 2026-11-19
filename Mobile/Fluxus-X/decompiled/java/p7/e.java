package p7;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import java.util.Locale;
import n7.j;
import n7.k;
import n7.n;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o7.c> f28987a;
    public final g7.i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f28990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<o7.i> f28993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f28994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f28995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f28996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f28997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f28998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f28999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f29000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f29001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f29002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f29003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n7.b f29004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<u7.a<Float>> f29005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f29006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f29007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o7.a f29008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r7.j f29009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o7.h f29010y;

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

    public e(List<o7.c> list, g7.i iVar, String str, long j10, a aVar, long j11, String str2, List<o7.i> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<u7.a<Float>> list3, b bVar, n7.b bVar2, boolean z10, o7.a aVar2, r7.j jVar2, o7.h hVar) {
        this.f28987a = list;
        this.b = iVar;
        this.f28988c = str;
        this.f28989d = j10;
        this.f28990e = aVar;
        this.f28991f = j11;
        this.f28992g = str2;
        this.f28993h = list2;
        this.f28994i = nVar;
        this.f28995j = i10;
        this.f28996k = i11;
        this.f28997l = i12;
        this.f28998m = f10;
        this.f28999n = f11;
        this.f29000o = f12;
        this.f29001p = f13;
        this.f29002q = jVar;
        this.f29003r = kVar;
        this.f29005t = list3;
        this.f29006u = bVar;
        this.f29004s = bVar2;
        this.f29007v = z10;
        this.f29008w = aVar2;
        this.f29009x = jVar2;
        this.f29010y = hVar;
    }

    public o7.h a() {
        return this.f29010y;
    }

    public o7.a b() {
        return this.f29008w;
    }

    public g7.i c() {
        return this.b;
    }

    public r7.j d() {
        return this.f29009x;
    }

    public long e() {
        return this.f28989d;
    }

    public List<u7.a<Float>> f() {
        return this.f29005t;
    }

    public a g() {
        return this.f28990e;
    }

    public List<o7.i> h() {
        return this.f28993h;
    }

    public b i() {
        return this.f29006u;
    }

    public String j() {
        return this.f28988c;
    }

    public long k() {
        return this.f28991f;
    }

    public float l() {
        return this.f29001p;
    }

    public float m() {
        return this.f29000o;
    }

    public String n() {
        return this.f28992g;
    }

    public List<o7.c> o() {
        return this.f28987a;
    }

    public int p() {
        return this.f28997l;
    }

    public int q() {
        return this.f28996k;
    }

    public int r() {
        return this.f28995j;
    }

    public float s() {
        return this.f28999n / this.b.e();
    }

    public j t() {
        return this.f29002q;
    }

    public String toString() {
        return z(BuildConfig.FLAVOR);
    }

    public k u() {
        return this.f29003r;
    }

    public n7.b v() {
        return this.f29004s;
    }

    public float w() {
        return this.f28998m;
    }

    public n x() {
        return this.f28994i;
    }

    public boolean y() {
        return this.f29007v;
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
        if (!this.f28987a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (o7.c cVar : this.f28987a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
