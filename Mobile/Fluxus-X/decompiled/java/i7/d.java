package i7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g7.h0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e, m, j7.a.b, m7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.l.a f19152a;
    public final RectF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7.l f19153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f19154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f19155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f19156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<c> f19159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f19160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<m> f19161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j7.p f19162l;

    public d(h0 h0Var, p7.b bVar, o7.q qVar, g7.i iVar) {
        this(h0Var, bVar, qVar.c(), qVar.d(), h(h0Var, iVar, bVar, qVar.b()), j(qVar.b()));
    }

    public static List<c> h(h0 h0Var, g7.i iVar, p7.b bVar, List<o7.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVarA = list.get(i10).a(h0Var, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    public static n7.n j(List<o7.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            o7.c cVar = list.get(i10);
            if (cVar instanceof n7.n) {
                return (n7.n) cVar;
            }
        }
        return null;
    }

    @Override // j7.a.b
    public void a() {
        this.f19160j.invalidateSelf();
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f19159i.size());
        arrayList.addAll(list);
        for (int size = this.f19159i.size() - 1; size >= 0; size--) {
            c cVar = this.f19159i.get(size);
            cVar.b(arrayList, this.f19159i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f19159i.size(); i11++) {
                    c cVar = this.f19159i.get(i11);
                    if (cVar instanceof m7.f) {
                        ((m7.f) cVar).c(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (this.f19158h) {
            return;
        }
        this.f19154d.set(matrix);
        j7.p pVar = this.f19162l;
        if (pVar != null) {
            this.f19154d.preConcat(pVar.f());
            i10 = (int) (((((this.f19162l.h() == null ? 100 : this.f19162l.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = (this.f19160j.f0() && n() && i10 != 255) || (bVar != null && this.f19160j.g0() && n());
        int i11 = z10 ? 255 : i10;
        if (z10) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            g(this.b, matrix, true);
            t7.l.a aVar = this.f19152a;
            aVar.f32193a = i10;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            } else {
                aVar.f32195d = null;
            }
            canvas = this.f19153c.j(canvas, this.b, this.f19152a);
        } else if (bVar != null) {
            t7.b bVar2 = new t7.b(bVar);
            bVar2.i(i11);
            bVar = bVar2;
        }
        for (int size = this.f19159i.size() - 1; size >= 0; size--) {
            c cVar = this.f19159i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).d(canvas, this.f19154d, i11, bVar);
            }
        }
        if (z10) {
            this.f19153c.e();
        }
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        j7.p pVar = this.f19162l;
        if (pVar != null) {
            pVar.c(t8, cVar);
        }
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f19154d.set(matrix);
        j7.p pVar = this.f19162l;
        if (pVar != null) {
            this.f19154d.preConcat(pVar.f());
        }
        this.f19156f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f19159i.size() - 1; size >= 0; size--) {
            c cVar = this.f19159i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).g(this.f19156f, this.f19154d, z10);
                rectF.union(this.f19156f);
            }
        }
    }

    @Override // i7.c
    public String getName() {
        return this.f19157g;
    }

    public List<c> k() {
        return this.f19159i;
    }

    public List<m> l() {
        if (this.f19161k == null) {
            this.f19161k = new ArrayList();
            for (int i10 = 0; i10 < this.f19159i.size(); i10++) {
                c cVar = this.f19159i.get(i10);
                if (cVar instanceof m) {
                    this.f19161k.add((m) cVar);
                }
            }
        }
        return this.f19161k;
    }

    public Matrix m() {
        j7.p pVar = this.f19162l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f19154d.reset();
        return this.f19154d;
    }

    public final boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19159i.size(); i11++) {
            if ((this.f19159i.get(i11) instanceof e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // i7.m
    public Path x() {
        this.f19154d.reset();
        j7.p pVar = this.f19162l;
        if (pVar != null) {
            this.f19154d.set(pVar.f());
        }
        this.f19155e.reset();
        if (this.f19158h) {
            return this.f19155e;
        }
        for (int size = this.f19159i.size() - 1; size >= 0; size--) {
            c cVar = this.f19159i.get(size);
            if (cVar instanceof m) {
                this.f19155e.addPath(((m) cVar).x(), this.f19154d);
            }
        }
        return this.f19155e;
    }

    public d(h0 h0Var, p7.b bVar, String str, boolean z10, List<c> list, n7.n nVar) {
        this.f19152a = new t7.l.a();
        this.b = new RectF();
        this.f19153c = new t7.l();
        this.f19154d = new Matrix();
        this.f19155e = new Path();
        this.f19156f = new RectF();
        this.f19157g = str;
        this.f19160j = h0Var;
        this.f19158h = z10;
        this.f19159i = list;
        if (nVar != null) {
            j7.p pVarB = nVar.b();
            this.f19162l = pVarB;
            pVarB.a(bVar);
            this.f19162l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).h(list.listIterator(list.size()));
        }
    }
}
