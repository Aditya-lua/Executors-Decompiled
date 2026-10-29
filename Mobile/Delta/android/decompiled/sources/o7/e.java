package o7;

import java.util.List;
import java.util.Locale;
import m7.j;
import m7.k;
import m7.n;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n7.c> f27251a;
    public final f7.i b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f27254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<n7.i> f27257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f27258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f27259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f27260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f27261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f27262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f27263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f27264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f27265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f27266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f27267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m7.b f27268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<t7.a<Float>> f27269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b f27270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f27271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n7.a f27272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q7.j f27273x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n7.h f27274y;

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
        this.f27251a = list;
        this.b = iVar;
        this.f27252c = str;
        this.f27253d = j10;
        this.f27254e = aVar;
        this.f27255f = j11;
        this.f27256g = str2;
        this.f27257h = list2;
        this.f27258i = nVar;
        this.f27259j = i10;
        this.f27260k = i11;
        this.f27261l = i12;
        this.f27262m = f10;
        this.f27263n = f11;
        this.f27264o = f12;
        this.f27265p = f13;
        this.f27266q = jVar;
        this.f27267r = kVar;
        this.f27269t = list3;
        this.f27270u = bVar;
        this.f27268s = bVar2;
        this.f27271v = z10;
        this.f27272w = aVar2;
        this.f27273x = jVar2;
        this.f27274y = hVar;
    }

    public n7.h a() {
        return this.f27274y;
    }

    public n7.a b() {
        return this.f27272w;
    }

    public f7.i c() {
        return this.b;
    }

    public q7.j d() {
        return this.f27273x;
    }

    public long e() {
        return this.f27253d;
    }

    public List<t7.a<Float>> f() {
        return this.f27269t;
    }

    public a g() {
        return this.f27254e;
    }

    public List<n7.i> h() {
        return this.f27257h;
    }

    public b i() {
        return this.f27270u;
    }

    public String j() {
        return this.f27252c;
    }

    public long k() {
        return this.f27255f;
    }

    public float l() {
        return this.f27265p;
    }

    public float m() {
        return this.f27264o;
    }

    public String n() {
        return this.f27256g;
    }

    public List<n7.c> o() {
        return this.f27251a;
    }

    public int p() {
        return this.f27261l;
    }

    public int q() {
        return this.f27260k;
    }

    public int r() {
        return this.f27259j;
    }

    public float s() {
        return this.f27263n / this.b.e();
    }

    public j t() {
        return this.f27266q;
    }

    public String toString() {
        return z("");
    }

    public k u() {
        return this.f27267r;
    }

    public m7.b v() {
        return this.f27268s;
    }

    public float w() {
        return this.f27262m;
    }

    public n x() {
        return this.f27258i;
    }

    public boolean y() {
        return this.f27271v;
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
        if (!this.f27251a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (n7.c cVar : this.f27251a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
