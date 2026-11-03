package f7;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, List<o7.e>> f16984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, k0> f16985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, l7.c> f16987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<l7.h> f16988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w1.k<l7.d> f16989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w1.g<o7.e> f16990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<o7.e> f16991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f16992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16996o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16999r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f16983a = new u0();
    public final HashSet<String> b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16997p = 0;

    public void a(String str) {
        s7.e.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.f16992k;
    }

    public w1.k<l7.d> c() {
        return this.f16989h;
    }

    public float d() {
        return (long) ((e() / this.f16995n) * 1000.0f);
    }

    public float e() {
        return this.f16994m - this.f16993l;
    }

    public float f() {
        return this.f16994m;
    }

    public Map<String, l7.c> g() {
        return this.f16987f;
    }

    public float h(float f10) {
        return s7.j.i(this.f16993l, this.f16994m, f10);
    }

    public float i() {
        return this.f16995n;
    }

    public Map<String, k0> j() {
        float fE = s7.m.e();
        if (fE != this.f16986e) {
            for (Map.Entry<String, k0> entry : this.f16985d.entrySet()) {
                this.f16985d.put(entry.getKey(), entry.getValue().a(this.f16986e / fE));
            }
        }
        this.f16986e = fE;
        return this.f16985d;
    }

    public List<o7.e> k() {
        return this.f16991j;
    }

    public l7.h l(String str) {
        int size = this.f16988g.size();
        for (int i10 = 0; i10 < size; i10++) {
            l7.h hVar = this.f16988g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f16997p;
    }

    public u0 n() {
        return this.f16983a;
    }

    public List<o7.e> o(String str) {
        return this.f16984c.get(str);
    }

    public float p() {
        return this.f16993l;
    }

    public boolean q() {
        return this.f16996o;
    }

    public void r(int i10) {
        this.f16997p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<o7.e> list, w1.g<o7.e> gVar, Map<String, List<o7.e>> map, Map<String, k0> map2, float f13, w1.k<l7.d> kVar, Map<String, l7.c> map3, List<l7.h> list2, int i10, int i11) {
        this.f16992k = rect;
        this.f16993l = f10;
        this.f16994m = f11;
        this.f16995n = f12;
        this.f16991j = list;
        this.f16990i = gVar;
        this.f16984c = map;
        this.f16985d = map2;
        this.f16986e = f13;
        this.f16989h = kVar;
        this.f16987f = map3;
        this.f16988g = list2;
        this.f16998q = i10;
        this.f16999r = i11;
    }

    public o7.e t(long j10) {
        return this.f16990i.e(j10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<o7.e> it = this.f16991j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f16996o = z10;
    }

    public void v(boolean z10) {
        this.f16983a.b(z10);
    }
}
