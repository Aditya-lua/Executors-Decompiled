package g7;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<p7.e>> f17467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, k0> f17468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, m7.c> f17470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<m7.h> f17471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w1.k<m7.d> f17472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w1.g<p7.e> f17473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<p7.e> f17474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f17475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f17477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f17478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17479o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17482r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f17466a = new u0();
    public final HashSet<String> b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17480p = 0;

    public void a(String str) {
        t7.e.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.f17475k;
    }

    public w1.k<m7.d> c() {
        return this.f17472h;
    }

    public float d() {
        return (long) ((e() / this.f17478n) * 1000.0f);
    }

    public float e() {
        return this.f17477m - this.f17476l;
    }

    public float f() {
        return this.f17477m;
    }

    public Map<String, m7.c> g() {
        return this.f17470f;
    }

    public float h(float f10) {
        return t7.j.i(this.f17476l, this.f17477m, f10);
    }

    public float i() {
        return this.f17478n;
    }

    public Map<String, k0> j() {
        float fE = t7.m.e();
        if (fE != this.f17469e) {
            for (Map.Entry<String, k0> entry : this.f17468d.entrySet()) {
                this.f17468d.put(entry.getKey(), entry.getValue().a(this.f17469e / fE));
            }
        }
        this.f17469e = fE;
        return this.f17468d;
    }

    public List<p7.e> k() {
        return this.f17474j;
    }

    public m7.h l(String str) {
        int size = this.f17471g.size();
        for (int i10 = 0; i10 < size; i10++) {
            m7.h hVar = this.f17471g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f17480p;
    }

    public u0 n() {
        return this.f17466a;
    }

    public List<p7.e> o(String str) {
        return this.f17467c.get(str);
    }

    public float p() {
        return this.f17476l;
    }

    public boolean q() {
        return this.f17479o;
    }

    public void r(int i10) {
        this.f17480p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<p7.e> list, w1.g<p7.e> gVar, Map<String, List<p7.e>> map, Map<String, k0> map2, float f13, w1.k<m7.d> kVar, Map<String, m7.c> map3, List<m7.h> list2, int i10, int i11) {
        this.f17475k = rect;
        this.f17476l = f10;
        this.f17477m = f11;
        this.f17478n = f12;
        this.f17474j = list;
        this.f17473i = gVar;
        this.f17467c = map;
        this.f17468d = map2;
        this.f17469e = f13;
        this.f17472h = kVar;
        this.f17470f = map3;
        this.f17471g = list2;
        this.f17481q = i10;
        this.f17482r = i11;
    }

    public p7.e t(long j10) {
        return this.f17473i.e(j10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<p7.e> it = this.f17474j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f17479o = z10;
    }

    public void v(boolean z10) {
        this.f17466a.b(z10);
    }
}
