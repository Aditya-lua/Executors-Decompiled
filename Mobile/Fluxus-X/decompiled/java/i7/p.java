package i7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g7.h0;
import g7.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e, m, j, j7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f19244a = new Matrix();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f19245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p7.b f19246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j7.a<Float, Float> f19249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j7.a<Float, Float> f19250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j7.p f19251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f19252j;

    public p(h0 h0Var, p7.b bVar, o7.m mVar) {
        this.f19245c = h0Var;
        this.f19246d = bVar;
        this.f19247e = mVar.c();
        this.f19248f = mVar.f();
        j7.d dVarA = mVar.b().a();
        this.f19249g = dVarA;
        bVar.j(dVarA);
        dVarA.a(this);
        j7.d dVarA2 = mVar.d().a();
        this.f19250h = dVarA2;
        bVar.j(dVarA2);
        dVarA2.a(this);
        j7.p pVarB = mVar.e().b();
        this.f19251i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // j7.a.b
    public void a() {
        this.f19245c.invalidateSelf();
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        this.f19252j.b(list, list2);
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f19252j.k().size(); i11++) {
            c cVar = this.f19252j.k().get(i11);
            if (cVar instanceof k) {
                t7.j.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        float fFloatValue = this.f19249g.h().floatValue();
        float fFloatValue2 = this.f19250h.h().floatValue();
        float fFloatValue3 = this.f19251i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f19251i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f19244a.set(matrix);
            float f10 = i11;
            this.f19244a.preConcat(this.f19251i.g(f10 + fFloatValue2));
            this.f19252j.d(canvas, this.f19244a, (int) (i10 * t7.j.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), bVar);
        }
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (this.f19251i.c(t8, cVar)) {
            return;
        }
        if (t8 == o0.f17518u) {
            this.f19249g.o(cVar);
        } else if (t8 == o0.f17519v) {
            this.f19250h.o(cVar);
        }
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f19252j.g(rectF, matrix, z10);
    }

    @Override // i7.c
    public String getName() {
        return this.f19247e;
    }

    @Override // i7.j
    public void h(ListIterator<c> listIterator) {
        if (this.f19252j != null) {
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
        this.f19252j = new d(this.f19245c, this.f19246d, "Repeater", this.f19248f, arrayList, null);
    }

    @Override // i7.m
    public Path x() {
        Path pathX = this.f19252j.x();
        this.b.reset();
        float fFloatValue = this.f19249g.h().floatValue();
        float fFloatValue2 = this.f19250h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f19244a.set(this.f19251i.g(i10 + fFloatValue2));
            this.b.addPath(pathX, this.f19244a);
        }
        return this.b;
    }
}
