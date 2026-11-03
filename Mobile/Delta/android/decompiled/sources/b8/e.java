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
    public ft.a<Executor> f3923a;
    public ft.a<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ft.a f3924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ft.a f3925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ft.a f3926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ft.a<String> f3927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ft.a<m0> f3928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ft.a<i8.f> f3929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ft.a<x> f3930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ft.a<h8.c> f3931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ft.a<i8.r> f3932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ft.a<i8.v> f3933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ft.a<t> f3934m;

    public static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f3935a;

        public b() {
        }

        @Override // b8.u.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b setApplicationContext(Context context) {
            this.f3935a = (Context) d8.d.b(context);
            return this;
        }

        @Override // b8.u.a
        public u build() {
            d8.d.a(this.f3935a, Context.class);
            return new e(this.f3935a);
        }
    }

    public static u.a c() {
        return new b();
    }

    @Override // b8.u
    public j8.d a() {
        return this.f3928g.get();
    }

    @Override // b8.u
    public t b() {
        return this.f3934m.get();
    }

    public final void d(Context context) {
        this.f3923a = d8.a.a(k.a());
        d8.b bVarA = d8.c.a(context);
        this.b = bVarA;
        c8.j jVarA = c8.j.a(bVarA, l8.c.a(), l8.d.a());
        this.f3924c = jVarA;
        this.f3925d = d8.a.a(c8.l.a(this.b, jVarA));
        this.f3926e = u0.a(this.b, j8.g.a(), j8.i.a());
        this.f3927f = d8.a.a(j8.h.a(this.b));
        this.f3928g = d8.a.a(n0.a(l8.c.a(), l8.d.a(), j8.j.a(), this.f3926e, this.f3927f));
        h8.g gVarB = h8.g.b(l8.c.a());
        this.f3929h = gVarB;
        h8.i iVarA = h8.i.a(this.b, this.f3928g, gVarB, l8.d.a());
        this.f3930i = iVarA;
        ft.a<Executor> aVar = this.f3923a;
        ft.a aVar2 = this.f3925d;
        ft.a<m0> aVar3 = this.f3928g;
        this.f3931j = h8.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        ft.a<Context> aVar4 = this.b;
        ft.a aVar5 = this.f3925d;
        ft.a<m0> aVar6 = this.f3928g;
        this.f3932k = i8.s.a(aVar4, aVar5, aVar6, this.f3930i, this.f3923a, aVar6, l8.c.a(), l8.d.a(), this.f3928g);
        ft.a<Executor> aVar7 = this.f3923a;
        ft.a<m0> aVar8 = this.f3928g;
        this.f3933l = w.a(aVar7, aVar8, this.f3930i, aVar8);
        this.f3934m = d8.a.a(v.a(l8.c.a(), l8.d.a(), this.f3931j, this.f3932k, this.f3933l));
    }

    public e(Context context) {
        d(context);
    }
}
