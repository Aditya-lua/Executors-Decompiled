package d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f14311d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14314g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f14309a = null;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14310c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f14312e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14315h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f14316i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14317j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f14318k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f14319l = new ArrayList();

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
        this.f14311d = pVar;
    }

    @Override // d2.d
    public void a(d dVar) {
        Iterator<f> it = this.f14319l.iterator();
        while (it.hasNext()) {
            if (!it.next().f14317j) {
                return;
            }
        }
        this.f14310c = true;
        d dVar2 = this.f14309a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f14311d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f14319l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f14317j) {
            g gVar = this.f14316i;
            if (gVar != null) {
                if (!gVar.f14317j) {
                    return;
                } else {
                    this.f14313f = this.f14315h * gVar.f14314g;
                }
            }
            d(fVar.f14314g + this.f14313f);
        }
        d dVar3 = this.f14309a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f14318k.add(dVar);
        if (this.f14317j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f14319l.clear();
        this.f14318k.clear();
        this.f14317j = false;
        this.f14314g = 0;
        this.f14310c = false;
        this.b = false;
    }

    public void d(int i10) {
        if (this.f14317j) {
            return;
        }
        this.f14317j = true;
        this.f14314g = i10;
        for (d dVar : this.f14318k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14311d.b.t());
        sb2.append(":");
        sb2.append(this.f14312e);
        sb2.append("(");
        sb2.append(this.f14317j ? Integer.valueOf(this.f14314g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f14319l.size());
        sb2.append(":d=");
        sb2.append(this.f14318k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
