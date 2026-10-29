package ak;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f616a = new AtomicBoolean(false);

    public static vk.b a() {
        gk.f fVar = new gk.f();
        String strH = sg.a1.H();
        String strF = sg.a1.F();
        return new vk.b(sg.a1.O(), fVar.b(strH), strF != null ? fVar.b(strF) : "api");
    }

    public static void b(Context context) {
        if (f616a.compareAndSet(false, true)) {
            vk.g.j(sg.a1.Z0());
            vk.g.g(a());
            vk.g.f(new ei.t());
            vk.g.h(new wk.c());
        }
    }

    public static void c(Context context) {
        sg.a1.i0(context, new gh.d(context).a(context));
    }
}
