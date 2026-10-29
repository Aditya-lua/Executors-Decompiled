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
    public final Matrix f18687a = new Matrix();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f18688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o7.b f18689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<Float, Float> f18692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i7.a<Float, Float> f18693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i7.p f18694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f18695j;

    public p(h0 h0Var, o7.b bVar, n7.m mVar) {
        this.f18688c = h0Var;
        this.f18689d = bVar;
        this.f18690e = mVar.c();
        this.f18691f = mVar.f();
        i7.d dVarA = mVar.b().a();
        this.f18692g = dVarA;
        bVar.j(dVarA);
        dVarA.a(this);
        i7.d dVarA2 = mVar.d().a();
        this.f18693h = dVarA2;
        bVar.j(dVarA2);
        dVarA2.a(this);
        i7.p pVarB = mVar.e().b();
        this.f18694i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // i7.a.b
    public void a() {
        this.f18688c.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        this.f18695j.b(list, list2);
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (this.f18694i.c(t8, cVar)) {
            return;
        }
        if (t8 == o0.f16439u) {
            this.f18692g.o(cVar);
        } else if (t8 == o0.f16440v) {
            this.f18693h.o(cVar);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f18695j.e(rectF, matrix, z10);
    }

    @Override // h7.j
    public void f(ListIterator<c> listIterator) {
        if (this.f18695j != null) {
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
        this.f18695j = new d(this.f18688c, this.f18689d, "Repeater", this.f18691f, arrayList, null);
    }

    @Override // h7.c
    public String getName() {
        return this.f18690e;
    }

    @Override // h7.m
    public Path getPath() {
        Path path = this.f18695j.getPath();
        this.b.reset();
        float fFloatValue = this.f18692g.h().floatValue();
        float fFloatValue2 = this.f18693h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f18687a.set(this.f18694i.g(i10 + fFloatValue2));
            this.b.addPath(path, this.f18687a);
        }
        return this.b;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f18695j.k().size(); i11++) {
            c cVar = this.f18695j.k().get(i11);
            if (cVar instanceof k) {
                s7.j.k(eVar, i10, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        float fFloatValue = this.f18692g.h().floatValue();
        float fFloatValue2 = this.f18693h.h().floatValue();
        float fFloatValue3 = this.f18694i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f18694i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f18687a.set(matrix);
            float f10 = i11;
            this.f18687a.preConcat(this.f18694i.g(f10 + fFloatValue2));
            this.f18695j.i(canvas, this.f18687a, (int) (i10 * s7.j.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), bVar);
        }
    }
}
