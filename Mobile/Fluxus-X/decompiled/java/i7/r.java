package i7;

import android.graphics.Path;
import g7.h0;
import g7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r implements m, j7.a.b, k {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f19258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j7.m f19259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19260f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19256a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f19261g = new b();

    public r(h0 h0Var, p7.b bVar, o7.r rVar) {
        this.b = rVar.b();
        this.f19257c = rVar.d();
        this.f19258d = h0Var;
        j7.m mVarA = rVar.c().a();
        this.f19259e = mVarA;
        bVar.j(mVarA);
        mVarA.a(this);
    }

    private void h() {
        this.f19260f = false;
        this.f19258d.invalidateSelf();
    }

    @Override // j7.a.b
    public void a() {
        h();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == o7.t.a.SIMULTANEOUSLY) {
                    this.f19261g.a(uVar);
                    uVar.c(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    s sVar = (s) cVar;
                    sVar.i(this);
                    arrayList.add(sVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar2 = (s) cVar;
                sVar2.i(this);
                arrayList.add(sVar2);
            }
        }
        this.f19259e.s(arrayList);
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.P) {
            this.f19259e.o(cVar);
        }
    }

    @Override // i7.c
    public String getName() {
        return this.b;
    }

    @Override // i7.m
    public Path x() {
        if (this.f19260f && !this.f19259e.k()) {
            return this.f19256a;
        }
        this.f19256a.reset();
        if (this.f19257c) {
            this.f19260f = true;
            return this.f19256a;
        }
        Path pathH = this.f19259e.h();
        if (pathH == null) {
            return this.f19256a;
        }
        this.f19256a.set(pathH);
        this.f19256a.setFillType(Path.FillType.EVEN_ODD);
        this.f19261g.b(this.f19256a);
        this.f19260f = true;
        return this.f19256a;
    }
}
