package b8;

import android.content.Context;
import i8.w;
import i8.x;
import j8.m0;
import j8.n0;
import j8.u0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ht.a<Executor> f4025a;
    public ht.a<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ht.a f4026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ht.a f4027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ht.a f4028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ht.a<String> f4029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ht.a<m0> f4030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ht.a<i8.f> f4031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ht.a<x> f4032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ht.a<h8.c> f4033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ht.a<i8.r> f4034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ht.a<i8.v> f4035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ht.a<t> f4036m;

    public static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f4037a;

        public b() {
        }

        @Override // b8.u.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b setApplicationContext(Context context) {
            this.f4037a = (Context) d8.d.b(context);
            return this;
        }

        @Override // b8.u.a
        public u build() {
            d8.d.a(this.f4037a, Context.class);
            return new e(this.f4037a);
        }
    }

    public static u.a c() {
        return new b();
    }

    @Override // b8.u
    public j8.d a() {
        return this.f4030g.get();
    }

    @Override // b8.u
    public t b() {
        return this.f4036m.get();
    }

    public final void d(Context context) {
        this.f4025a = d8.a.a(k.a());
        d8.b bVarA = d8.c.a(context);
        this.b = bVarA;
        c8.j jVarA = c8.j.a(bVarA, l8.c.a(), l8.d.a());
        this.f4026c = jVarA;
        this.f4027d = d8.a.a(c8.l.a(this.b, jVarA));
        this.f4028e = u0.a(this.b, j8.g.a(), j8.i.a());
        this.f4029f = d8.a.a(j8.h.a(this.b));
        this.f4030g = d8.a.a(n0.a(l8.c.a(), l8.d.a(), j8.j.a(), this.f4028e, this.f4029f));
        h8.g gVarB = h8.g.b(l8.c.a());
        this.f4031h = gVarB;
        h8.i iVarA = h8.i.a(this.b, this.f4030g, gVarB, l8.d.a());
        this.f4032i = iVarA;
        ht.a<Executor> aVar = this.f4025a;
        ht.a aVar2 = this.f4027d;
        ht.a<m0> aVar3 = this.f4030g;
        this.f4033j = h8.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        ht.a<Context> aVar4 = this.b;
        ht.a aVar5 = this.f4027d;
        ht.a<m0> aVar6 = this.f4030g;
        this.f4034k = i8.s.a(aVar4, aVar5, aVar6, this.f4032i, this.f4025a, aVar6, l8.c.a(), l8.d.a(), this.f4030g);
        ht.a<Executor> aVar7 = this.f4025a;
        ht.a<m0> aVar8 = this.f4030g;
        this.f4035l = w.a(aVar7, aVar8, this.f4032i, aVar8);
        this.f4036m = d8.a.a(v.a(l8.c.a(), l8.d.a(), this.f4033j, this.f4034k, this.f4035l));
    }

    public e(Context context) {
        d(context);
    }
}
