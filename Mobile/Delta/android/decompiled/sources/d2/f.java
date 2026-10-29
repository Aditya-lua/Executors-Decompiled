package d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f14331d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14334g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f14329a = null;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14330c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f14332e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14335h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f14336i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14337j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f14338k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f14339l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f14331d = pVar;
    }

    @Override // d2.d
    public void a(d dVar) {
        Iterator<f> it = this.f14339l.iterator();
        while (it.hasNext()) {
            if (!it.next().f14337j) {
                return;
            }
        }
        this.f14330c = true;
        d dVar2 = this.f14329a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f14331d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f14339l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f14337j) {
            g gVar = this.f14336i;
            if (gVar != null) {
                if (!gVar.f14337j) {
                    return;
                } else {
                    this.f14333f = this.f14335h * gVar.f14334g;
                }
            }
            d(fVar.f14334g + this.f14333f);
        }
        d dVar3 = this.f14329a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f14338k.add(dVar);
        if (this.f14337j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f14339l.clear();
        this.f14338k.clear();
        this.f14337j = false;
        this.f14334g = 0;
        this.f14330c = false;
        this.b = false;
    }

    public void d(int i10) {
        if (this.f14337j) {
            return;
        }
        this.f14337j = true;
        this.f14334g = i10;
        for (d dVar : this.f14338k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14331d.b.t());
        sb2.append(":");
        sb2.append(this.f14332e);
        sb2.append("(");
        sb2.append(this.f14337j ? Integer.valueOf(this.f14334g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f14339l.size());
        sb2.append(":d=");
        sb2.append(this.f14338k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
