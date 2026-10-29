package k1;

import g0.r1;
import n0.g3;
import n0.h3;
import n0.i3;
import n0.k3;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile k3 f22017a;

    static {
        i3.b().c(q0.c.b(), new x2.a() { // from class: k1.b
            @Override // x2.a
            public final void accept(Object obj) {
                c.a((h3) obj);
            }
        });
    }

    public static /* synthetic */ void a(h3 h3Var) {
        f22017a = new k3(d.a(h3Var));
        r1.a("DeviceQuirks", "video DeviceQuirks = " + k3.d(f22017a));
    }

    public static <T extends g3> T b(Class<T> cls) {
        return (T) f22017a.b(cls);
    }

    public static k3 c() {
        return f22017a;
    }
}
