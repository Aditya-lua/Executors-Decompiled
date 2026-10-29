package h7;

import android.graphics.Path;
import f7.h0;
import f7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r implements m, i7.a.b, k {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f18701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.m f18702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18703f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18699a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f18704g = new b();

    public r(h0 h0Var, o7.b bVar, n7.r rVar) {
        this.b = rVar.b();
        this.f18700c = rVar.d();
        this.f18701d = h0Var;
        i7.m mVarA = rVar.c().a();
        this.f18702e = mVarA;
        bVar.j(mVarA);
        mVarA.a(this);
    }

    private void f() {
        this.f18703f = false;
        this.f18701d.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == n7.t.a.SIMULTANEOUSLY) {
                    this.f18704g.a(uVar);
                    uVar.c(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    s sVar = (s) cVar;
                    sVar.g(this);
                    arrayList.add(sVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar2 = (s) cVar;
                sVar2.g(this);
                arrayList.add(sVar2);
            }
        }
        this.f18702e.s(arrayList);
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.P) {
            this.f18702e.o(cVar);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.b;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f18703f && !this.f18702e.k()) {
            return this.f18699a;
        }
        this.f18699a.reset();
        if (this.f18700c) {
            this.f18703f = true;
            return this.f18699a;
        }
        Path pathH = this.f18702e.h();
        if (pathH == null) {
            return this.f18699a;
        }
        this.f18699a.set(pathH);
        this.f18699a.setFillType(Path.FillType.EVEN_ODD);
        this.f18704g.b(this.f18699a);
        this.f18703f = true;
        return this.f18699a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
