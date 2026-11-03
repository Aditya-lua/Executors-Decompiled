package m0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n0.m1;

/* JADX INFO: loaded from: classes.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24302a;
    public l1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f1.h f24303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.h f24304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f24305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f24308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f24309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24310j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ne.x<Void> f24312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24313m = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Integer> f24311k = new ArrayList();

    public v0(n0.k1 k1Var, l1 l1Var, a1 a1Var, ne.x<Void> xVar, int i10) {
        this.f24302a = i10;
        this.b = l1Var;
        this.f24303c = l1Var.m();
        this.f24304d = l1Var.o();
        this.f24307g = l1Var.k();
        this.f24306f = l1Var.n();
        this.f24305e = l1Var.i();
        this.f24308h = l1Var.p();
        this.f24309i = a1Var;
        this.f24310j = String.valueOf(k1Var.hashCode());
        List<m1> listA = k1Var.a();
        Objects.requireNonNull(listA);
        Iterator<m1> it = listA.iterator();
        while (it.hasNext()) {
            this.f24311k.add(Integer.valueOf(it.next().getId()));
        }
        this.f24312l = xVar;
    }

    public ne.x<Void> a() {
        return this.f24312l;
    }

    public Rect b() {
        return this.f24305e;
    }

    public int c() {
        return this.f24307g;
    }

    public g0.f1.h d() {
        return this.f24303c;
    }

    public int e() {
        return this.f24302a;
    }

    public int f() {
        return this.f24306f;
    }

    public g0.f1.h g() {
        return this.f24304d;
    }

    public Matrix h() {
        return this.f24308h;
    }

    public List<Integer> i() {
        return this.f24311k;
    }

    public String j() {
        return this.f24310j;
    }

    public l1 k() {
        return this.b;
    }

    public boolean l() {
        return this.f24309i.h();
    }

    public boolean m() {
        return d() == null && g() == null;
    }

    public void n(g0.h1 h1Var) {
        this.f24309i.f(h1Var);
    }

    public void o(int i10) {
        if (this.f24313m != i10) {
            this.f24313m = i10;
            this.f24309i.a(i10);
        }
    }

    public void p() {
        this.f24309i.c();
    }

    public void q(androidx.camera.core.d dVar) {
        this.f24309i.g(dVar);
    }

    public void r(g0.f1.i iVar) {
        this.f24309i.d(iVar);
    }

    public void s() {
        if (this.f24313m != -1) {
            o(100);
        }
        this.f24309i.i();
    }

    public void t(Bitmap bitmap) {
        this.f24309i.b(bitmap);
    }

    public void u(g0.h1 h1Var) {
        this.f24309i.e(h1Var);
    }
}
