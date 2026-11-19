package c8;

import android.content.Context;
import j8.w;
import j8.x;
import java.util.concurrent.Executor;
import k8.m0;
import k8.n0;
import k8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yt.a<Executor> f4908a;
    public yt.a<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yt.a f4909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yt.a f4910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yt.a f4911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yt.a<String> f4912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yt.a<m0> f4913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yt.a<j8.f> f4914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yt.a<x> f4915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yt.a<i8.c> f4916j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public yt.a<j8.r> f4917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yt.a<j8.v> f4918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yt.a<t> f4919m;

    public static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f4920a;

        public b() {
        }

        @Override // c8.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f4920a = (Context) e8.d.b(context);
            return this;
        }

        @Override // c8.u.a
        public u build() {
            e8.d.a(this.f4920a, Context.class);
            return new e(this.f4920a);
        }
    }

    public static u.a c() {
        return new b();
    }

    @Override // c8.u
    public k8.d a() {
        return this.f4913g.get();
    }

    @Override // c8.u
    public t b() {
        return this.f4919m.get();
    }

    public final void d(Context context) {
        this.f4908a = e8.a.a(k.a());
        e8.b bVarA = e8.c.a(context);
        this.b = bVarA;
        d8.j jVarA = d8.j.a(bVarA, m8.c.a(), m8.d.a());
        this.f4909c = jVarA;
        this.f4910d = e8.a.a(d8.l.a(this.b, jVarA));
        this.f4911e = u0.a(this.b, k8.g.a(), k8.i.a());
        this.f4912f = e8.a.a(k8.h.a(this.b));
        this.f4913g = e8.a.a(n0.a(m8.c.a(), m8.d.a(), k8.j.a(), this.f4911e, this.f4912f));
        i8.g gVarB = i8.g.b(m8.c.a());
        this.f4914h = gVarB;
        i8.i iVarA = i8.i.a(this.b, this.f4913g, gVarB, m8.d.a());
        this.f4915i = iVarA;
        yt.a<Executor> aVar = this.f4908a;
        yt.a aVar2 = this.f4910d;
        yt.a<m0> aVar3 = this.f4913g;
        this.f4916j = i8.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        yt.a<Context> aVar4 = this.b;
        yt.a aVar5 = this.f4910d;
        yt.a<m0> aVar6 = this.f4913g;
        this.f4917k = j8.s.a(aVar4, aVar5, aVar6, this.f4915i, this.f4908a, aVar6, m8.c.a(), m8.d.a(), this.f4913g);
        yt.a<Executor> aVar7 = this.f4908a;
        yt.a<m0> aVar8 = this.f4913g;
        this.f4918l = w.a(aVar7, aVar8, this.f4915i, aVar8);
        this.f4919m = e8.a.a(v.a(m8.c.a(), m8.d.a(), this.f4916j, this.f4917k, this.f4918l));
    }

    public e(Context context) {
        d(context);
    }
}
