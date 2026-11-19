package d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f11696d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11699g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f11694a = null;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11695c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f11697e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11700h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f11701i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11702j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<d> f11703k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<f> f11704l = new ArrayList();

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
        this.f11696d = pVar;
    }

    @Override // d2.d
    public void a(d dVar) {
        Iterator<f> it = this.f11704l.iterator();
        while (it.hasNext()) {
            if (!it.next().f11702j) {
                return;
            }
        }
        this.f11695c = true;
        d dVar2 = this.f11694a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f11696d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f11704l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f11702j) {
            g gVar = this.f11701i;
            if (gVar != null) {
                if (!gVar.f11702j) {
                    return;
                } else {
                    this.f11698f = this.f11700h * gVar.f11699g;
                }
            }
            d(fVar.f11699g + this.f11698f);
        }
        d dVar3 = this.f11694a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f11703k.add(dVar);
        if (this.f11702j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f11704l.clear();
        this.f11703k.clear();
        this.f11702j = false;
        this.f11699g = 0;
        this.f11695c = false;
        this.b = false;
    }

    public void d(int i10) {
        if (this.f11702j) {
            return;
        }
        this.f11702j = true;
        this.f11699g = i10;
        for (d dVar : this.f11703k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11696d.b.t());
        sb2.append(":");
        sb2.append(this.f11697e);
        sb2.append("(");
        sb2.append(this.f11702j ? Integer.valueOf(this.f11699g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f11704l.size());
        sb2.append(":d=");
        sb2.append(this.f11703k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
