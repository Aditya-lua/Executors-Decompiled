package c8;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile u f4932e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8.a f4933a;
    public final m8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.e f4934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.r f4935d;

    public t(m8.a aVar, m8.a aVar2, i8.e eVar, j8.r rVar, j8.v vVar) {
        this.f4933a = aVar;
        this.b = aVar2;
        this.f4934c = eVar;
        this.f4935d = rVar;
        vVar.c();
    }

    public static t c() {
        u uVar = f4932e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set<z7.c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(z7.c.b("proto"));
    }

    public static void f(Context context) {
        if (f4932e == null) {
            synchronized (t.class) {
                try {
                    if (f4932e == null) {
                        f4932e = e.c().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // c8.s
    public void a(n nVar, z7.j jVar) {
        this.f4934c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public final i b(n nVar) {
        return i.a().i(this.f4933a.a()).k(this.b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public j8.r e() {
        return this.f4935d;
    }

    public z7.i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
