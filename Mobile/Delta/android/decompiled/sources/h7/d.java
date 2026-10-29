package h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f7.h0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e, m, i7.a.b, l7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.l.a f18595a;
    public final RectF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.l f18596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f18597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f18598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f18599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<c> f18602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f18603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<m> f18604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i7.p f18605l;

    public d(h0 h0Var, o7.b bVar, n7.q qVar, f7.i iVar) {
        this(h0Var, bVar, qVar.c(), qVar.d(), f(h0Var, iVar, bVar, qVar.b()), j(qVar.b()));
    }

    public static List<c> f(h0 h0Var, f7.i iVar, o7.b bVar, List<n7.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(h0Var, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    public static m7.n j(List<n7.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            n7.c cVar = list.get(i10);
            if (cVar instanceof m7.n) {
                return (m7.n) cVar;
            }
        }
        return null;
    }

    @Override // i7.a.b
    public void a() {
        this.f18603j.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f18602i.size());
        arrayList.addAll(list);
        for (int size = this.f18602i.size() - 1; size >= 0; size--) {
            c cVar = this.f18602i.get(size);
            cVar.b(arrayList, this.f18602i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.p pVar = this.f18605l;
        if (pVar != null) {
            pVar.c(t8, cVar);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f18597d.set(matrix);
        i7.p pVar = this.f18605l;
        if (pVar != null) {
            this.f18597d.preConcat(pVar.f());
        }
        this.f18599f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f18602i.size() - 1; size >= 0; size--) {
            c cVar = this.f18602i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(this.f18599f, this.f18597d, z10);
                rectF.union(this.f18599f);
            }
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f18600g;
    }

    @Override // h7.m
    public Path getPath() {
        this.f18597d.reset();
        i7.p pVar = this.f18605l;
        if (pVar != null) {
            this.f18597d.set(pVar.f());
        }
        this.f18598e.reset();
        if (this.f18601h) {
            return this.f18598e;
        }
        for (int size = this.f18602i.size() - 1; size >= 0; size--) {
            c cVar = this.f18602i.get(size);
            if (cVar instanceof m) {
                this.f18598e.addPath(((m) cVar).getPath(), this.f18597d);
            }
        }
        return this.f18598e;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f18602i.size(); i11++) {
                    c cVar = this.f18602i.get(i11);
                    if (cVar instanceof l7.f) {
                        ((l7.f) cVar).h(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f18601h) {
            return;
        }
        this.f18597d.set(matrix);
        i7.p pVar = this.f18605l;
        if (pVar != null) {
            this.f18597d.preConcat(pVar.f());
            i10 = (int) (((((this.f18605l.h() == null ? 100 : this.f18605l.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f18603j.f0() && n() && i10 != 255) || (bVar != null && this.f18603j.g0() && n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(this.b, matrix, true);
            s7.l.a aVar = this.f18595a;
            aVar.f30540a = i10;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            } else {
                aVar.f30542d = null;
            }
            canvas = this.f18596c.j(canvas, this.b, this.f18595a);
        } else if (bVar != null) {
            s7.b bVar2 = new s7.b(bVar);
            bVar2.i(i11);
            bVar = bVar2;
        }
        for (int size = this.f18602i.size() - 1; size >= 0; size--) {
            c cVar = this.f18602i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).i(canvas, this.f18597d, i11, bVar);
            }
        }
        if (z10) {
            this.f18596c.e();
        }
    }

    public List<c> k() {
        return this.f18602i;
    }

    public List<m> l() {
        if (this.f18604k == null) {
            this.f18604k = new ArrayList();
            for (int i10 = 0; i10 < this.f18602i.size(); i10++) {
                c cVar = this.f18602i.get(i10);
                if (cVar instanceof m) {
                    this.f18604k.add((m) cVar);
                }
            }
        }
        return this.f18604k;
    }

    public Matrix m() {
        i7.p pVar = this.f18605l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f18597d.reset();
        return this.f18597d;
    }

    public final boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18602i.size(); i11++) {
            if ((this.f18602i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public d(h0 h0Var, o7.b bVar, String str, boolean z10, List<c> list, m7.n nVar) {
        this.f18595a = new s7.l.a();
        this.b = new RectF();
        this.f18596c = new s7.l();
        this.f18597d = new Matrix();
        this.f18598e = new Path();
        this.f18599f = new RectF();
        this.f18600g = str;
        this.f18603j = h0Var;
        this.f18601h = z10;
        this.f18602i = list;
        if (nVar != null) {
            i7.p pVarB = nVar.b();
            this.f18605l = pVarB;
            pVarB.a(bVar);
            this.f18605l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).f(list.listIterator(list.size()));
        }
    }
}
