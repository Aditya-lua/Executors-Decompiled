package p121f7;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p266l7.C8004c;
import p266l7.C8005d;
import p266l7.C8009h;
import p324o7.C9712e;
import p431s7.C11189e;
import p431s7.C11194j;
import p431s7.C11197m;
import p504w1.C12283g;
import p504w1.C12287k;

/* JADX INFO: renamed from: f7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C5452i {

    /* JADX INFO: renamed from: c */
    public Map<String, List<C9712e>> f21106c;

    /* JADX INFO: renamed from: d */
    public Map<String, C5457k0> f21107d;

    /* JADX INFO: renamed from: e */
    public float f21108e;

    /* JADX INFO: renamed from: f */
    public Map<String, C8004c> f21109f;

    /* JADX INFO: renamed from: g */
    public List<C8009h> f21110g;

    /* JADX INFO: renamed from: h */
    public C12287k<C8005d> f21111h;

    /* JADX INFO: renamed from: i */
    public C12283g<C9712e> f21112i;

    /* JADX INFO: renamed from: j */
    public List<C9712e> f21113j;

    /* JADX INFO: renamed from: k */
    public Rect f21114k;

    /* JADX INFO: renamed from: l */
    public float f21115l;

    /* JADX INFO: renamed from: m */
    public float f21116m;

    /* JADX INFO: renamed from: n */
    public float f21117n;

    /* JADX INFO: renamed from: o */
    public boolean f21118o;

    /* JADX INFO: renamed from: q */
    public int f21120q;

    /* JADX INFO: renamed from: r */
    public int f21121r;

    /* JADX INFO: renamed from: a */
    public final C5477u0 f21104a = new C5477u0();

    /* JADX INFO: renamed from: b */
    public final HashSet<String> f21105b = new HashSet<>();

    /* JADX INFO: renamed from: p */
    public int f21119p = 0;

    /* JADX INFO: renamed from: a */
    public void m25035a(String str) {
        C11189e.m42153c(str);
        this.f21105b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public Rect m25036b() {
        return this.f21114k;
    }

    /* JADX INFO: renamed from: c */
    public C12287k<C8005d> m25037c() {
        return this.f21111h;
    }

    /* JADX INFO: renamed from: d */
    public float m25038d() {
        return (long) ((m25039e() / this.f21117n) * 1000.0f);
    }

    /* JADX INFO: renamed from: e */
    public float m25039e() {
        return this.f21116m - this.f21115l;
    }

    /* JADX INFO: renamed from: f */
    public float m25040f() {
        return this.f21116m;
    }

    /* JADX INFO: renamed from: g */
    public Map<String, C8004c> m25041g() {
        return this.f21109f;
    }

    /* JADX INFO: renamed from: h */
    public float m25042h(float f10) {
        return C11194j.m42191i(this.f21115l, this.f21116m, f10);
    }

    /* JADX INFO: renamed from: i */
    public float m25043i() {
        return this.f21117n;
    }

    /* JADX INFO: renamed from: j */
    public Map<String, C5457k0> m25044j() {
        float fM42216e = C11197m.m42216e();
        if (fM42216e != this.f21108e) {
            for (Map.Entry<String, C5457k0> entry : this.f21107d.entrySet()) {
                this.f21107d.put(entry.getKey(), entry.getValue().m25060a(this.f21108e / fM42216e));
            }
        }
        this.f21108e = fM42216e;
        return this.f21107d;
    }

    /* JADX INFO: renamed from: k */
    public List<C9712e> m25045k() {
        return this.f21113j;
    }

    /* JADX INFO: renamed from: l */
    public C8009h m25046l(String str) {
        int size = this.f21110g.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8009h c8009h = this.f21110g.get(i10);
            if (c8009h.m33088a(str)) {
                return c8009h;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public int m25047m() {
        return this.f21119p;
    }

    /* JADX INFO: renamed from: n */
    public C5477u0 m25048n() {
        return this.f21104a;
    }

    /* JADX INFO: renamed from: o */
    public List<C9712e> m25049o(String str) {
        return this.f21106c.get(str);
    }

    /* JADX INFO: renamed from: p */
    public float m25050p() {
        return this.f21115l;
    }

    /* JADX INFO: renamed from: q */
    public boolean m25051q() {
        return this.f21118o;
    }

    /* JADX INFO: renamed from: r */
    public void m25052r(int i10) {
        this.f21119p += i10;
    }

    /* JADX INFO: renamed from: s */
    public void m25053s(Rect rect, float f10, float f11, float f12, List<C9712e> list, C12283g<C9712e> c12283g, Map<String, List<C9712e>> map, Map<String, C5457k0> map2, float f13, C12287k<C8005d> c12287k, Map<String, C8004c> map3, List<C8009h> list2, int i10, int i11) {
        this.f21114k = rect;
        this.f21115l = f10;
        this.f21116m = f11;
        this.f21117n = f12;
        this.f21113j = list;
        this.f21112i = c12283g;
        this.f21106c = map;
        this.f21107d = map2;
        this.f21108e = f13;
        this.f21111h = c12287k;
        this.f21109f = map3;
        this.f21110g = list2;
        this.f21120q = i10;
        this.f21121r = i11;
    }

    /* JADX INFO: renamed from: t */
    public C9712e m25054t(long j10) {
        return this.f21112i.m45601e(j10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<C9712e> it = this.f21113j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().m38397z("\t"));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public void m25055u(boolean z10) {
        this.f21118o = z10;
    }

    /* JADX INFO: renamed from: v */
    public void m25056v(boolean z10) {
        this.f21104a.m25123b(z10);
    }
}
