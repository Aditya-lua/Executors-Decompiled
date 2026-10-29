package p015ak;

import android.content.Context;
import gh.C6099d;
import java.util.concurrent.atomic.AtomicBoolean;
import p104ei.C5142t;
import p151gk.C6113f;
import p493vk.C12220b;
import p493vk.C12225g;
import p520wk.C12481c;
import sg.C11295a1;

/* JADX INFO: renamed from: ak.l2 */
/* JADX INFO: loaded from: classes2.dex */
public class C0311l2 {

    /* JADX INFO: renamed from: a */
    public static AtomicBoolean f812a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static C12220b m1314a() {
        C6113f c6113f = new C6113f();
        String strM42396H = C11295a1.m42396H();
        String strM42392F = C11295a1.m42392F();
        return new C12220b(C11295a1.m42410O(), c6113f.m27030b(strM42396H), strM42392F != null ? c6113f.m27030b(strM42392F) : "api");
    }

    /* JADX INFO: renamed from: b */
    public static void m1315b(Context context) {
        if (f812a.compareAndSet(false, true)) {
            C12225g.m45332j(C11295a1.m42433Z0());
            C12225g.m45329g(m1314a());
            C12225g.m45328f(new C5142t());
            C12225g.m45330h(new C12481c());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1316c(Context context) {
        C11295a1.m42455i0(context, new C6099d(context).m26996a(context));
    }
}
