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
    public final int f23652a;
    public l1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f1.h f23653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.h f23654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f23655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f23658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f23659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f23660j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final me.x<Void> f23662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23663m = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Integer> f23661k = new ArrayList();

    public v0(n0.k1 k1Var, l1 l1Var, a1 a1Var, me.x<Void> xVar, int i10) {
        this.f23652a = i10;
        this.b = l1Var;
        this.f23653c = l1Var.m();
        this.f23654d = l1Var.o();
        this.f23657g = l1Var.k();
        this.f23656f = l1Var.n();
        this.f23655e = l1Var.i();
        this.f23658h = l1Var.p();
        this.f23659i = a1Var;
        this.f23660j = String.valueOf(k1Var.hashCode());
        List<m1> listA = k1Var.a();
        Objects.requireNonNull(listA);
        Iterator<m1> it = listA.iterator();
        while (it.hasNext()) {
            this.f23661k.add(Integer.valueOf(it.next().getId()));
        }
        this.f23662l = xVar;
    }

    public me.x<Void> a() {
        return this.f23662l;
    }

    public Rect b() {
        return this.f23655e;
    }

    public int c() {
        return this.f23657g;
    }

    public g0.f1.h d() {
        return this.f23653c;
    }

    public int e() {
        return this.f23652a;
    }

    public int f() {
        return this.f23656f;
    }

    public g0.f1.h g() {
        return this.f23654d;
    }

    public Matrix h() {
        return this.f23658h;
    }

    public List<Integer> i() {
        return this.f23661k;
    }

    public String j() {
        return this.f23660j;
    }

    public l1 k() {
        return this.b;
    }

    public boolean l() {
        return this.f23659i.h();
    }

    public boolean m() {
        return d() == null && g() == null;
    }

    public void n(g0.h1 h1Var) {
        this.f23659i.f(h1Var);
    }

    public void o(int i10) {
        if (this.f23663m != i10) {
            this.f23663m = i10;
            this.f23659i.a(i10);
        }
    }

    public void p() {
        this.f23659i.c();
    }

    public void q(androidx.camera.core.d dVar) {
        this.f23659i.g(dVar);
    }

    public void r(g0.f1.i iVar) {
        this.f23659i.d(iVar);
    }

    public void s() {
        if (this.f23663m != -1) {
            o(100);
        }
        this.f23659i.i();
    }

    public void t(Bitmap bitmap) {
        this.f23659i.b(bitmap);
    }

    public void u(g0.h1 h1Var) {
        this.f23659i.e(h1Var);
    }
}
