package ik;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f19582a = new AtomicBoolean(false);

    public static cl.b a() {
        ok.f fVar = new ok.f();
        String strH = bh.a1.H();
        String strF = bh.a1.F();
        return new cl.b(bh.a1.O(), fVar.b(strH), strF != null ? fVar.b(strF) : "api");
    }

    public static void b(Context context) {
        if (f19582a.compareAndSet(false, true)) {
            cl.g.j(bh.a1.a1());
            cl.g.g(a());
            cl.g.f(new mi.t());
            cl.g.h(new dl.c());
        }
    }

    public static void c(Context context) {
        bh.a1.i0(context, new ph.d(context).a(context));
    }
}
