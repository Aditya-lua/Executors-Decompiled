package h7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e, m, j, i7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f19174a = new Matrix();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f19175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o7.b f19176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<Float, Float> f19179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i7.a<Float, Float> f19180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i7.p f19181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f19182j;

    public p(h0 h0Var, o7.b bVar, n7.m mVar) {
        this.f19175c = h0Var;
        this.f19176d = bVar;
        this.f19177e = mVar.c();
        this.f19178f = mVar.f();
        i7.d dVarA = mVar.b().a();
        this.f19179g = dVarA;
        bVar.j(dVarA);
        dVarA.a(this);
        i7.d dVarA2 = mVar.d().a();
        this.f19180h = dVarA2;
        bVar.j(dVarA2);
        dVarA2.a(this);
        i7.p pVarB = mVar.e().b();
        this.f19181i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // i7.a.b
    public void a() {
        this.f19175c.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        this.f19182j.b(list, list2);
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (this.f19181i.c(t8, cVar)) {
            return;
        }
        if (t8 == o0.f17035u) {
            this.f19179g.o(cVar);
        } else if (t8 == o0.f17036v) {
            this.f19180h.o(cVar);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19182j.e(rectF, matrix, z10);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        if (this.f19182j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f19182j = new d(this.f19175c, this.f19176d, "Repeater", this.f19178f, arrayList, null);
    }

    @Override // h7.c
    public String getName() {
        return this.f19177e;
    }

    @Override // h7.m
    public Path getPath() {
        Path path = this.f19182j.getPath();
        this.b.reset();
        float fFloatValue = this.f19179g.h().floatValue();
        float fFloatValue2 = this.f19180h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f19174a.set(this.f19181i.g(i10 + fFloatValue2));
            this.b.addPath(path, this.f19174a);
        }
        return this.b;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f19182j.k().size(); i11++) {
            c cVar = this.f19182j.k().get(i11);
            if (cVar instanceof k) {
                s7.j.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        float fFloatValue = this.f19179g.h().floatValue();
        float fFloatValue2 = this.f19180h.h().floatValue();
        float fFloatValue3 = this.f19181i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f19181i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f19174a.set(matrix);
            float f10 = i11;
            this.f19174a.preConcat(this.f19181i.g(f10 + fFloatValue2));
            this.f19182j.i(canvas, this.f19174a, (int) (i10 * s7.j.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), bVar);
        }
    }
}
