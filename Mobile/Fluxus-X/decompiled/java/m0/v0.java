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
    public final int f22662a;
    public l1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0.f1.h f22663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0.f1.h f22664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f22665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f22668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f22669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22670j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pe.x<Void> f22672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22673m = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<Integer> f22671k = new ArrayList();

    public v0(n0.k1 k1Var, l1 l1Var, a1 a1Var, pe.x<Void> xVar, int i10) {
        this.f22662a = i10;
        this.b = l1Var;
        this.f22663c = l1Var.m();
        this.f22664d = l1Var.o();
        this.f22667g = l1Var.k();
        this.f22666f = l1Var.n();
        this.f22665e = l1Var.i();
        this.f22668h = l1Var.p();
        this.f22669i = a1Var;
        this.f22670j = String.valueOf(k1Var.hashCode());
        List<m1> listA = k1Var.a();
        Objects.requireNonNull(listA);
        Iterator<m1> it = listA.iterator();
        while (it.hasNext()) {
            this.f22671k.add(Integer.valueOf(it.next().getId()));
        }
        this.f22672l = xVar;
    }

    public pe.x<Void> a() {
        return this.f22672l;
    }

    public Rect b() {
        return this.f22665e;
    }

    public int c() {
        return this.f22667g;
    }

    public g0.f1.h d() {
        return this.f22663c;
    }

    public int e() {
        return this.f22662a;
    }

    public int f() {
        return this.f22666f;
    }

    public g0.f1.h g() {
        return this.f22664d;
    }

    public Matrix h() {
        return this.f22668h;
    }

    public List<Integer> i() {
        return this.f22671k;
    }

    public String j() {
        return this.f22670j;
    }

    public l1 k() {
        return this.b;
    }

    public boolean l() {
        return this.f22669i.h();
    }

    public boolean m() {
        return d() == null && g() == null;
    }

    public void n(g0.h1 h1Var) {
        this.f22669i.f(h1Var);
    }

    public void o(int i10) {
        if (this.f22673m != i10) {
            this.f22673m = i10;
            this.f22669i.a(i10);
        }
    }

    public void p() {
        this.f22669i.c();
    }

    public void q(androidx.camera.core.d dVar) {
        this.f22669i.g(dVar);
    }

    public void r(g0.f1.i iVar) {
        this.f22669i.d(iVar);
    }

    public void s() {
        if (this.f22673m != -1) {
            o(100);
        }
        this.f22669i.i();
    }

    public void t(Bitmap bitmap) {
        this.f22669i.b(bitmap);
    }

    public void u(g0.h1 h1Var) {
        this.f22669i.e(h1Var);
    }
}
