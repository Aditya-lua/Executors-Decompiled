package m1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public class m1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f23831a;

    public m1(r1 r1Var) {
        x2.g.a(r1Var.a());
        this.f23831a = r1Var;
    }

    @Override // m1.r1
    public boolean a() {
        return this.f23831a.a();
    }

    @Override // m1.r1
    public Range<Integer> b(int i10) {
        return this.f23831a.h(i10);
    }

    @Override // m1.r1
    public int c() {
        return this.f23831a.f();
    }

    @Override // m1.r1
    public boolean d(int i10, int i11) {
        return this.f23831a.d(i11, i10);
    }

    @Override // m1.r1
    public int f() {
        return this.f23831a.c();
    }

    @Override // m1.r1
    public Range<Integer> g() {
        return this.f23831a.g();
    }

    @Override // m1.r1
    public Range<Integer> h(int i10) {
        return this.f23831a.b(i10);
    }

    @Override // m1.r1
    public Range<Integer> i() {
        return this.f23831a.j();
    }

    @Override // m1.r1
    public Range<Integer> j() {
        return this.f23831a.i();
    }
}
